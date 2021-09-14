package com.ums.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ums.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
