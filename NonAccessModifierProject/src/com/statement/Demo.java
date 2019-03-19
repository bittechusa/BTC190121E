package com.statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Demo 
{
	public void test3()
	{
		WebDriver dr=null;
	//single statement
	if(dr.findElement(By.xpath("")).isDisplayed())
	{
		System.out.println("true");
	}else
	{
		System.out.println("false");
	}

	//multiple statement statement
		if(dr.findElement(By.xpath("")).getText().equals("cotton saree"))
		{
			System.out.println("true");
		}else if(dr.getTitle().contains("shahid"))
		{
			System.out.println("false");
		}
		else
		{
			System.out.println("default");
		}
		
		
		
		
		
		
	}
	/*//opereator
	equals----> ==
	not equal---> !=
	greater than equal--> >=
	less than equal--> <=
	and---> &&
	or---> ||
	module(reminder)---> %*/
	//lets say there is number is visible by 3 and 5 and 10
	public void test5(int number)
	{
		if(number%3==0 && number%5==0 && number%10==0)
		{
			System.out.println(number);
		}
		else
		{
			System.out.println("not valid number");
		}
	}
	
}
