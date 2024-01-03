package com.takeo.entity;

public class Employee {
	
	private int eno;
	private String ename;
	private double salary;
	
	private Employee() {
		
	}
	
	public Employee(String ename, double salary) {
		this.ename = ename;
		this.salary = salary;
	}
	
	public Employee(int eno, String ename, double salary) {
		this.eno = eno;
		this.ename = ename;
		this.salary = salary;
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
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "[Employee eno = "+eno+", ename = "+ename+", salary = "+salary+"]";
	}
	

}
