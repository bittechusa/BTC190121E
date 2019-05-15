package com.bit.utility;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


import com.google.common.io.Files;

public class SeleniumHelper 
{
	WebDriver dr;
	WebElement ele;
	public void handleDropDownMenu()
	{
		Select s=new Select(ele);
		s.selectByIndex(0);
		s.selectByValue("Jan");
		s.selectByVisibleText("March");
		s.getFirstSelectedOption();
		int n=s.getOptions().size();
		for(int i=0;i<=n;i++) {
			s.selectByIndex(i);
		}
		
	}
	public void mouseHandling()
	{
		Actions a=new Actions(dr);
		a.contextClick();//right click
		String pwin=dr.getWindowHandle();
		a.contextClick(ele).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();//clicked on second option from right clicked
		Set<String> cwin=dr.getWindowHandles();
		for(String win:cwin)
		{
			if(!win.equals(pwin))
			{
				dr.switchTo().window(win);
			}
		}//multiple window handle
		a.moveToElement(ele).build().perform();//hover over
		a.clickAndHold(ele);
		a.dragAndDrop(ele, ele).build().perform();//drag and drop
		a.dragAndDropBy(ele, 0, 100).perform();
		a.doubleClick();
		
	}
	
	public void alertHandle()
	{
		Alert a=dr.switchTo().alert();
		a.accept();
		a.dismiss();
		a.getText();
		a.sendKeys("jgj");
	}
	
	public void handleFrame(String frameName)
	{
		dr.switchTo().frame(0);
		dr.switchTo().frame("framename");
		List<WebElement> elements=dr.findElements(By.tagName("iframe"));
		for(WebElement ele:elements)
		{
			if(ele.getAttribute("id").equals(frameName))
			{
				dr.switchTo().frame(frameName);
			}
		}
		dr.switchTo().defaultContent();
		dr.switchTo().parentFrame();
		
	}
	
	public void takSreenShot() throws IOException
	{
		File f=((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File("path of the file"));
	}
	public void scrollDown() throws IOException
	{
		Coordinates c=((Locatable)ele).getCoordinates();
		c.inViewPort();
		//or
		JavascriptExecutor j=(JavascriptExecutor)dr; 
		j.executeScript("window.scrollBy(0,5000)");
		j.executeScript("arguments[0].click()",dr.findElement(By.id("")));
		j.executeScript("document.getElementById('email').value=('Avinash Mishra');");
	}
	
	public void cookieHandle()
	{
		Set<Cookie> cookies=dr.manage().getCookies();
		dr.manage().getCookieNamed("");
		for(Cookie cookie:cookies)
		{
			cookie.getName();
		}
	}
	public void nevigateToMethod()
	{
		dr.navigate().refresh();
		dr.navigate().to("http://www.facebook.com");
		dr.navigate().forward();
	}
	public void keyBoaedHandle()
	{
		Keyboard k=((HasInputDevices)dr).getKeyboard();
		k.sendKeys(Keys.chord(Keys.COMMAND,Keys.SHIFT),"p");
		
	}
	
	public WebElement waitForElement(By by)
	{
		
		
		
		WebDriverWait w=new WebDriverWait(dr,10);
		w.until(ExpectedConditions.elementToBeClickable(by));
		return dr.findElement(by);
	}
	
	public void click(By ele) {
		waitForElement(ele).click();;
	}
	
	public void fluentWaitHandle()
{
//		Wait wait = new FluentWait(dr)    
//			    .withTimeout(30, TimeUnit.SECONDS)    
//			    .pollingEvery(5, TimeUnit.SECONDS)   
//			    .ignoring(NoSuchElementException.class);
//
//		
//		wait.until(new Function()
//			public WebElement apply(WebDriver  dr) {
//				return dr.findElement(By.xpath("hfg"));
//			}});
	}
	
	public void elemeHandle()
	{
		dr.findElement(By.id("")).findElement(By.xpath("")).click();//one inside one element
		dr.findElement(By.id("")).clear();//click(),sendkeys().isSelected(),isEnabled().isDisplayed(),getText()//getAttribute()
		//getTagName(),getCSSValue(),getLocation(),submit(),getSize
		
		dr.close();
		dr.quit();
		dr.findElement(By.id(""));
		List<WebElement> elements=dr.findElements(By.xpath(""));
		elements.size();
		WebElement ele=elements.get(0);
		dr.getPageSource();
		dr.getCurrentUrl();
		dr.getTitle();
		dr.getWindowHandles();
		dr.manage();
		dr.navigate();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
