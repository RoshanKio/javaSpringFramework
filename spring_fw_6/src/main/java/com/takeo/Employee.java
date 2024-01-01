package com.takeo;

public class Employee {
	
	private String empAddress;
	private String empName; 
	
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	@Override
	public String toString() {
		return "[Employee name = "+empName+", address = "+empAddress+"]";
	}

}
