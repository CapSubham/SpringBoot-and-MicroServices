package com.demo.spring.core;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.spring.core.beans.Department;
import com.demo.spring.core.beans.Hospital;

public class Main {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext
				("hospital-beans.xml");

		Hospital hospital = (Hospital) applicationContext.getBean("Apollo");
		System.out.println("Hospital Name : " + hospital.getHospitalName());

		System.out.print("Departments : ");
		List<String> hospitalDept = hospital.getHospitalDepartments();
		for (String string : hospitalDept) {
			System.out.print(string + " | ");
		}

		System.out.println();
		System.out.println("-------------------------------------------------------------------");

		Department department = (Department) applicationContext.getBean("departments");
		List<String> deptartmentList = department.getDepartmentNames();
		System.out.println(deptartmentList);
	}

}
