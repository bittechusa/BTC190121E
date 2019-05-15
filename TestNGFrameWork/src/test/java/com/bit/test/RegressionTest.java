package com.bit.test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.ReadData;
import com.TestBase;
import com.bit.weListner.MyListner;

public class RegressionTest extends TestBase{
//
//	 @Test(dataProviderClass=ReadData.class,dataProvider = "login",groups="smoke")
//	  public void fjhg(Integer n, String s) 
//	  {
//		  System.out.println(n+"+"+s);
//		  
//	  }
//	@Test(groups="smoke")
//	  public void m1() 
//	  {
	
//		driver.get("http://www.facebook.com");
//		  System.out.println("test2");
//	  }
	@Test(groups= {"smoke","reg"})
	  public void m2() 
	  {
		Reporter.log("nevigate to url");
		driver.get("http://www.google.com");
		  System.out.println("test3");
		  Assert.fail();
	  }
	
	@Test
	public void test4()
	{
		MyListner ml=new MyListner();
	EventFiringWebDriver f=new EventFiringWebDriver(driver);
	f.register(ml);
	f.findElement(By.id(""));
	f.navigate().back();
	}
	
	
	
	
	
}
