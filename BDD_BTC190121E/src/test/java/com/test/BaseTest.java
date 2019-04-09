package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.page.HomePage;

public class BaseTest 
{
	WebDriver driver;
	public HomePage openBrowser()
	{
		System.out.println("chrome browser opened");
		System.setProperty("webdriver.chrome.driver", "/Users/bittechconsulting/Downloads/chromedriver");
		 driver=new ChromeDriver();
		 driver.get("http://www.eshopper24.com");
		 return new HomePage(driver);
	}

}
