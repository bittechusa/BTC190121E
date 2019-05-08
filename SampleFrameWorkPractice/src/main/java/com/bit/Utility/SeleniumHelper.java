package com.bit.Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.bit.commonfunction.TrollyCar;

public class SeleniumHelper extends TrollyCar{
	public SeleniumHelper() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void type(WebDriver driver,By by,String text)
	{
		driver.findElement(by).sendKeys(text);
		//super.move();
	}
	public void type(WebElement element,String text)
	{
		element.sendKeys(text);
	}
	@Override
	public void openDoor() {
		// TODO Auto-generated method stub
		
	}

}
