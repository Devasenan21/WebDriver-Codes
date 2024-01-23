package testNGpkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class copypaste1 {
	
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		System.out.println("Demo GURU99");
	}
	
	@BeforeMethod
	public void urlid()
	{
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies(); ----> CODE TO DELETE ALL COOKIES
	}
	
	
	@Test
	public void actionsPgrm()
	{
		Actions act = new Actions(driver);
		
		WebElement rightclick = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		act.contextClick(rightclick);
		act.perform();
		
		WebElement edit = driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]/span"));
		edit.click();
		
		
		Alert a= driver.switchTo().alert();
		a.accept();
		
		WebElement doubleclick = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		act.doubleClick(doubleclick);
		act.perform();
		
		Alert a1= driver.switchTo().alert();
		
		String text = a1.getText();
		System.out.println("Alert msg text =" +text);
		
		a1.accept();
		
		
	}

}
