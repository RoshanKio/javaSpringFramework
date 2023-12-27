package com.takeo.pojo;

public class Student {
	
	static int count;
	
	private String firstName;
	private String lastName;
	
	public Student() {
		System.out.println("Student class....constructor executed "+(++count)+" time.....");
	}
	
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {
		return "Students's name s "+firstName+" "+lastName;
	}
}
