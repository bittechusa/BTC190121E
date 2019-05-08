package com.bit.ui.test;

import org.testng.annotations.Test;

import com.bit.Utility.SeleniumHelper;
import com.bit.bean.Bean;
import com.bit.commonfunction.BMW;
import com.bit.commonfunction.Car;
import com.bit.commonfunction.Tesla;
import com.bit.constant.Day;
import com.bit.constant.TestCase;
import com.bit.pages.HomePage;

public class IntegrationTest {
	

	@Test
	public void test1()
	{
//		HomePage h=new HomePage(driver);
//		h.typeOnSearchBox();
	}
	
	public void getEnumvalue(Day d)
	{
	
		Day[] days=Day.values();
		for(Day day:days)
		{
			if(day.equals(d))
			{
			System.out.println(day);
			}
	}
	@Test
	public void test2()
	{
		
		getEnumvalue(Day.Saturday);
		
		
		System.out.println(Day.Monday);
//		Car []c=new Car[2];
//		c[0]=new BMW();
//		c[1]=new Tesla();
//		for(int i=0;i<c.length;i++)
//		{
//			c[i].move();
//		}
//		
//		BMW b=new BMW();
//		b.move();
//		Tesla t=new Tesla();
//		t.move();
//		
		
		
		
//		SeleniumHelper s=new SeleniumHelper();
//		Bean b=new Bean();
//		b.setUserId("user1");
//		b.setPassword("pass234");
//		System.out.println(b.getUserId()+"+"+b.getPassword());
//		Bean b1=new Bean();
//		b1.setUserId("user2");
//		b1.setPassword("pass23423");
//		System.out.println(b1.getUserId()+"+"+b1.getPassword());
//		//System.out.println(b.getSSNValue());
	}
}
