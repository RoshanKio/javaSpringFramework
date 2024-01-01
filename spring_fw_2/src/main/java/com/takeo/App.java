package com.takeo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BeanFactory factory = new ClassPathXmlApplicationContext("resources/spring.xml");
        Student student = (Student)factory.getBean("std");
        System.out.println(student);
    }
}
