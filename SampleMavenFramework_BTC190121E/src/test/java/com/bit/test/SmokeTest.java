package com.bit.test;

import java.io.IOException;

import org.junit.Test;

import com.bit.pages.HomePage;
import com.bit.pages.KidsPage;
import com.bit.pages.ProductDetailPage;
import com.bit.util.Utility;

public class SmokeTest extends BaseTest
{
	@Test
	public void test1() throws IOException
	{
		HomePage homePage=new HomePage(driver);
		homePage.searchKids();
		KidsPage kidPage=homePage.clickOnSearchButton();
		ProductDetailPage pd=kidPage.clickOnFirstKidsProduct();
		
	}
	@Test
	public void test2() throws IOException
	{
		HomePage homePage=new HomePage(driver);
		homePage.searchElectronics();
		homePage.clickOnSearchButton();
		
		
	}
	

}
