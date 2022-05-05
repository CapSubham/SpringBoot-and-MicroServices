package com.demo.spring.core.beans;

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

	public void myInit1() {
		System.out.println("---### User-Defined Initialization 1 ###---");
	}

	public void myInit2() {
		System.out.println("---### User-Defined Initialization 2 ###---");
	}

	public void myDestructor() {
		System.out.println("---@@@ User-Defined Destructor 1 @@@---");
	}

}
