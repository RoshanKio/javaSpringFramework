package com.takeo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.takeo.dao.impl.EmployeeDaoImpl;
import com.takeo.entity.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
	DriverManagerDataSource A;
    public static void main( String[] args )
    {
        ApplicationContext cntxt = new ClassPathXmlApplicationContext("/resources/spring.xml");
        EmployeeDaoImpl empDao = (EmployeeDaoImpl)cntxt.getBean("empDao");
        
        //CRUD:
        
        //1)Create:
        //System.out.println(empDao.saveEmployee(new Employee("Mahesh", 90000)));
        
        //2)Retrieve:
        //System.out.println(empDao.getEname(18));//getEname(int eno)
        //System.out.println(empDao.getSalary(10));
        //System.out.println(empDao.getEmployeeById(10));
        //System.out.println(empDao.getEmployees());
        System.out.println(empDao.getEmployeeDetails(20));//Gives Exception
        
        //3)Update
        //System.out.println(empDao.updateEmployee(new Employee(10, "Rois", 100000)));
        
        
        //4)Delete:
        //System.out.println(empDao.deleteEmployeeById(19));
        //System.out.println(empDao.deleteAllEmployees());
        
        
        
        
        
        System.out.println("\n\nAll the Rows in the table employee:\n===================================\n"+empDao.getEmployees());
        
        
    }
}
