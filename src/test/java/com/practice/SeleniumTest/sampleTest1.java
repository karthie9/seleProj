
package com.practice.SeleniumTest;


import  org.testng.asserts.SoftAssert.*;

import  org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.*;

import org.testng.annotations.Test;



public class sampleTest1 {
	
	
	@Test	
	public void dupljicate()
	{
		
		System.out.println("ddd");
		int a = 3;
		System.out.println(a);
		
		List<String> li = new ArrayList<String>();
				
			li.add("fruits1");
			li.add("fruits2");
			li.add("fruits3");
			
			li.add("fruits5");
			li.add("fruits6");
			li.add("fruits2");
			li.add("fruits1");
		
			
			System.out.println("list -->" +li.size());
	
		for(int i=1; i<li.size();i++)
		{
			
			System.out.println(li.get(i));
		}
		
		
		//checkfor duplicate
		
		for(int i=1; i<li.size();i++)
		{
			String a1 =li.get(i);
			for(int j=i+1; j<li.size(); j++)
			{
				String b1 =li.get(j);
		
				if(b1==a1)
			{	System.out.println("Dupiexist-----");
				System.out.println(li.get(j));
			}
			}
		}
		HashSet<String> si = new HashSet<String>();
		
		si.add("fruits1");
		si.add("fruits2");
		si.add("fruits3");
		
		si.add("fruits5");
		si.add("fruits6");
		si.add("fruits2");
		si.add("fruits1");
	
		System.out.println("set--->"+si.size());
		System.out.println("prit.."+ si);
		
		for(int i=1; i<si.size();i++)
		{
			
			System.out.println(si);
		}
	}
	
	
	

	
//	WebDriver driver;
//	String urls; 
//	

	
	@Test
	public void initi()
	{			System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		WebElement fbday = driver.findElement(By.xpath("//*[@id='day']"));
		WebElement month = driver.findElement(By.xpath("//*[@id='month']"));
		WebElement yy = driver.findElement(By.xpath("//*[@id='year']"));
	
		Select day = new Select(fbday) ;
		List<WebElement> listDay = day.getOptions();
		System.out.println("Default size --->" + listDay.size());
		System.out.println("Default text --->" + day.getFirstSelectedOption().getText());
		SoftAssert ass = new SoftAssert();
		ass.assertEquals(6, 6);
		
		day.selectByIndex(6);
		System.out.println("after select 6  text --->" + day.getFirstSelectedOption().getText());
		
		for(WebElement i:listDay )
		{
			System.out.println("i element --->" + i.getText());
		}
		
		Select mn = new Select(month);
		Select yy1 = new Select(yy);
		mn.selectByVisibleText("Aug");
		ass.assertEquals("Aug", mn.getFirstSelectedOption().getText());
		yy1.selectByValue("1988");
		
		System.out.println("Day: "+day.getFirstSelectedOption().getText() + " month: " +mn.getFirstSelectedOption().getText() + " Year: " +yy1.getFirstSelectedOption().getText());
		ass.assertEquals("1988", yy1.getFirstSelectedOption().getText());
		
		Reporter.log("First method have been passed withdropdown");
		//driver.close();
		ass.assertAll();
		
		
	}
	
	}
	
	
//	
//	
//	
//	@Test
//	public void classTwo()
//	{
//		
//		System.out.println("Second class->");
//		WebElement textSearch = driver.findElement(By.name("q"));
//		textSearch.sendKeys("Sele.demo.org");
//		//WebElement clickGoogeSearch = driver.findElement(By.name("btnK"));
//		WebElement clickGoogeSearch = driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div/div[3]/center/input[1]"));
//		clickGoogeSearch.click();
//		urls = driver.getTitle();
//	    System.out.println(urls);
////	    driver.close();
//	}
//	
/////html/body/div/div[3]/form/div[2]/div/div[3]/center/input[1]
////	@Test
////	public void testMethod() throws IOException
////	{
////		 fs=new FileInputStream(System.getProperty("E:\\Eclipse\\workspace\\SeleniumTest\\config.properties"));
////		
////		 Property = new Properties();		 
////		 Property.load(fs);
////		 
////		System.out.println(Property.getProperty("name"));
////		System.out.println("Enterd");
//////		 System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
////			
////			//driver = new FirefoxDriver();
////		//System.setProperty("webdriver.firefox.marionette","E:\\geckodriver.exe");
////			// driver = new FirefoxDriver();
////		
////		   // String baseUrl = "http://www.facebook.com";
////		System.out.println("Enterd url = https://www.google.com");
////	    
////			urls = driver.getTitle();
////		    System.out.println(urls);
////		    driver.close();
////		    
////    }
////	
//	
//	
//	@Test
//	public void mouse123()
//	{
//	driver.get("https://www.toolsqa.com/automation-practice-form/");
//	System.out.println(driver.getCurrentUrl()+ "---->URL navigated");
//	}
//	
//}
