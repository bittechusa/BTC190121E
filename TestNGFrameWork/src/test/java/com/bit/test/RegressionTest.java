package com.bit.test;

import org.testng.annotations.Test;

public class RegressionTest extends BaseTest{

	@Test(groups="smoke")
	  public void m1() 
	  {
		  System.out.println("test2");
	  }
	@Test(groups= {"smoke","reg"})
	  public void m2() 
	  {
		  System.out.println("test3");
	  }
}
