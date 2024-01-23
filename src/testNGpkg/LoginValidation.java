package testNGpkg;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginValidation {
	
ChromeDriver driver;
	
	
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
	}
	
	@Test
	public void title()
	{
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("student");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Password123");
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		String expurl = "https://practicetestautomation.com/logged-in-successfully/";
		String acturl = driver.getCurrentUrl();
		
		// Assert.assertEquals(acturl, expurl);  //WITH ASSERTION CODE
		
		if(expurl.equals(acturl))				
		{
			System.out.println("Login succesfully");
		}
		else										//WITH SOFT ASSERTION (IF ELSE),
		{
			System.out.println("Can't login");
		}
		 
		 System.out.println("hello");
		
	}

}
