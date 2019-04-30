package com;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestBase {
 
	protected WebDriver driver;
	  @Parameters({"browser"})
	  @BeforeMethod
	  public void beforeMethod(String b) 
	  {
		  if(b.equals("chrome"))
		  {
			  driver=new ChromeDriver();
		  }
		  else if(b.equals("firefox"))
		  {
			  driver=new FirefoxDriver();
		  }
		  System.out.println("bm");
	  }
	  @AfterMethod
	  public void close(ITestResult r)
	  {
		  if(r.getStatus()==ITestResult.FAILURE)
		  {
			  System.out.println("take screenshot");
		  }

		  else if(r.getStatus()==ITestResult.SKIP)
		  {
			  System.out.println("skipped");
		  }

		  if(r.getStatus()==ITestResult.SUCCESS)
		  {
			  System.out.println("success");
		  }
		  driver.quit();
	  }

}
