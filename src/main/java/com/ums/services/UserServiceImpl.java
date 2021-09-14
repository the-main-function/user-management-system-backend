package com.ums.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ums.entities.User;
import com.ums.repos.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User addUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public List<User> getUserByCategoryName(String categoryName) {
		return userRepository.findAllByCategoryName(categoryName);
	}

	@Override
	public List<User> getUserByKeyword(String keyword) {
		return userRepository.findAllByNameContaining(keyword);
	}

	@Override
	public void removeUser(int id) {
		userRepository.deleteById(id);
	}
	
	
}
