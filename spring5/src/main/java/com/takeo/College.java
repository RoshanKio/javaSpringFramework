package com.takeo;

public class College {
	
	private String name;
	private Student student;
	
	public College(Student student) {
		this.student = student;
	}
	/*
	private College() {
		
	}
	*/
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Student getStudent() {
		return student;
	}
 	public void setStudent(Student student) {
 		this.student = student;
 	}
 	
 	@Override
 	public String toString() {
 		return "[College name: "+name+", student : "+student+"]";
 	}
	

}
