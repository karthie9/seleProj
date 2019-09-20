package com.practice.SeleniumTest;

import org.testng.annotations.Test;

import PageObjectClass$.*;


public class Testclass {
	loginPage1 a = new loginPage1();
	
@Test
	public void test1() throws InterruptedException
	
	{
	
		a.support(11);		
		System.out.println("a=11");
		a.support1().click();
		
		
				
	}



}
