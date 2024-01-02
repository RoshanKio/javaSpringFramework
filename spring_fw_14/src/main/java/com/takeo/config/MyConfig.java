package com.takeo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.takeo.entity.College;
import com.takeo.entity.Employee;

@Configuration
public class MyConfig {
	
	@Bean
	@Scope("prototype")
	public Employee getEmployee() {
		Employee emp = new Employee();
		emp.setEno(101);
		emp.setEname("Krishna");
		return emp;
	}
	
	
	@Bean
	public College getCollege() {
		College college = new College();
		college.setName("BCC College");
		return college;
	}

}
