package com.springrest.springrest.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
	
	@Id
	private Long id;
	private String titel;
	private String description;
	public Course() {
		super();
	}
	public Course(Long id, String titel, String description) {
		super();
		this.id = id;
		this.titel = titel;
		this.description = description;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitel() {
		return titel;
	}
	public void setTitel(String titel) {
		this.titel = titel;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Course [id=" + id + ", titel=" + titel + ", description=" + description + "]";
	}
	
	

}
