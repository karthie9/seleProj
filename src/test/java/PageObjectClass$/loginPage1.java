package PageObjectClass$;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

public class loginPage1 {
	
	WebDriver driver = new FirefoxDriver();
	
	
	

	
	public int support(int c)
	{
		return c;	
		
		
	}
	
	
	public WebElement support1() throws InterruptedException
	{ 
		System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
		
		Thread.sleep(2000);
		driver.get("http://newtours.demoaut.com/mercuryunderconst.php");
		WebElement as = driver.findElement(By.xpath("//*[text()='SUPPORT']"));
		String a1 = driver.getCurrentUrl();
		System.out.println(a1);
        return as;
		
	}
	
	
	/*
	 * @BeforeClass public void a() { WebDriver driver;
	 * System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe"); driver =
	 * new FirefoxDriver(); }
	 */
}
