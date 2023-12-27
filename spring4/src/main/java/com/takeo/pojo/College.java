package com.takeo.pojo;

import java.util.Set;

public class College {
	
	public College() {
		System.out.println("College class.....constructor");
	}
	
	private String name;
	private Set students;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set getStudents() {
		return students;
	}
	public void setStudents(Set students) {
		this.students = students;
	}
	
	@Override
	public String toString() {
		return "College's name is "+name+" ,.. Student : \n"+students;
	}

}