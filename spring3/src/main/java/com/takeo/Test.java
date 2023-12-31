package com.takeo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String ...tts) {
		BeanFactory factory = new ClassPathXmlApplicationContext("resources/spring.xml");
		System.out.println("Instantiated the IOC Container");
		
		Employee emp = new Employee();
		emp.hi();
		
		((Employee)factory.getBean("abstractEmp")).hi();
	}

}
