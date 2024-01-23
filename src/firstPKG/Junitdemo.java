package firstPKG;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo {
	
	
	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.Google.com");
	}
	
	@Test
	public void titleVerification()
	{
		String Title = driver.getTitle();
		System.out.println("title="+Title);
		
	}
	
	@Test
	public void pageSource()
	{
		String src=driver.getPageSource();
		if(src.contains("Gmail"))
		{
			System.out.println("gmail is present");
		}
		else
		{
			System.out.println("gmail is not present");
		}
	}
	
	@Test
	public void titleComparing()
	{
		String Title = driver.getTitle();
		String exp= "Google";
		if(exp.equals(Title))
		{
			System.out.println("Same title");
		}else
		{
			System.out.println("not same");
		}
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}

}
