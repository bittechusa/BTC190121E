package com.statement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedLoop 
{
	WebDriver driver;
	@Test
	public void test1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "/Users/bittechconsulting/Downloads/chromedriver");
		 driver=new ChromeDriver();
		 driver.get("http://www.eshopper24.com");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		 //while example in selenium
		 while(driver.findElement(By.xpath(".//*[@id='search']/div[1]/div[2]/div/span[7]/div/div/div/ul/li[7]")).isEnabled())
		 {
			 driver.findElement(By.xpath(".//*[@id='search']/div[1]/div[2]/div/span[7]/div/div/div/ul/li[7]")).click();
		 }
		 
		 
		 
		 
		 
		
		 //click by text
		 List<WebElement> menuElements=driver.findElements(By.xpath("html/body/div[9]/div[2]/div/div[1]/div[1]/ul/li/a"));
		 for(WebElement ele:menuElements)
		 {
			 if(ele.getText().equals("CottonSaree"))
			 {
				 ele.click();
			 }
		 }
		 
		 
		 
		 
		 
		 //get all text from link
		 List<WebElement> elements=driver.findElements(By.tagName("a"));
		 System.out.println(elements.size());
		 for(WebElement ele:elements)
		 {
			 ele.getText();
		 }
		 
		 
		 
		 
		 
		 
		 //nested loop
		 int menuSize=driver.findElements(By.xpath("html/body/div[9]/div[2]/div/div[1]/div[1]/ul/li/a")).size();
		 for(int i=1;i<=menuSize;i++)
		 {
			 driver.findElement(By.xpath("html/body/div[9]/div[2]/div/div[1]/div[1]/ul/li["+i+"]/a")).click();
			 Thread.sleep(2000);
			 int prodSize=driver.findElements(By.xpath("html/body/div[9]/div[4]/div[6]/div[1]/div/div[2]/div[3]/div[1]/div/div/div[1]/a/img")).size();
			 for(int j=1;j<3;j++)
			 {
				 driver.findElement(By.xpath("html/body/div[9]/div[4]/div[6]/div[1]/div/div[2]/div[3]/div[1]/div["+j+"]/div/div[1]/a/img")).click();
				 Thread.sleep(2000);
				 driver.navigate().back();
				 Thread.sleep(2000);
			 }
			 Thread.sleep(2000);
			 driver.navigate().back();
		 }
	}

}
