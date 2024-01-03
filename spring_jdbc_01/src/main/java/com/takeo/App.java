package com.takeo;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.mysql.jdbc.Driver;
import com.takeo.dao.impl.EmployeeDaoImpl;
import com.takeo.entity.Employee;

/**
 * Hello world!
 *
 */
public class App {

	Employee employee;

	public static void main(String[] args) {
		BeanFactory cntxt = new ClassPathXmlApplicationContext("/spring.xml");
		EmployeeDaoImpl empDao = (EmployeeDaoImpl) cntxt.getBean("empDao");

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Please Enter 1 for Create Operation.......");
			System.out.println("Please Enter 2 for Retrieve Operation.....");
			System.out.println("Please Enter 3 for Update Operation........");
			System.out.println("Please Enter 4 for Delete Operation........");
			int i = sc.nextInt();

			switch (i) {

			case 1:
				System.out.print("Please Enter the Employee Name...");
				String ename = sc.nextLine();
				System.out.print("Please Enter the Employee Salary......");
				double salary = sc.nextDouble();

				Employee emp = new Employee(ename, salary);

				int j = empDao.saveEmployee(emp);
				System.out.println("j = " + j);
				if (j != 0) {
					System.out.println("Successfully, inserted a row into the table................");
				} else {
					System.out.println("Sorry, Unable to insert data into the employee table................");
				}
				break;

			case 2:

				break;

			case 3:
				System.out.print("Please Enter the Employee Number...");
				int eno1 = sc.nextInt();
				
				System.out.print("Please Enter the Employee Name...");
				String ename1 = sc.next();
				
				System.out.print("Please Enter the Employee Salary......");
				double salary1 = sc.nextDouble();
				
				

				int k = empDao.updateEmployee(new Employee(eno1, ename1, salary1));
				System.out.println("k = " + k);
				if (k != 0) {
					System.out.println("Successful in updating........");
				} else {
					System.out.println("Sorry, unable to update......");
				}

				break;
				
			case 4 :
				System.out.print("Please y is you want to delete all the rows in employee table, else press any other key");
				String str = sc.next();
				if(str.equals("y")) {
					int l1 = empDao.deleteAllEmployees();
					if(l1!=0) {
						System.out.println("Successful in delete all the entries..............");
					}
					else {
						System.out.println("Sorry, unable to delete all the entries............");
					}
				}
				else {
					System.out.print("please enter the Employee number of the Employee, to be deleted....");
					int eno2 = sc.nextInt();
					int l2 = empDao.deleteEmployeeById(eno2);
					if(l2!=0)
						System.out.println("Successful in deleting the selected entry.........");
					else
						System.out.println("Sorry, Unhsuccessful in deleting the selected entry........");
					
				}
				break;

			default:
				System.out.println("Please enter either 1, or 2, or, 3 or 4");
				break;

			}

		}
		
		

	}
}