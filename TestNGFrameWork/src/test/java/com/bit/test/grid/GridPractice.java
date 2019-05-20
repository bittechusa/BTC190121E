package com.bit.test.grid;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GridPractice {
	WebDriver dr;
	@Test
	public void grid1() throws MalformedURLException
	{
		DesiredCapabilities d=DesiredCapabilities.chrome();
		
		WebDriver dr=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), d);
		dr.get("https://www.facebook.com");
		
	}
	@Test
	public void grid2() throws MalformedURLException
	{
		
		dr.get("https://www.facebook.com");
		
	}
	@Test
	public void grid3() throws MalformedURLException
	{
		
		dr.get("https://www.facebook.com");
		
	}
	@Parameters({"browser","runmode"})
	@BeforeMethod
	
	public void start(String b, String r) throws MalformedURLException{
		if (b.equals("chrome")) {
			if (r.equals("local")) {
				dr=new ChromeDriver();
				
			}
			else if(r.equals("remote")) {
				DesiredCapabilities d=DesiredCapabilities.chrome();
				
				dr=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), d);
				
			}
		}
		else if (b.equals("firefox")) {
			
			if (r.equals("local")) {
				System.out.println("firefox local");
				dr=new FirefoxDriver();
				
				
			}
			else if(r.equals("remote")) {
				System.out.println("firefox remote");
				DesiredCapabilities d=DesiredCapabilities.firefox();
				
				dr=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), d);
				
			}
		}
		
		
	}
	
	
	

}
