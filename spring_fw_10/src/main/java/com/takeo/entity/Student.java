package com.takeo.entity;

public class Student {
	private int sno;
	private String sname;
	
	static int s;
	
	private Student() {
		System.out.println((++s)+")Executing the Student class Constructor ..............");
	}
	
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	
	public String getSnama() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	@Override
	public String toString() {
		return "[Student sno = "+sno+", sname = "+sname+"]";
	}

}
