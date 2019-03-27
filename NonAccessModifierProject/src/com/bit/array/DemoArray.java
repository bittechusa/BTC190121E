package com.bit.array;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoArray 
{
	@Test
	public void paly()
	{
		//What is array
		int b[]= {6,9,7,4,4,89,411};
		int max=b[0];
		for(int i=1;i<b.length;i++)
		{
			if(b[i]>max)
			{
				max=b[i];
			}
		}
		System.out.println(max);
		
		
		for(int i=0;i<b.length;i++)
		{
			for(int j=i+1;j<b.length;j++)
			{
				if(b[i]==b[j])
				{
					System.out.println(b[i]+" is duplicate");
				}
			}
			
		}
		
		
		
		int a[]=new int[b.length];
		a=b.clone();
//		a[0]=7;
//		a[1]=65;
//		a[2]=78;
		
		
//		for(int i=0;i<b.length;i++)
//		{
//			System.out.println(b[i]);
//		}
		
		int z[]=copyArray(b);
		for(int c:z)
		{
			System.out.println(c);
		}
		
//		WebDriver dr=new ChromeDriver();
//		dr.get("http://www.eshopper24.com");
//		String [] texts=copyArray(dr.findElements(By.xpath("html/body/div[9]/div[2]/div/div[1]/div[1]/ul/li/a")));
//		for(String d:texts)
//		{
//			System.out.println(d);
//		}
		
	}
	
	public int[] copyArray(int [] x)
	{
		int y[]= new int[x.length];
		for(int i=0;i<x.length;i++)
		{
			y[i]=x[i];
		}
		return y;
	}
	
	public String[] copyArray(List<WebElement> elements)
	{
		String y[]= new String[elements.size()];
		int i=0;
		for(WebElement ele:elements)
		{
			String value=ele.getText();
			y[i]=value;
			i++;
			
		}
		return y;
	}
	public void mt()
	{
	int [][] v=new int [3][2];
	v[0][0]=9;
	v[0][1]=19;
	v[1][0]=29;
	v[1][1]=9;
	v[2][0]=9;
	v[2][1]=69;
	for(int i=0;i<v.length;i++)
	{
		for(int j=0;j<v[i].length;j++)
		{
		System.out.println(v[i][j]);
		}
	}
	}
	
	
	
	
	
	
	//homework:
	//how to find 2nd highest number
	//how to get sum of 1 to 10
	//how to find factorial value
	//from given array if u add two number which value =500
	//return that two number
	
	
	
	
	

}
