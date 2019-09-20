package com.practice.SeleniumTest;

import org.testng.annotations.Test;
import org.testng.*;

public class listnersample implements ITestListener
{
	

	
			  public void onTestStart(ITestResult result) {
		    // 
			  
			  System.out.println("start est");
		  }

		  
			  public void onTestSuccess(ITestResult result) {
		    // not implemented
			  System.out.println("sucess");
		  }

		 
			  public void onTestFailure(ITestResult result) {
		    // not implemented
			  
			  System.out.println("method shuld not execute");
		  }
}
		