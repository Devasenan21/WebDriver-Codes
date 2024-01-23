package testNGpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametrisation {
	
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		System.out.println("Facebook");
	}
	
	@BeforeMethod
	public void urlid()
	{
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	
	@Parameters({"email","password"})
	@Test
	public void parameterprgm(String email, String password)
	{
		driver.findElement(By.xpath("//input[@name = 'email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name = 'pass']")).sendKeys(password);
		
	}
	
	
	

}
