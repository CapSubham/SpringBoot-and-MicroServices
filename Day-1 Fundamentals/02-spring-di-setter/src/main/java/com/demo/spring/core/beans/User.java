package com.demo.spring.core.beans;

public class User {
	
	private String firstName;
	private String lastName;
	private Car car;
	
	//has a relationship > user has car
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLatName(String lastName) {
		this.lastName = lastName;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	

}
