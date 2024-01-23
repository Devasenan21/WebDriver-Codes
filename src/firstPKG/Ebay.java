package firstPKG;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay {
	
	ChromeDriver driver;
	String baseurl ="https://www.ebay.com";
	
	@Before
	public void setUp()
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseurl);
		
	}
	
	@Test
	public void Test1()
	{
		String exp="Ebay.com";
		String act=driver.getTitle();
		
		if(act.equals(exp))
		{
			System.out.println("title is present");
		}
		else
		{
			System.out.println("title is not present");
		}
		driver.findElement(By.xpath("//button[@id='gh-shop-a']")).click();
		driver.findElement(By.xpath("//table[@id='gh-sbc']/tbody/tr/td[1]/u1[1]/li[4]/a")).click();
		String src=driver.getPageSource();
		if(src.contains("Shop by category"))
		{
			System.out.println("Contains 'Shop by category'");
		}
		else
		{
			System.out.println("doesn;t contain 'Shop by category");
		}
		driver.findElement(By.xpath("//div[@class='dialog__cell']/section/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//li[@id='gh-minicart-hover']/div/a[1]")).click();
		driver.findElement(By.xpath("//div[@class='actions multi-actions']/a[2]")).click();
		driver.findElement(By.xpath("//input[@type='text']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

}
