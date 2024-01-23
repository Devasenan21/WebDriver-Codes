package firstPKG;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logolocatereddiff {

	ChromeDriver driver;
	String baseurl ="https://register.rediff.com/register/register.php?FormName=user_details";

	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	
	@Test
	public void logoDisplay()
	{
		WebElement logo= (driver.findElement(By.xpath("//img[@title='Rediff.com']")));
		
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
	
	@Test
	public void buttonEnable()
	{
		WebElement buttone= (driver.findElement(By.xpath("//input[@id='Register']")));
		
		boolean b =buttone.isEnabled();
		if(b)
		{
			System.out.println("button is enabled");
		}
		else
		{
			System.out.println("button is not enabled");
		}
	}
}
