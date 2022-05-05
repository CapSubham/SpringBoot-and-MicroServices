package com.demo.spring.core.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * 
 * @author subham
 *
 */
public class User implements InitializingBean, DisposableBean {

	/*
	 * InitializingBean, DisposableBean comes with predefined methods thus we don't
	 * need to configure it with xml
	 */

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

	public void destroy() throws Exception {
		System.out.println("--- User defined Destructor ---");

	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("--- Inside afterPropertiesSet() method ---");

	}

}
