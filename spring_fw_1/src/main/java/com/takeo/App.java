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
        BeanFactory factory = new ClassPathXmlApplicationContext("/resources/spring.xml");
        Hello hello = (Hello)factory.getBean("hello");
      
        System.out.println(hello.getMessage());
    
    }
}
