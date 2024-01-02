package com.takeo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.takeo.entity.College;

public class App1 {
	
	static public void main(String []tts) {
		BeanFactory factory = new ClassPathXmlApplicationContext("/spring1.xml");
		System.out.println("Just Instantiated the IOC Container class, CLassPathXmlApplicationCOntext............");
		
		College col = (College)factory.getBean("col");
		System.out.println(col);
		
	}

}
