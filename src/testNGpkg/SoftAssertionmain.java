package testNGpkg;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SoftAssertionmain {
	
	ChromeDriver driver;
	
	
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://www.Google.com");
		
	}
	
	@Test
	public void title()
	{
		String exp = "google";
		String Title = driver.getTitle();
		
		if(exp.equals(Title))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		 
		 System.out.println("hello");
		
	}

}


