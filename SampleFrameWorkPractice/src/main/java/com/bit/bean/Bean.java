package com.bit.bean;

public class Bean 
{
	private String userId;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String password;
	public int ssn;
	
	private int getSSNValue()
	{
		ssn=1234556;
		System.out.println(ssn);
		return ssn;
	}
	

}
