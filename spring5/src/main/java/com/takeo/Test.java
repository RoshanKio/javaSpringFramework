package com.takeo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String ...tts) {
		
		BeanFactory factory = new ClassPathXmlApplicationContext("resources/spring.xml");
		System.out.println("Instantiated the IOC Container, ClassPathXmlApplicationCOntext(C)");
		
		Student student = (Student)factory.getBean("sb");
		College college = (College)factory.getBean("clg");
		College college1 = (College)factory.getBean("clg1");
		College college2 = (College)factory.getBean("clg2");
		
		System.out.println(student);
		System.out.println(college);;
		System.out.println(college1);;
		System.out.println(college2);;;;
		
	}

}
