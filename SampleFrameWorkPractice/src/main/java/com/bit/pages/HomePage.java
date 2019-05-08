package com.bit.pages;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.bit.TestDataRepo.TestRepo;
import com.bit.Utility.SeleniumHelper;
import com.bit.readProp.ReadFile;

public class HomePage extends SeleniumHelper
{
	public WebDriver driver;
	Properties prop;
	public HomePage(WebDriver x) throws IOException
	{
		driver=x;
		ReadFile.resdPropFile("/Users/bittechconsulting/eclipse-workspace/new/SampleFrameWorkPractice/element.properties");
	}
	public void typeOnSearchBox()
	{
		
		type(driver.findElement(By.xpath(prop.getProperty("searchbox"))),TestRepo.textValue);
	}

}
