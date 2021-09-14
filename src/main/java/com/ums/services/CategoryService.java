package com.ums.services;

import java.util.List;

import com.ums.entities.Category;

public interface CategoryService {
	public Category addCategory(Category category);
	public List<Category> getAllCategories();
}
