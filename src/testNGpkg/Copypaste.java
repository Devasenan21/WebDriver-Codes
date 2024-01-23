package testNGpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Copypaste {
	

	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		System.out.println("facebook");
	}
	
	@BeforeMethod
	public void urlid()
	{
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	
	@Test
	public void copyPaste()
	{
		Actions act = new Actions(driver);
		
		WebElement email = driver.findElement(By.xpath("//input[@name = 'email']"));
		WebElement pass = driver.findElement(By.xpath("//input[@name = 'pass']"));
		email.sendKeys("devan");
		act.keyDown(email,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);  //SELECT ALL CTRL A
		act.keyDown(email,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);  //COPY    CTRL C
		act.keyDown(pass,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);   //PASTE   CTRL V
		act.perform();    //ACTION METHODS RUN CHEYYAAN VENDI LAST ACT.PERFORM NIRBANDHAM AAYUM KODUKKANAM
	}
	

}
