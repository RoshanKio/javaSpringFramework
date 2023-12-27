package com.takeo;

//Singleton logic
public class Car {
	private static Car c = new Car();
	
	private Car() {
		
	}
	
	public static Car getInstance() {
		return c;
	}

}
