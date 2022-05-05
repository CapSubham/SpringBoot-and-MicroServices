package com.demo.spring.core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.spring.core.beans.User;

public class TestApp {

	public static void main(String[] args) {
//		 Initialize Spring Container

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		
		

		System.out.println("------------------------------------------------------------------");

		//((ConfigurableApplicationContext) applicationContext).close();
		//((AbstractApplicationContext) applicationContext).close();

		((AbstractApplicationContext) applicationContext).registerShutdownHook();
		
		/*
		 * applicationContext can not be closed so we TypeCast using
		 * (ConfigurableApplicationContext) OR (AbstractApplicationContext) to close it
		 */
	}

}
