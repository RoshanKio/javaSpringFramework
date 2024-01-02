package com.takeo.pojo;

public class Student {
	private int sno;
	private String sname;
	
	static int s;
	
	private Student() {
		System.out.println((++s)+"th Student Object ...............");
	}
	
	
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	
	public String getSname() {
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
