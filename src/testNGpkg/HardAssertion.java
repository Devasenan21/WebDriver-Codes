package testNGpkg;

import static org.testng.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HardAssertion {
	
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
		
		
		 Assert.assertEquals(Title, exp);  //Assert title verification syntax.
		 
		 System.out.println("hello");
		
	}

}
