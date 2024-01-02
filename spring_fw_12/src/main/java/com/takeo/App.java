package com.takeo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.takeo.entity.College;
import com.takeo.entity.Employee;


public class App 
{
    public static void main( String[] args )
    {
        BeanFactory factory = new ClassPathXmlApplicationContext("/spring.xml");
        System.out.println("Just instantiated The IOC Container class, ClassPathXmlApplicationContext.............");
        
        
        Employee emp1 = (Employee)factory.getBean("emp1");
        College col = (College)factory.getBean("col");
        System.out.println(emp1+"\n"+col);
    }
}
