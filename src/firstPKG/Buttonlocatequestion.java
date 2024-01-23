package firstPKG;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttonlocatequestion {
	
	ChromeDriver driver;
	String baseurl= "https://register.rediff.com/register/register.php?FormName=user_details";
	
	@Before
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get(baseurl);
	}
	
	@Test
	public void test()
	{
		String button = driver.findElement(By.xpath("//input[@value='Check availability']")).getAttribute("value");
		
	
		if(button.equals("Check availability"))
		{
			System.out.println("text is Check availability");
			
		}
		else
		{
			System.out.println("text is not Check availability");
		}
	}
	

}
