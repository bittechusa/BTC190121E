package com.bit.constant;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JavaScriptHandle
{
	WebDriver driver;
	JavascriptExecutor j=(JavascriptExecutor)driver;
	public void test5()
	{
		j.executeScript("window.scrollTo(500, 0)");
		j.executeScript("argument[0].click()", driver.findElement(By.xpath("gm")))
	}

}
