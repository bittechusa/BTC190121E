package com.bit.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

import org.junit.Test;

class A implements Comparable, Comparator{

//	public int compareTo(Object o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

	public int compare(Object o1, Object o2) {
		int i=o1.toString().length();
		int i2=o2.toString().length();
		if(i>i2)
		{
			return -1;
		}
		else if(i<i2)
		{
			return 1;
		}
		else
			return 0;
		
	}

public int compareTo(Object o) {
	// TODO Auto-generated method stub
	return 0;
}
	
}





public class SetPractice {

	@Test
	public void m1()
	{
		HashSet<Integer> hs=new HashSet();
		ArrayList<Integer> ar=new ArrayList();
		
		
		
		
		ArrayList<String> ar1=new ArrayList();
		ar1.add("cat");
		ar1.add("chicken");
		ar1.add("tiger");
		Collections.sort(ar1, new A());
		Iterator it3=ar1.iterator();
		while(it3.hasNext())
		{
			System.out.println(it3.next());
		}
		
		
		Collections.sort(ar1);
		ar.add(65);
		ar.add(6);
		ar.add(9);
		ar.add(12);
		for(Integer a:ar)
		{
			if(hs.add(a)==false)
			{
				System.out.println(a +" is duplicate");
			}
		}
		
	}
	
	@Test
	public void m2()
	{
		Vector<Integer> v=new Vector();
		v.add(5);
		v.add(6);
		Enumeration e=v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		
		Iterator i=v.iterator();
		while(i.hasNext())
		{
			Integer i1=(Integer)i.next();
			if(i1%2==0)
			{
				i.remove();
			}
		}
		ListIterator li=v.listIterator();
		//forward
		while(li.hasNext())
		{
			li.next();
			li.nextIndex();
		}
		//backward
		
		while(li.hasPrevious())
		{
			li.previous();
			li.previousIndex();
		}
		
		//other
		//add();
		//remove()
		//set()
		
		
		//Comparator and Comparable interface
		
		
		
		
		
		
	}
	
}
