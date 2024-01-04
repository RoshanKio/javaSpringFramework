package com.takeo.entity;

public class Product {
	private long id;
	private String name;
	private double price;
	private long quantity;
	
	public Product() {
		
	}
	
	public Product(String name, double price, long quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(long id, String name, double price, long quantity) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "[Product id="+id+", name="+name+", price="+price+", quantity="+quantity+"]";
	}

}
