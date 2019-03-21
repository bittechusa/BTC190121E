package com.statement;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.WebElementHandler;

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
	
	
	@Test
	public void test2()
	{
		m1(1);
	}
	
	public void m1(String age)
	{
		switch(age)
		{
		case "1":
			
		{
			System.out.println("baby cry");
			break;
		}
		case "2":
		{
			System.out.println("baby start walkin");
			break;
		}
		case "3":
		{
			System.out.println("baby running");
			break;
		}
		default:
			System.out.println("baby over 3 years");
		}
		
	}
	public void m2()
	{
	//loop
	int a=7;
	while(a<8)
	{
		System.out.println("true");
		a++;
	}
	
	do {
		System.out.println("hi");
	}while(7>8);
	
	
	//for loop
	for(int i=1;i<3;i++)
	{
		System.out.println(i);
		for(int j=i+1;j<4;j++)
		{
			System.out.println(j);
		}
	}//1,2,3,2,3
	
	List<WebElement> elements=dr.findElements(By.xpath(""));
	for(WebElement ele:elements)
	{
		ele.getText();
	}
	
	
	}
	public void clickOnelement(List<WebElement> elements,int i)
	{
		elements.get(i).click();
	}
	public void clickOnelement(List<WebElement> elements,String text)
	{
		for(WebElement ele:elements)
		{
			if(ele.getText().equals(text))
			{
				ele.click();
			}
		}
	}
	
	public void clickOnelement(List<WebElement> elements)
	{
		int i=0;
		elements.get(i).click();
		i++;
	}
	public void clickOnelements()
	{
		int size=dr.findElements(By.xpath("html/body/div[9]/div[2]/div/div[1]/div[1]/ul/li/a")).size();
		for(int i=1;i<=size;i++)
		{
			dr.findElement(By.xpath("html/body/div[9]/div[2]/div/div[1]/div[1]/ul/li["+i+"]/a")).click();
			
			dr.navigate().back();
		}
	}
	public void nestedLoop()
	{
		int size=dr.findElements(By.xpath("html/body/div[9]/div[2]/div/div[1]/div[1]/ul/li/a")).size();
		for(int i=1;i<=size;i++)
		{
			dr.findElement(By.xpath("html/body/div[9]/div[2]/div/div[1]/div[1]/ul/li["+i+"]/a")).click();
			//int prodSize=dr.findElements(By.xpath("html/body/div[9]/div[4]/div[6]/div[1]/div/div[2]/div[3]/div[1]/div/div/div[2]")).size();
			for(int j=1;j<=3;j++)
			{
				dr.findElement(By.xpath("html/body/div[9]/div[4]/div[6]/div[1]/div/div[2]/div[3]/div[1]/div["+j+"]/div/div[2]")).click();
				dr.navigate().back();
			}
			dr.navigate().back();
		}
	}
	
	
	
	
	
	
	
	
	
	
	public void add(String fname,String lname)
	{
		//my first name is awal and last name is hosen
		System.out.println("my name is "+fname+" and last name is"+lname);
			
		
	}
	
	WebDriver dr=null;
	
	
	
	
}
