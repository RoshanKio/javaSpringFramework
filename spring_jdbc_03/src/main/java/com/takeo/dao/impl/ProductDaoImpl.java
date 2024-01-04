package com.takeo.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.takeo.dao.ProductDao;
import com.takeo.entity.Product;

@Repository//Optional
public class ProductDaoImpl implements ProductDao{
	
	
		@Autowired
		private JdbcTemplate jt;
	
	
	
		//CRUD:
	
		//1)Create:
		public int saveProduct(Product product) {
			return jt.update("INSERT INTO product(name, price, quantity) values(?, ?, ?)", product.getName(), product.getPrice(), product.getQuantity());
		}
		
		
		//2)Retrieve:
		
		public String getName(long id) {
			return jt.queryForObject("SELECT name from product where id=?", new Object[] {Long.valueOf(id)}, String.class);
		}
		
		public double getPrice(long id) {
			return jt.queryForObject("SELECT price FROM product where id=?", new Object[] {Long.valueOf(id)}, Double.class);
		}
		
		public long getQuantity(long id) {
			return jt.queryForObject("SELECT quantity FROM product where id=?", new Object[] {Long.valueOf(id)}, Long.class);
		}
		
		public Product getProductById(long id) {
			return jt.queryForObject("SELECT * FROM product WHERE id=?", new Object[] {Long.valueOf(id)}, new BeanPropertyRowMapper<>(Product.class));
		}
		
		public List<Product> getProducts() {
			return jt.query("SELECT * from product", new BeanPropertyRowMapper<>(Product.class));
		}
		
		public Map getEmployeeDetails(long id) {
			return jt.queryForMap("SELECT * FROM product WHERE id=?", Long.valueOf(id));
		}
		
		//3)Update:
		public int updateProduct(Product product) {
			return jt.update("UPDATE product SET name='"+product.getName()+"', price="+product.getPrice()+", quantity="+product.getQuantity()+" WHERE id="+product.getId());
		}
		
		
		//4)Delete:
		public int deleteProductById(long id) {
			return jt.update("DELETE FROM product WHERE id=?", id);
		}
		
		public int deleteAllProducts() {
			return jt.update("DELETE FROM product");
		}

}
