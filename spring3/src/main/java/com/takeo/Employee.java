package com.takeo;

public class Employee {
	
	public Employee() {
		System.out.println("Employee class....constructor");
	}
	
	private String city;
	
	private String design;
	
	private double salary;
	
	public String getCity () {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getDesign() {
		return design;
	}
	public void setDesign(String design) {
		this.design = design;
	}
	
	public double getSalary () {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void hi() {
		System.out.println("Hi from Employee class object with city = "+city+", design = "+design+", salary = "+salary);
	}
	
	

}
