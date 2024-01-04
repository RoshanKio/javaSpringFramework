package com.takeo.dao;

import java.util.List;
import java.util.Map;

import com.takeo.entity.Employee;

public interface EmployeeDao {
	//CRUD:
	
	//1)Create:
	int saveEmployee(Employee employee);
	
	//2)Retrieve:
	String getEname(int eno);
	double getSalary(int eno);
	Employee getEmployeeById(int eno);
	List<Employee> getEmployees();
	Map getEmployeeDetails(int eno);
	
	//3)Update:
	int updateEmployee(Employee employee);
	
	//4)Delete
	int deleteEmployeeById(int eno);
	int deleteAllEmployees();
	
	
	
	
	

}
