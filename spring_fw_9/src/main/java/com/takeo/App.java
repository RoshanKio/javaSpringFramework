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
        BeanFactory factory = new ClassPathXmlApplicationContext("/beans.xml");
        System.out.println("Right after Instantiating the IOC Container, ClassPathXmlApplicationContext(c)........................");
        
        //SpringBean sb1 = (SpringBean)factory.getBean("sb1");
        SpringBean sb2 = (SpringBean)factory.getBean("sb2");
    }
}
