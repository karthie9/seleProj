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





public class Tooltip {

	//private By  tooltp = By.id("tooltipDemo");
	final static String  a = "text";
	WebDriver driver = new FirefoxDriver();

	
	
	String tooltip()
	{
		System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");		
		driver = new FirefoxDriver();
		driver.get("https://demoqa.com/tooltip-and-double-click/");
		Actions act1 = new Actions(driver);
//		WebElement dblclick = driver.findElement(By.id("doubleClickBtn"));
//		act1.doubleClick(dblclick).click().perform();
//		Alert alrt =driver.switchTo().alert();
//		alrt.getText();
//		System.out.println(alrt.getText());
//		//String msh = "Double Click Alert Hi,You are seeing this message as you have double cliked on the button"
//		//assertEquals(Double Click Alert
//
////Hi,You are seeing this message as you have double cliked on the button, expected);
//		
//		
//		alrt.accept();
				
		
//		WebElement tp1 = driver.findElement(By.id("tooltipDemo"));
//		WebElement tex1 = driver.findElement(By.className("tooltiptext"));
//		
//		act1.moveToElement(tp1).perform();
//		String a = tex1.getText();
//		System.out.println("a------>" + a);
//		
		//driver.close();
		
	
		
		System.out.println("Entered String metod tooltip");
		
		
	WebElement rghtclick=driver.findElement(By.cssSelector("#rightClickBtn"));
	
	//WebElement cont=driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[2]/div[2]/div[2]/div/div[2]"));
	act1.contextClick(rghtclick).click().perform();
	//String b = cont.getAttribute("class");
	//System.out.println("b"+b);
int i=2;
	WebElement cont1 = driver.findElement(By.cssSelector(".contextMenuItem:nth-of-type(i)"));
	cont1.click();
	
	
	
	return a;
		
		
	
	}

	
	@Test
	void too1()
	{
		
		String b = tooltip();
		System.out.println("Tooltip function" + b);
		
	}
	
}
