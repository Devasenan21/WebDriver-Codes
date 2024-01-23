package firstPKG;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	ChromeDriver driver;
	String baseurl = "https://www.facebook.com";
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
		
	}
	
	@Test
	public void fbLogin()
	{
		driver.findElement(By.id("email")).sendKeys("9061110469");
		driver.findElement(By.name("pass")).sendKeys("usha@@@chandran");
		driver.findElement(By.name("login")).click();
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}
	

			
		
}
