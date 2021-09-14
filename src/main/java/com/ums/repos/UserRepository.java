package com.ums.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ums.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	public List<User> findAllByCategoryName(String categoryName);
	public List<User> findAllByNameContaining(String keyword);
}
