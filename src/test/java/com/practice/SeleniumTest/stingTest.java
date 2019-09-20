package com.practice.SeleniumTest;

import org.testng.annotations.Test;
import org.testng.mustache.Value;

import java.lang.String;
import java.lang.CharSequence;
import java.lang.StringBuffer;
import java.lang.StringBuilder;
import java.sql.Time;


public class stingTest {
	
	@Test
	public void m() {
		System.out.println("mm");
	}
	@Test
	public void sb()
	{
			System.out.println("sb.............");
		
		StringBuffer b = new StringBuffer("abba1");
		System.out.println(b);
		StringBuffer c1 = new StringBuffer(b.reverse());
				
				System.out.println(b);
				System.out.println(c1);
		
	if(b==c1)
		System.out.println("True");
		
		
		
		
		
		b.append("Earth");
		b.append("Bbomi");
		b.append("ddd");
		b.replace(0, 3, "ddd");
		System.out.println(b);
		b.delete(0, 2);
		System.out.println(b);
		b.insert(5, "AAD");
		System.out.println(b);
	
		
	
		
		
	}
	
	@Test
	public void h() {
		String a  = "Jesus";
		float n = (float) 8.02;
		System.out.println(a.length());
		System.out.println(a.contains("A"));
		System.out.println(a.charAt(3));
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println(a.replace("s", "y"));
		String j = "ths wordl is for u";
		System.out.println(j.trim());
		System.out.println(j.indexOf("t"));
		System.out.println(j.indexOf("s",3));
		System.out.println(j.concat("A"));
		//System.out.println(j.split("\\s" , 3));
		System.out.println(String.valueOf(n));
		String[] a1 = j.split(" " , 2);
		
		for(String i:a1)
		{
			System.out.println(i);
			
		}
		
		System.out.println(j.substring(1,5));
		System.out.println(j);
		System.out.println(j.isBlank());
		
	}
	
	@Test
	public int t()
	{
	String a  = "Jesus";
	System.out.println(a.length());
	System.out.println(a.contains("s"));
	System.out.println(a.charAt(3));
	System.out.println(a.toUpperCase());
	System.out.println(a.toLowerCase());
	System.out.println(a.replace("s", "y"));
	String j = "  ths wordl is for u";
	System.out.println(j.trim());
	System.out.println(j.indexOf(5));
	System.out.println(j.concat(a));
	System.out.println(j.split(" "));
	String a1[] = j.split(" ");
	for(String i[] = a1[])
	{
		System.out.println(i);
		
	}
	
	
		
		return 1;
	}

}
