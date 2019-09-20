package com.practice.SeleniumTest;
import org.openqa.selenium.*;
import static org.testng.Assert.assertEquals;

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
import org.openqa.selenium.interactions.*;


public class DyTable {
	
	

	@BeforeTest
	public void initlz()
	{
		
//		System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
//
//		WebDriver driver = new FirefoxDriver();
		//driver.get("https://www.facebook.com/");
		//driver.close();
		
		
	}
	
	
	@Test
	void tble()
	{
//		System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		//driver.get("https://www.facebook.com/");
		System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		List<WebElement> colum = driver.findElements(By.tagName("th"));
colum.size();
System.out.println("col sixe--->"+colum.size());
System.out.println("Col valus---> " + colum);
		
		
List<WebElement> rowssz = driver.findElements(By.tagName("tr"));
rowssz.size();
System.out.println("col sixe--->"+rowssz.size());
System.out.println("Col valus---> " + rowssz);

driver.close();
	}
	
//	@Test
//	void test1()
//	
//	{
//		System.out.println("test...>");
//		
//		System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");		
//		
//		driver.get("https://demoqa.com/tooltip-and-double-click/");
//		
////		List<WebElement> colum = driver.findElements(By.tagName("tr"));
////		colum.size();
////		System.out.println("col sixe--->"+colum.size());
////		System.out.println("Col valus---> " + colum);
//	}
}
