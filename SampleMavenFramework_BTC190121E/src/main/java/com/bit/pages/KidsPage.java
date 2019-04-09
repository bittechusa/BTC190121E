package com.bit.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bit.util.Utility;

public class KidsPage {

	WebDriver driver;
	public KidsPage(WebDriver x)
	{
		driver=x;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath=".//*[@id='pdagDesktopSparkle']/div/div[1]/div[1]/a/div/div/img") WebElement firstKidProduct;
	//@FindBy(xpath=".//*[@id='nav-search']/form/div[2]/div/input") WebElement searchButton;
	
	public ProductDetailPage clickOnFirstKidsProduct()
	{
		Utility.click(firstKidProduct);
		return new ProductDetailPage();
	}
	
}
