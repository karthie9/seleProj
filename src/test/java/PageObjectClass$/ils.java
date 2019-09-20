package PageObjectClass$;

import java.io.File;
import java.util.logging.FileHandler;

import javax.swing.text.DefaultEditorKit.CopyAction;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.*;

import com.aventstack.extentreports.utils.FileUtil;





public class ils implements ITestListener
{
	//WebDriver driver;

	 public void onTestStart(ITestResult result) {
		    // 
			  
			  System.out.println("start est");
		  }

		  
			  public void onTestSuccess(ITestResult result) {
		    // not implemented
			  System.out.println("r u entering");
			  System.out.println("dre--? " +result.getStatus());
			  TakesScreenshot ts = (TakesScreenshot) conftest.driver;
			  File s = ts.getScreenshotAs(OutputType.FILE);
			  File f = new File ("lion.png");
			  			  
		  }

		 
			  public void onTestFailure(ITestResult result) {
		    // not implemented
			  
			  System.out.println("method shuld not execute");
			  
			//  FileUtils.copyFile(ts, f);
			 
		  }
			  
				 

			  
				
			}
	
	
