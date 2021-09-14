package com.ums.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Table(name="categories")
@Data
public class Category {
	
	@Id
	@GeneratedValue
	@Column(name="category_id")
	private int categoryId;
	
	@Column(nullable = false)
	private String name;
	
	@JsonIgnore
	@OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
	private List<User> users;
}
