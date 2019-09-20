package com.practice.SeleniumTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.practice.SeleniumTest.listnersample.class)
public class dataProvid {

	
	
	String[][] kilo = {
			{"rice", "1" },
			{"atta", "2" },
			{"got", "1"}
			        	};
	
	@Test(dataProvider="tstdata")
	public void tes1(String n, String a)
	
	{
		System.out.println(n);
		System.out.println(a);
		
	}
	
	@DataProvider(name ="tstdata")
	public String[][] td()
	{
		return kilo;
		
		
	}
		
		
	
	
}
