package com.takeo;

public class Student {
	
	static int i;
	
	private Student() {
		System.out.println((++i)+" th Student constructor ...........");
	}
	
	private int sno;
	private String sname;
	
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