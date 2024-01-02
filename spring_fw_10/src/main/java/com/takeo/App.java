package com.takeo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.takeo.entity.College;
import com.takeo.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BeanFactory factory = new ClassPathXmlApplicationContext("/spring.xml");
        System.out.println("Just Instantiated the IOC Container class, ClassPathXmlApplicationContext class object............");
        
        Student student = (Student)factory.getBean("student");
        College college = (College)factory.getBean("college");
        System.out.println(student+"\n"+college);
        
    }
}
