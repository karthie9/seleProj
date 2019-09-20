package com.practice.SeleniumTest;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.testng.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class xpathDynTable 
{
	
	
	private By testpth1  = By.xpath("xpathExpression");
	private By tableclick  = By.xpath("//*[text()='Table']");
	private By tablepagina  = By.xpath("//*[@id='treemenu']/li/ul/li[3]/ul/li[1]/a");
	private By tablenamee  = By.xpath("(//li[@class='dropdown']/child::a)[3]");
	private By tableheade= By.xpath("//table[@class='table table-hover']/thead/tr/th");
	
	
		

    @Test
   @Parameters("Liky")
	public void table(String name) throws InterruptedException
	{
    	String a;
    	try {
    	
    	System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
	    System.out.println("star..");
	    WebDriver driver = new FirefoxDriver();
	
	
	
		driver.get("https://www.seleniumeasy.com/test/table-pagination-demo.html");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(1000);
		 a = driver.findElement(tablenamee).getText();
		System.out.println("Name------" +a);
		
		List <WebElement> column = driver.findElements(tableheade);
		column.size();
		System.out.println(column.size());
		
		driver.findElement(tableclick).click();
		Thread.sleep(2000);
		 a = driver.findElement(tablepagina).getText();
		System.out.println("Pagnination text as expected " + a);
		Thread.sleep(1000);
		driver.close();
		System.out.println("param  passing from testng.xml" + name);
		//return li;	
    	}
    	catch (Exception e) {
			
    		System.out.println("error - when selectior isinvalid");// TODO: handle exception
		}
	}
    
    
		
	
		 
}
