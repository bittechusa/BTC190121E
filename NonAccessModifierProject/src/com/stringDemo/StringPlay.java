package com.stringDemo;

import org.junit.Test;

public class StringPlay 
{
	StringBuffer s=new StringBuffer("how are you");
	String s6=new String("how are you");
	String s7=new String("how are you");
	String s1="how are you";
	String s5="how are you";
	@Test
	public void playWithStringMethod()
	{
		String s2=s1.concat(" doing");
		System.out.println(s1);
		System.out.println(s2);
		
		StringBuffer s3=s.append(" doing");
		System.out.println(s);
		System.out.println(s3);
		
		s1.length();
		System.out.println(s1.substring(3, 7));
		s1.substring(7);
		s1.charAt(0);
		int g=s1.indexOf('o');
		s1.indexOf('o', g+1);
		
		System.out.println("ink".compareTo("ink"));
		s1.endsWith("you");
		System.out.println(s1.equals(s5));
		System.out.println(s1==s5);
		System.out.println(s6.equals(s7));
		System.out.println(s6==s7);
		int h=s6.hashCode();
		int h1=s7.hashCode();
		System.out.println(h==h1);
		char c[]=s1.toCharArray();
		s1.startsWith("how");
		s1.isEmpty();
		int r=s1.lastIndexOf('o');
		s1.lastIndexOf('o', r-1);
		s1.replace(" ", "");
		String d[]=s1.split(" ");
		for(int i=0;i<d.length-1;i++)
		{
			System.out.println(d[i]);
		}
		for(String c1:d)
		{
			System.out.println(c1);
		}
		
		s1.trim();
		s1.toUpperCase();
		s1.toLowerCase();
		String v=String.valueOf(s);
		String.join(",", "hi","whats uo");
		
		//how to reverse a string
		StringBuffer b=new StringBuffer();
		char [] x=s1.toCharArray();
		for(int i=x.length-1;i>=0;i--)
		{
			b.append(x[i]);
			
		}
		System.out.println(b);
		
		//reverse a string by word
		StringBuffer b1=new StringBuffer();
		String words[]=s1.split(" ");
		for(int i=words.length-1;i>=0;i--)
		{
			b1.append(words[i]).append(" ");
		}
		System.out.println(b1.toString().trim());
		
		
		StringBuffer s=new StringBuffer("how are you");
		s.reverse();
		String f=s.toString();
		StringBuilder sb=new StringBuilder("how are you");
//		String builder is not syncronized on the other hand string buffer is syncronized
	Integer.parseInt("8");
	//homework 
	//how to parse int to string
	//how to find duplicate character
	//is given string palindrom
	//given string is "12asd32" manupulate this to get result 44
	//let say number is from 1 to 100 if number is visible by 3 print "asad"
	// if number is visible by 5 print "shahid"
	 //if number is visible by 3 and 5 print "asadshahid"
	
	//got to eshopper24.com click cotton saree loop through on products if u see any product says "sold out"
	//skip it to click
	
	
	
	
	
	
	
	
		
		
		
		
		
	}
	
	
	

}
