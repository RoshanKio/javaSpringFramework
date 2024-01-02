package com.takeo.entity;

public class College {
	private String name;
	private Student student;
	
	static int c;
	
	private College() {
		System.out.println((++c)+")Executing the College class Constructor ..................");
	}
	
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
		return "[College name= "+name+", Student = "+student+"]";
	}
	

}
