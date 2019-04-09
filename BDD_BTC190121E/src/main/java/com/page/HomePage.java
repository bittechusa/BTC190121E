package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.util.Share;

public class HomePage 
{
	WebDriver driver;
	public HomePage(WebDriver x)
	{
		driver=x;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="") WebElement cootonMenu;
	public CottonPage clickMenu()
	{
		Share.click(cootonMenu);
		//cootonMenu.click();
		return new CottonPage(driver);
	}

}
