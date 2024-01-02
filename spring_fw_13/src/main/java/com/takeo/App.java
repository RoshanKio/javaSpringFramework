package com.takeo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.takeo.config.MyConfig;
import com.takeo.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext cntxt = new AnnotationConfigApplicationContext(MyConfig.class);
        System.out.println("Just Instantiated the IOC Container class, AnnotationConfigApplicationContext...........");
        
        Student student1 = cntxt.getBean(Student.class);
        student1.setNo(1);
        student1.setName("Krishna");
        Student student2 = cntxt.getBean(Student.class);
        student2.setNo(2);
        student2.setName("Ram");
        System.out.println("student1 : "+student1+"\n"+"student2 : "+student2);
        System.out.println("student1==student2 : "+(student1==student2));
    }
}