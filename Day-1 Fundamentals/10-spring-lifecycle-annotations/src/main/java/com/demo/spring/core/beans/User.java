package com.demo.spring.core.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class User {

	private String firstName;
	private String lastName;

	public User() {
		super();
		System.out.println("--- Zero Argument Constructor ---");

	}

	public User(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("--- Two Argument Constructor ---");
	}

	public String getFirstName() {
		System.out.println("--- Inside getFirstName() method ---");
		return firstName;

	}

	public void setFirstName(String firstName) {
		System.out.println("--- Inside setFirstName() method ---");
		this.firstName = firstName;
	}

	public String getLastName() {
		System.out.println("--- Inside getLastName() method ---");
		return lastName;
	}

	public void setLastName(String lastName) {
		System.out.println("--- Inside setLastName() method ---");
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "User [firstName= " + firstName + ", lastName= " + lastName + "]";
	}

	/*
	 * In annotation we need to include another dependency called
	 * javax.annotation-api
	 */
	@PostConstruct
	public void myInit() {
		System.out.println("---### User-Defined Initialization  ###---");
	}

	@PreDestroy
	public void myDestructor() {
		System.out.println("---@@@ User-Defined Destructor @@@---");
	}

}
