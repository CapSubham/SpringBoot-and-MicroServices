package com.springboot.validation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "name", nullable = false)
	
	//user name should not be empty & have at least 5 characters
	
	@NotEmpty (message = "user name can not be empty")
	@Size(min=5, message= "user name should have at least 5 characters")
	private String name;
	
	@NotEmpty (message = "user email can not be empty")
	@Email(message = "In-correct email format")
	private String email;
	
	@NotEmpty
	@Size(min=8 , message = "should have 8 characters")
	private String password;

	public User(String name, String email, String password) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
	}

}
