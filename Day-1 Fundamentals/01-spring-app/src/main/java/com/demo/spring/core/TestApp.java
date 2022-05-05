package com.demo.spring.core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.spring.core.beans.User;

public class TestApp {

	public static void main(String[] args) {
//		 Initialize Spring Container
//		 1st Method -> BeanFactory
//		 2nd Method -> ApplicationContext

		// BeanFactory beanFactroy = new ClassPathXmlApplicationContext("beans.xml");

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

		int beanCount = applicationContext.getBeanDefinitionCount();
		System.out.println("Number of Beans with spring container = " + beanCount);
		System.out.println("------------------------------------------------------------------");

		String[] beanNames = applicationContext.getBeanDefinitionNames();
		for (String string : beanNames) {
			System.out.println(string);
		}
		System.out.println("------------------------------------------------------------------");

		User user1 = (User) applicationContext.getBean("user1");
		System.out.println(user1);
		System.out.println("------------------------------------------------------------------");
		
		User user2 = applicationContext.getBean("user4", User.class);
		System.out.println(user2.getFirstName() + " " + user2.getLastName());
		System.out.println("------------------------------------------------------------------");
		
		User user3 = (User) applicationContext.getBean("user1");
		System.out.println(user1);
		System.out.println("------------------------------------------------------------------");
		
		User user4 = (User) applicationContext.getBean("user1");
		System.out.println(user1);
		System.out.println("------------------------------------------------------------------");
		
		System.out.println(user1.hashCode());
		System.out.println(user3.hashCode());
		System.out.println(user4.hashCode());
	}

}
