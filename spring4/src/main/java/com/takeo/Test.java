package com.takeo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.takeo.pojo.College;
import com.takeo.pojo.Student;

public class Test {
	public static void main(String ... tts) {
		BeanFactory factory = new ClassPathXmlApplicationContext("resources/spring.xml");
		System.out.println("Instantiated the IOC container, ClassPathXmlApplicationContext(c)");
		
		Student stu = (Student)factory.getBean("stu");
		Student stu1 = (Student)factory.getBean("stu1");
		Student stu2 = (Student)factory.getBean("stu2");
		Student stu3 = (Student)factory.getBean("stu3");
		Student stu4 = (Student)factory.getBean("stu4");
		College clg = (College)factory.getBean("clg");
		System.out.println(stu);
		System.out.println(stu1);
		System.out.println(stu2);
		System.out.println(stu3);
		System.out.println(stu4);
		System.out.println(clg);
		
	}

}
