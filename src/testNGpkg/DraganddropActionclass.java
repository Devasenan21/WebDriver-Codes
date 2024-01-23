package testNGpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DraganddropActionclass {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
	}
	
	@Test
	public void test()
	{
		Actions act = new Actions(driver);
		WebElement bank = driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement bankloc = driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		act.dragAndDrop(bank, bankloc);
		act.perform();
		
		WebElement amount = driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement amountloc = driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		act.dragAndDrop(amount, amountloc);
		act.perform();
		
		
	}

}
