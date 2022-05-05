package com.demo.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.spring.core.beans.Address;
import com.demo.spring.core.beans.Employee;

public class Main {

	public static void main(String[] args) {
		// Initialize the Spring Container
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("employee-beans.xml");

		// Employee employee = (Employee) applicationContext.getBean("emp-1");

		/*
		 * After we do Aliasing in the beans.xml file > we can refer here by the alias
		 * name instead of bean name. Here the name of bean is "emp-1" and the name of
		 * alias is "Employee-1-alias" -----------------------------------------------
		 * Bean Name --> emp-1 , Alias name --> Employee-1-alias
		 */

		Employee employee = (Employee) applicationContext.getBean("Employee-1-alias");

		System.out.println("Employee ID : " + employee.getEmpId());
		System.out.println("Employee Name : " + employee.getEmpName());

		Address address = employee.getEmpAddress();
		System.out.println("Address : " + address.getStreet() + ", " + address.getCity() + ", " + address.getState());
	}

}
