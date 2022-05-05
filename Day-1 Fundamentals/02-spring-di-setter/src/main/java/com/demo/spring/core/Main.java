package com.demo.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.spring.core.beans.Car;
import com.demo.spring.core.beans.User;

public class Main {

	public static void main(String[] args) {
		// Initialize Spring Container

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("user-beans.xml");

		User user1 = (User) applicationContext.getBean("user1");
		System.out.println(user1.getFirstName() + " " + user1.getLastName() + " owns an ---> ");
		System.out.println(user1.getCar().getModel() + ", worth INR " + user1.getCar().getCost());
		System.out.println("--------------------------------------------------------------------");

		User user2 = (User) applicationContext.getBean("user2");
		System.out.println(user2.getFirstName() + " " + user2.getLastName() + " owns a ---> ");
		Car car = user2.getCar();
		System.out.println(car.getModel() + ", worth INR " + car.getCost());
	}

}
