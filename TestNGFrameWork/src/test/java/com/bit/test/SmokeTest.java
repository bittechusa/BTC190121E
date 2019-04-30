package com.bit.test;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.TestBase;

public class SmokeTest extends TestBase
{
//	@Test(groups="reg")
//	  public void m3() 
//	  {
//		  System.out.println("test4");
//	  }
	@Test(groups="smoke")
	  public void m1() 
	  {
		Reporter.log("nevigate to url");
		driver.get("http://www.facebook.com");
		  System.out.println("test2");
	  }

}
