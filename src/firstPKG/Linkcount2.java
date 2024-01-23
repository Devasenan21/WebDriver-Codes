package firstPKG;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcount2 {


	ChromeDriver driver;
	String baseurl ="https://www.Google.com";

	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	
	@Test
	public void test1()
	{
		List<WebElement> linkdetails=driver.findElements(By.tagName("a"));
		
		for(WebElement element: linkdetails)
		{
			String link = element.getAttribute("href");  
			String Text = element.getText();
			System.out.println("Link = "+link);
			System.out.println("Text = "+Text);
		}

	}
}
