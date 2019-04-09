package com.bit.test;

import java.io.IOException;
import java.util.Properties;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.bit.util.Utility;

public class BaseTest 
{
	WebDriver driver;
	@Before
	public void getDriver() throws IOException
	{

		
		Properties prop=Utility.readPropertyFile("/Users/bittechconsulting/eclipse-workspace/new/SampleMavenFramework_BTC190121E/src/main/resources/files/config.properties");
		String browser=prop.getProperty("browser");
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.out.println("chrome browser opened");
			System.setProperty("webdriver.chrome.driver", "/Users/bittechconsulting/Downloads/chromedriver");
			 driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "/Users/bittechconsulting/Downloads/geckodriver");
			 driver=new FirefoxDriver();
			System.out.println("firefox browser opened");
		}
		driver.get(prop.getProperty("url"));
	}
	@After
	public void closeBrowser()
	{
		driver.quit();
	}

}
