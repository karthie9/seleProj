package com.practice.SeleniumTest;
import java.io.File;
import org.apache.commons.*;
import java.io.FileInputStream;
import java.io.Flushable;
import java.io.IOException;

import java.util.Date;
import java.util.List;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.utils.FileUtil;

import org.openqa.selenium.io.*;


public class exRepo1 {
	
	
	
	WebDriver driver;
	ExtentReports ereport;
	ExtentHtmlReporter htm ;
	ExtentTest tc;	
	
	
	
	@Test
	void a()
	{
		
		System.out.println("A111");
	}

	@Test
	void C() throws Exception
	{
		tc=ereport.createTest("Create Fucntion C");
		System.out.println("B2111");
		tc.log(Status.PASS, "mm");
	}
	
	
	@Test
	void b() throws IOException
	{
		
		
		tc=ereport.createTest("Create Fucntion b");
		System.out.println("B2111");
		
		tc.log(Status.PASS, "mm");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File file1 = ts.getScreenshotAs(OutputType.FILE);
		File file21 = new File("life.png");
		org.openqa.selenium.io.FileHandler.copy(file1, file21);
		//tc.addScreenCaptureFromPath("life.png");
	
		
}

	
	@BeforeClass
	void bc()
	{
		
		System.out.println("Beore class");
		ereport = new ExtentReports();
		
		htm = new ExtentHtmlReporter("E:/Eclipse/workspace/SeleniumTest/Ext Report/" + System.currentTimeMillis() +".html");
				
		ereport.attachReporter(htm);
		System.out.println("Exte code written......");
		
			
			
		
		
		
	}
	
	@AfterClass
	void ac()
	{
		System.out.println("aftr class");
		ereport.flush();
		
		
	}
	
	
	
}
