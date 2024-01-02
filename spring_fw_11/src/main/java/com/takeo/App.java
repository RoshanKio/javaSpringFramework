package com.takeo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.takeo.pojo.College;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BeanFactory factory = new ClassPathXmlApplicationContext("/spring.xml");
        System.out.println("Just instantiated the IOC container class ClassPathXmlApplicationContext..................");
        
        College col = (College)factory.getBean("col");
        System.out.println(col);
        
    }
}
