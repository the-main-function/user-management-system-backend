package com.ums.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="users")
@Data
public class User {
	
	@Id
	@GeneratedValue
	@Column(name="user_id")
	private int userId;
	
	@Column(nullable = false)
	private String name;
	
	@Column(unique = true, nullable = false)
	private String email;
	
	@ManyToOne
	@JoinColumn(name="category_id", nullable = false)
	private Category category;
	
}
