package com.takeo;

import java.util.Set;

public class College {
	
	static int j;
	
	private College() {
		System.out.println((++j)+"th College Constructor ...........");
	}
	
	private String name;
	private Set<Student> students;
	
	String str;
	
	public String getName() {
		return name;
	}	
	public void setName(String name) {
		this.name = name;
	}
	
	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	
	@Override
	public String toString() {
		str=name+":\n==============\n==============\nStudents:\n====================\n";
		
		students.stream().forEach(s->str=str+s+"\n");
		
		return str;
	}
	
	

}
