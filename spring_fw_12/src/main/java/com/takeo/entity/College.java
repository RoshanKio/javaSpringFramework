package com.takeo.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class College {
	
	private String name;
	
	//@Qualifier("emp1")
	@Autowired
	private Employee employee;
	
	static int c;
	
	private College() {
		System.out.println((++c)+") Instantiating College Class.........");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "[College name = "+name+", employee = "+employee+"]";
	}

}
