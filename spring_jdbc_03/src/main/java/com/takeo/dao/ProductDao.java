package com.takeo.dao;

import java.util.List;
import java.util.Map;

import com.takeo.entity.Product;

public interface ProductDao {
	
	//CRUD:
	
	//1)Create:
	int saveProduct(Product product);
	
	
	//2)Retrieve:
	String getName(long id);
	double getPrice(long id);
	long getQuantity(long id);
	Product getProductById(long eno);
	List<Product> getProducts();
	Map getEmployeeDetails(long eno);
	
	//3)Update:
	int updateProduct(Product product);
	
	
	//4)Delete:
	int deleteProductById(long id);
	int deleteAllProducts();
	
	

}
