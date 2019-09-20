
package PageObjectClass$;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.*;


@Listeners(ils.class)
public class conftest {
	 public static WebDriver driver;
	
	 private By text = By.xpath("//*[@id=\'hplogo\']");
	@Test

	public void test() throws IOException, InterruptedException
	
	{		
		System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
		System.out.println("diverchnae");
		driver = new FirefoxDriver();
		FileInputStream fs = new FileInputStream("config.properties");
		Properties op = new Properties();
		op.load(fs);
		System.out.println(fs);
		op.get("browser");
		String b = op.getProperty("forx");
		System.out.println(op.getProperty("name"));
		System.out.println(b);
		
		Thread.sleep(2000);
		conftest.driver.get("https://www.google.com");
		
		System.out.println("Success");
		driver.close();
	
	
		/*
		 * WebDriverWait w = new WebDriverWait(driver, 2000);
		 * w.until(ExpectedConditions.elementToBeSelected(By.xpath("text"))); String s =
		 * driver.findElement(By.xpath("text")).getText(); System.out.println(s);
		 */
	 
		
	}

}
