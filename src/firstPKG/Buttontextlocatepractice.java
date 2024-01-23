package firstPKG;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttontextlocatepractice {
	
	ChromeDriver driver;
	String baseurl= "https://www.facebook.com/";
	
	@Before
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get(baseurl);
	}
	
	@Test
	public void test()
	{
		String button = driver.findElement(By.xpath("//button[@name='login']")).getText();
		
	
		if(button.equals("Log in"))
		{
			System.out.println("text is Log in");
			
		}
		else
		{
			System.out.println("text is not Log in");
		}
	}

}
