package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CottonPage {

	WebDriver driver;
	public CottonPage(WebDriver x)
	{
		driver=x;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="") WebElement firstProd;
	public PDPage clickFProd()
	{
		firstProd.click();
		return new PDPage(driver);
	}
}
