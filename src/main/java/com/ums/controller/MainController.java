package com.ums.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ums.entities.Category;
import com.ums.entities.User;
import com.ums.services.CategoryService;
import com.ums.services.UserService;

@RestController
@RequestMapping("/api")
public class MainController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private CategoryService categoryService;
	
	@PostMapping("/user")
	public ResponseEntity<User> addUser(@RequestBody User user) {
		userService.addUser(user);
		return ResponseEntity.ok().build();
	}
	
	@GetMapping("/users")
	public ResponseEntity<List<User>> viewAllUsers(){
		return ResponseEntity.ok(userService.getAllUsers());
	}
	
	@GetMapping("/users/with-category/{categoryName}")
	public ResponseEntity<List<User>> viewUsersByCategory(@PathVariable("categoryName")String categoryName){
		return ResponseEntity.ok(userService.getUserByCategoryName(categoryName));
	}
	
	@GetMapping("/users/search/{keyword}")
	public ResponseEntity<List<User>> viewUsersByKeyword(@PathVariable("keyword")String keyword){
		return ResponseEntity.ok(userService.getUserByKeyword(keyword));
	}
	
	@DeleteMapping("/user/delete/{id}")
	public ResponseEntity<Void> deleteUser(@PathVariable("id")int userId){
		userService.removeUser(userId);
		return ResponseEntity.noContent().build();
	}
	
	@PostMapping("/category")
	public ResponseEntity<Category> addCategory(@RequestBody Category category){
		categoryService.addCategory(category);
		return ResponseEntity.ok().build();
	}
	
	@GetMapping("/categories")
	public ResponseEntity<List<Category>> viewAllCategories(){
		return ResponseEntity.ok(categoryService.getAllCategories());
	} 
}
