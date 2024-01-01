package com.takeo;

import java.util.List;

public class InstituteBean {
	
	private String name;	
	private List<String> facultyNames;
	private List<String> courseNames;
	
	String str;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public List<String> getFacultyNames() {
		return facultyNames;
	}
	public void setFacultyNames(List<String> facultyNames) {
		this.facultyNames = facultyNames;
	}
	
	public List<String> getCourseNames() {
		return courseNames;
	}
	public void setCourseNames(List<String> courseNames) {
		this.courseNames = courseNames;
	}
	
	public void concatFaculty() {
		str = name+"\nFaculty Names : \n===========\n";
		for(String s : facultyNames) {
			str=str+s+"\n";
			
		}
	}
	
	public void concatCourse() {
		str = str+"\nCourse Names : \n==========\n";
		for(String s : courseNames) {
			str=str+s+"\n";
		}
	}
	
	
	@Override
	public String toString() {
		concatFaculty();
		concatCourse();
		return str;
	}
	
	

}
