package com.takeo;

public class PrototypeSpringBean {
	static int i;
	
	private PrototypeSpringBean() {
		System.out.println("Executed the PrototypeSpringBean constructor for "+(++i)+"th time ...........");
	}

}
