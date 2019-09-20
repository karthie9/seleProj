package com.practice.SeleniumTest;
import java.*;
import java.lang.StringBuffer;

import org.testng.annotations.Test;
public class stringFunction {



	@Test
	public void pal()
	{
		
		/*
		 * String a = "lionoil"; int l = a.length(); String rev = "";
		 * 
		 * System.out.println("rev before " + rev);
		 * 
		 * for(int i=l-1;i>=0;i--)
		 * 
		 * { System.out.println(a.charAt(i));
		 * 
		 * rev = rev + a.charAt(i);
		 * 
		 * 
		 * } System.out.println("rev after  " + rev); if (rev.contentEquals(a))
		 * System.out.println("true"); else System.out.println("False");
		 * 
		 * 
		 * 
		 * 
		 * StringBuffer sb = new StringBuffer(a); System.out.println("sb..........." +
		 * sb.reverse());
		 * 
		 * sb.reverse(); if (sb.toString().equals(a))
		 * System.out.println("Reverssssss tur"); else
		 * System.out.println("falrevr stng buff false");
		 * 
		 * 
		 */
	
	String q = "123621";
	String s1 = String.valueOf(q);
	System.out.println(s1.length());
	
for (int i=0;i<s1.length()/2;i++)
	{
	
	if(s1.charAt(i)==(s1.charAt(s1.length()-1-i)))
	{
	System.out.println("tru");
	}
	else
	{
		
		System.out.println("false and break +"+ s1.charAt(i));
		break;
	}
	
	
}
	

System.out.println(q.replace("1", ""));
System.out.println(q);

	


	}
	
	
	
			
}
