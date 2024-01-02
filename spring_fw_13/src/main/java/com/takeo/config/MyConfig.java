package com.takeo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.takeo.entity.Student;

@Configuration
public class MyConfig {
	
	@Bean
	@Scope("prototype")
	public Student getStudent() {
		return new Student();
	}

}
