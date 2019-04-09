package com.bit.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;

public class Utility 
{
	public static void type(WebElement element, String text)
	{
		element.clear();
		element.sendKeys(text);
	}
	public static void click(WebElement element)
	{
		System.out.println("clicked");
		element.click();
	}
	public static Properties readPropertyFile(String path) throws IOException
	{
		FileInputStream f=new FileInputStream(new File(path));
		Properties prop=new Properties();
		prop.load(f);
		return prop;
	}

}
