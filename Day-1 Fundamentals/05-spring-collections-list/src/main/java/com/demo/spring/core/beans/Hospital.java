package com.demo.spring.core.beans;

import java.util.List;

public class Hospital {

	private String hospitalName;
	private List<String> hospitalDepartments;

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public List<String> getHospitalDepartments() {
		return hospitalDepartments;
	}

	public void setHospitalDepartments(List<String> hospitalDepartments) {
		this.hospitalDepartments = hospitalDepartments;
	}

}
