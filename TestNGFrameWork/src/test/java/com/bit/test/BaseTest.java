package com.bit.test;

import org.testng.annotations.Test;

import com.ReadData;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.util.Properties;

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
Properties prop;
WebDriver driver;
  @BeforeTest
  public void beforeTest() throws IOException 
  {
	  System.out.println("bt");
	  prop=ReadData.readProperty();
	  //String b=prop.getProperty("browser");
	  String b=System.getProperty("driver");
	 // String b=System.getProperty("runMode");
	  if(b.equals("chrome"))
	  {
		  driver=new ChromeDriver();
	  }
	  else if(b.equals("firefox"))
	  {
		  driver=new FirefoxDriver();
	  }
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
