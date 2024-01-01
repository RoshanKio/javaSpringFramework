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
        BeanFactory factory = new ClassPathXmlApplicationContext("/spring.xml");
        System.out.println("Just Instantiated the IOC COntainer, ClassPathXmlApplicationContext");
        Student stu1 = (Student)factory.getBean("stu1");
        Student stu2 = (Student)factory.getBean("stu2");
        Student stu3 = (Student)factory.getBean("stu3");
        Student stu4 = (Student)factory.getBean("stu4");
        
        College clg = (College)factory.getBean("clg");
        
        System.out.println(clg);
        
        System.out.println(clg.getStudents().getClass().getName());
    }
}
