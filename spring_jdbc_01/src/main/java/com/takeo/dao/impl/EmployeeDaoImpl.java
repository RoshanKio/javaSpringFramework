package com.takeo.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.takeo.dao.EmployeeDao;
import com.takeo.entity.Employee;


@Repository//Optional
public class EmployeeDaoImpl implements EmployeeDao{
	
	@Autowired
	private JdbcTemplate jt;
	
	
	
	//CRUD:

	//1)Create:
	@Override
	public int saveEmployee(Employee employee) {
		//INSERT INTO Customers (CustomerName, City, Country) VALUES ('Cardinal', 'Stavanger', 'Norway');
		//INSERt INTO Employee (eno, ename, esalary) vAluEs(5, 'Narayan', 100500)
		return jt.update("INSERt INTO Employee (ename, salary) vAluEs('"+employee.getEname()+"',"+employee.getSalary()+")");
	}

	//2)Retrieve
	@Override
	public Employee getEmployeeById(int eno) {
		return jt.queryForObject("Select * from employee where eno=?", new Object[] {Integer.valueOf(eno)}, new BeanPropertyRowMapper<>(Employee.class));
	}

	@Override
	public List<Employee> getAllEmployees() {
		return jt.query("select * from employee", new BeanPropertyRowMapper<>(Employee.class));
	}

	//3)Update:
	@Override
	public int updateEmployee(Employee employee) {
		
		return jt.update("UPDATE EMPLOYEE SET ename='"+employee.getEname()+"', salary="+employee.getSalary()+" where eno="+employee.getEno());
	}

	//4)Delete:
	@Override
	public int deleteEmployeeById(int eno) {
		//delete from employee where eno="+eno+"
		return jt.update("delete from employee where eno="+eno);
	}

	@Override
	public int deleteAllEmployees() {
		return jt.update("DELETE FROM employee");
		
	}

}
