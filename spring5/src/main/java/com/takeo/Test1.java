package com.takeo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
	public static void main(String tts[]) {
		BeanFactory factory = new ClassPathXmlApplicationContext("resources/spring1.xml");
		System.out.println("Instantiated the IOC COntainer, ClassPathXmlApplicationContext(c)");
		College clg = (College)factory.getBean("clg");
		System.out.println(clg);
	}
}
