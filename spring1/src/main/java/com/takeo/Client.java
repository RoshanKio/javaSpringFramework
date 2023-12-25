package com.takeo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {
	public static void main(String... tts) {
		//Find xml
		Resource r = new ClassPathResource("resources/spring.xml");
		//Load xml into Container
		BeanFactory factory = new ClassPathXmlApplicationContext("resources/spring.xml");
		
		System.out.println("After instantiating BeanFactory IOC Container");
		
		//Create Test class Objects
		Test t = (Test)factory.getBean("t");
		Test t1 = (Test)factory.getBean("t");
		Test t2 = (Test)factory.getBean("t");
		Test t3 = (Test)factory.getBean("t");
		
		System.out.println("t.hello() : ");
		t.hello();
		System.out.println();
		System.out.println("t==t1 : "+(t==t1));
		System.out.println("t==t2 : "+(t==t2));
		System.out.println("t==t3 : "+(t==t3));
		
	}
}
