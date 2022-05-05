package com.demo.spring.core.beans;

import java.util.Set;

public class Hospital {

	private String hospitalName;
	private Set<String> hospitalDepartments;

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public Set<String> getHospitalDepartments() {
		return hospitalDepartments;
	}

	public void setHospitalDepartments(Set<String> hospitalDepartments) {
		this.hospitalDepartments = hospitalDepartments;
	}

}
