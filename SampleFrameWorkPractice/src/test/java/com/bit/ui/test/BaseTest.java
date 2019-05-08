package com.bit.ui.test;

import org.testng.annotations.Test;

import com.bit.readProp.ReadFile;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BaseTest {
  WebDriver driver;
  @BeforeMethod
  public void beforeMethod() {
	 String b= prop.getProperty("browser");
	 if(b.equals("chrome"))
	  {
		  driver=new ChromeDriver();
	  }
	  else if(b.equals("firefox"))
	  {
		  driver=new FirefoxDriver();
	  }
	 driver.get(prop.getProperty("url"));
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
	  driver.quit();
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass(ITestResult r) {
	  
  }
Properties prop;
  @BeforeTest
  public void beforeTest() throws IOException {
	  prop=ReadFile.resdPropFile("/Users/bittechconsulting/eclipse-workspace/new/SampleFrameWorkPractice/config.properties");
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
