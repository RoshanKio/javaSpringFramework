package com.takeo;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.takeo.dao.impl.ProductDaoImpl;
import com.takeo.entity.Product;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext cntxt = new ClassPathXmlApplicationContext("resources/spring.xml");
        ProductDaoImpl productDao = (ProductDaoImpl)cntxt.getBean("productDao");
        
      //CRUD:
    	
        
    	//1)Create:
    	//productDao.saveProduct(new Product("HDMI cable", 10.99, 146l));
    	
    	
    	//2)Retrieve:
    	//System.out.println(productDao.getName(10));
    	//System.out.println(productDao.getPrice(10));
    	//System.out.println(productDao.getQuantity(10));
        //System.out.println(productDao.getProductById(10));
        //System.out.println(productDao.getProducts());   	
    	//System.out.println(productDao.getEmployeeDetails(10));
        
        
    	
    	//3)Update:
    	  
        //System.out.println(productDao.updateProduct(new Product(11, "Mouse cable", 3.99, 400)));
        
        
    	
    	
    	//4)Delete:
        
        //System.out.println(productDao.deleteProductById(11));
    	System.out.println(productDao.deleteAllProducts());
    	
        
        System.out.println("\n\n\n\nAll Products:\n=======\n"+productDao.getProducts());
    }
}
