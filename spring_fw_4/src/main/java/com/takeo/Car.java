package com.takeo;


//Singleton Logic
public class Car {
	
	private Car() {
		
	}
	
	private static Car car = new Car();
	
	public static Car getInstance() {
		return car;
	}

}
