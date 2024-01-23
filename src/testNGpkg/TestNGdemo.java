package testNGpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGdemo {
	
	ChromeDriver driver;
	
	
	@BeforeTest(alwaysRun = true)
	public void setUp()
	{
	
		System.out.println("Browser open");
	}
	
	@BeforeMethod(alwaysRun = true)
	public void urlsetUp()
	{
		
		driver=new ChromeDriver();
		driver.get("https://automationexercise.com/login");
	}
	
	@Test(priority = 1, groups= {"sanity"})
	public void title()
	{
		String Title = driver.getTitle();
		System.out.println("title="+Title);
	}
	
	@Test(priority = 2, groups = {"smoke", "reggresion"})
	public void logodesplay()
	{
		WebElement logo= (driver.findElement(By.xpath("//div[@class='logo pull-left']/a/img")));
		
		boolean l =logo.isDisplayed();
		if(l)
		{
			System.out.println("logo is displayed");
		}
		else
		{
			System.out.println("logo is not displayed");
		}
	}
	
	@AfterTest
	public void afterMethod()
	{
		driver.quit();
	}
	


}
