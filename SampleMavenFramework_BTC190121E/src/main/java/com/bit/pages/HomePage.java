package com.bit.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bit.util.Utility;

public class HomePage 
{
	WebDriver driver;
	public HomePage(WebDriver x)
	{
		driver=x;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath=".//*[@id='twotabsearchtextbox']") WebElement searchBox;
	@FindBy(xpath=".//*[@id='nav-search']/form/div[2]/div/input") WebElement searchButton;
	public void searchKids()
	{
		Utility.type(searchBox, "kids");
	}
	public void searchElectronics()
	{
		Utility.type(searchBox, "electronic");
	}
	
	public KidsPage clickOnSearchButton()
	{
		Utility.click(searchButton);
		return new KidsPage(driver);
	}
	public MenPage clickOnMen()
	{
		Utility.click(searchButton);
		return new MenPage(driver);
	}

}
