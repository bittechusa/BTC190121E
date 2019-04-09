package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PDPage {
	WebDriver driver;
	public PDPage(WebDriver x)
	{
		driver=x;
		PageFactory.initElements(driver, this);
	}
}
