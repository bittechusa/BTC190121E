package com.bit.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MenPage {

	WebDriver driver;
	public MenPage(WebDriver x)
	{
		driver=x;
		PageFactory.initElements(driver, this);
	}
}
