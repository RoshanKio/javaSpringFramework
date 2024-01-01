package com.takeo;

public class Account {
	
	static int i;
	
	private int accNo;
	private String accName;
	
	private Account() {
		
	}
	
	public Account(int accNo, String accName) {
		this.accNo = accNo;
		this.accName = accName;
		System.out.println("Account class constructor cexecuted for "+(++i)+"th time....");
	}
	
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	
	@Override
	public String toString() {
		return "[Account accNo = "+accNo+", accName = "+accName+"]";
	}

}
