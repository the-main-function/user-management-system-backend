package com.ums.services;

import java.util.List;

import com.ums.entities.User;

public interface UserService {
	
	public User addUser(User user);
	public List<User> getAllUsers();
	public List<User> getUserByCategoryName(String categoryName);
	public List<User> getUserByKeyword(String keyword);
	public void removeUser(int id);
}
