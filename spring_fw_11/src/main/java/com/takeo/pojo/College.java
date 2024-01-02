package com.takeo.pojo;

public class College {
	private String name;
	private Student stud;
	
	static int c;
	
	public void setName(String name) {
		this.name = name;
	}
	
	private College(Student stud) {
		super();
		this.stud = stud;
		System.out.println((++c)+"th College object ................");
	}
	
	@Override
	public String toString() {
		return "[College name = "+name+", Student = "+stud+"]";
	}
}

