package com.takeo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String ... tts) {
		BeanFactory factory = new ClassPathXmlApplicationContext("resources/spring.xml");
		System.out.println("After instantiating the IOC Container...");
		
		Singleton s = (Singleton)factory.getBean("s");
		Singleton s1 = (Singleton)factory.getBean("s");
		Prototype1 p1 = (Prototype1)factory.getBean("p1");
		Prototype1 p11 = (Prototype1)factory.getBean("p1");
		Prototype2 p2 = (Prototype2)factory.getBean("p2");
		Prototype2 p21 = (Prototype2)factory.getBean("p2");
		
		System.out.println("===========hi() method calls:======================");
		s.hi();
		p1.hi();
		p2.hi();
	}

}
