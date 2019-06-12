package com.bit.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.WebElement;

public class ListPractice {
	public ArrayList getData()
	{
		ArrayList<Integer> ar=new ArrayList();
		ArrayList ar1=new ArrayList();
		ar.add(6);
		ar1.add("hi");
		ar.add(9);
		ar.add(12);
		for(Integer a:ar)
		{
			ar1.add(a);
			System.out.println(a);
		}
		ar1.addAll(ar);
		return ar1;
	}
	
	public ArrayList ActValue(List<WebElement> elements) {
		ArrayList acar=new ArrayList(elements.size());
		for(WebElement element:elements)
		{
			String text=element.getText();
			acar.add(text);
			
		}
		return acar;
		
	}
	
	public void compare(ArrayList ex,ArrayList ac)
	{
		Iterator it=ex.iterator();
		Iterator it1=ac.iterator();
		while(it.hasNext()&&it1.hasNext())
		{
			if(it.next().equals(it1.next()))
			{
				System.out.println("matched");
			}
		}
	}
	
	@Test
	public void test1()
	{
		List<WebElement> elements = null;
		ArrayList ar=getData();
		ArrayList ar1=ActValue(elements);
		
		compare(ar,ar1);
	}

}
