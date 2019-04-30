package com.bit.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BaseTest {
 

  @AfterMethod(alwaysRun=true)
  public void afterMethod() 
  {
	  System.out.println("am");
  }

  @BeforeClass(groups="backend")
  public void beforeClass() 
  {
	  System.out.println("bc");
  }

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("ac");
  }

  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("bt");
  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("at");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("bs");
  }

  @AfterSuite
  public void afterSuite() 
  {
	  System.out.println("as");
  }

}
