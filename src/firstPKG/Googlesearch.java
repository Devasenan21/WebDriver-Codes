package firstPKG;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesearch {
	
	ChromeDriver driver;
	String baseurl ="https://www.Google.in";

	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	
	@Test
	public void test1()
	{
		driver.findElement(By.name("q")).sendKeys("cars");
		driver.findElement(By.name("btnK")).click();
	}
		

}
