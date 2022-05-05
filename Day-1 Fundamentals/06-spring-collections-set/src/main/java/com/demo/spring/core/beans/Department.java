package com.demo.spring.core.beans;

import java.util.Set;

public class Department {
	private Set<String> departmentNames;

	public Set<String> getDepartmentNames() {
		return departmentNames;
	}

	public void setDepartmentNames(Set<String> departmentNames) {
		this.departmentNames = departmentNames;
	}

}
