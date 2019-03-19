package com;

public abstract  class A //in class label static ,protected and private not possible
{//if class is final this called immutable class and u cannot inherit
	//abstract class cannot be instantiate(object creation)
	static class B{}//nested class ,in class label static protected and private possible
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
	public static void test1()//static method cannot be overriden ,static method can not take non static property
	{//static cannot take non static
		
		//static int f=9; is not possible
		//b++; non static
		a++;
		System.out.println(a);
		a++;
		System.out.println(a);
	}
	public final void m1()//cannot be overriden
	{
		
	}
	public abstract void m2();//cannot have body
	
	int b=6;
	//nonaccess modifier will change the attribute of variable method and class
	//name of some nonaccess modifier
	//static final abstrct transient volatile
	
	transient int d=8;//cannot be serialized means it cannot be compressed
	volatile int f=9;//it will be syncronized mean multitreading
	static int a=6;//it became class variable,,it will not go back to initialize value means 
	//it works with change value ,call by className
	
	final int c=7;//it become constant variable means cannot be changed
	//abstract int k=8; is not possible
	

}
//static class C{} source class cannot take static
