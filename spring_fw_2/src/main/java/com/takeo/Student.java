package com.takeo;

public class Student {
	
	private int sNo;	
	private String sName;
	private String sAddress;
	
	public int getSNo() {
		return sNo;
	}
	
	public void setSNo(int sNo) {
		this.sNo = sNo;
	}
	
	public String getSName() {
		return sName;
	}
	public void setSName(String sName) {
		this.sName = sName;
	}
	
	public String getSAddress() {
		return sAddress;
	}
	public void setSAddress(String sAddress) {
		this.sAddress = sAddress;
	}
	
	public String toString() {
		return "[Student sNo = "+sNo+", sName = "+sName+", sAddress = "+sAddress+"]";
	}
	
	

}
