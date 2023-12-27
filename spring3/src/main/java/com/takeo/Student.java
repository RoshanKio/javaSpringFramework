package com.takeo;

public class Student {
	
	public Student() {
		System.out.println("Student class......constructor");
	}
	
	private MathCheat mathCheat;
	private int id;
	
	public MathCheat getMathCheat() {
		return mathCheat;
	}
	
	public void setMathCheat(MathCheat mathCheat) {
		this.mathCheat = mathCheat;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

}
