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
        BeanFactory factory = new ClassPathXmlApplicationContext("/config.xml");
        System.out.println("Just instantiated the IOC Container, ClassPathXmlApplicationContext(c)..........");
        
        PrototypeSpringBean bean1 = (PrototypeSpringBean)factory.getBean("myBean");
        PrototypeSpringBean bean2 = (PrototypeSpringBean)factory.getBean("myBean");
        PrototypeSpringBean bean3 = (PrototypeSpringBean)factory.getBean("myBean");
        PrototypeSpringBean bean4 = (PrototypeSpringBean)factory.getBean("myBean");
        boolean flag = bean1==bean2 | bean2==bean3 || bean3==bean4;
        System.out.println("Are all 4 spring beans, the same?\nAns:"+flag);
        
        
    }
}
