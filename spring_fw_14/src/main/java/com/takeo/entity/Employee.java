package com.takeo.entity;

public class Employee {
	private int eno;
	private String ename;
	
	static int em;
	
	public Employee() {
		System.out.println((++em)+")Employee COnstructor executed....................");
	}
	
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	@Override
	public String toString() {
		return "[Employee no = "+eno+", name = "+ename+"]";
	}

}
