package firstPKG;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonexpath {
	
	ChromeDriver driver;
	String baseurl= "https://www.Amazon.in";
	
	@Before
	public void setUp() 
	{
		driver= new ChromeDriver();
		driver.get(baseurl);
		
		
	}
	
	@Test
	public void test()
	{
		
		driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("mobiles");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("//div[@id='nav-cart-count-container']/span[2]")).click();
		driver.findElement(By.xpath("//div[@id='nav-xshop']/a[6]")).click();
		driver.findElement(By.xpath("//*[@id='s-refinements']/div[2]/ul/li/span/a")).click();
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}

}
