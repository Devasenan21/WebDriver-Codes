package firstPKG;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registrationfilling {

	ChromeDriver driver;
	String baseurl ="https://automationexercise.com/login";

	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	
	@Test
	public void title()
	{
		String Title = driver.getTitle();
		System.out.println("title="+Title);
	}
	
	@Test
	public void linkCount()
	{
		List<WebElement> linkdetails=driver.findElements(By.tagName("a"));
		System.out.println("Total no of links : "+ linkdetails.size());
	}
	
	@Test
	public void signup()
	{
		driver.findElement(By.xpath("//form[@action='/signup']/input[2]")).sendKeys("Devan");
		driver.findElement(By.xpath("//form[@action='/signup']/input[3]")).sendKeys("rectidq@gmail.com");
		driver.findElement(By.xpath("//form[@action='/signup']/button")).click();
		
		driver.findElement(By.xpath("//div[@class='radio']/span/input")).click();
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Devan@123");	
		
		WebElement day = driver.findElement(By.xpath("//div[@id='uniform-days']/select"));
		Select daydetails=new Select(day);
		daydetails.selectByVisibleText("21");
		
		WebElement month = driver.findElement(By.xpath("//div[@id='uniform-months']/select"));
		Select monthdetails=new Select(month);
		monthdetails.selectByVisibleText("September");
		
		WebElement year = driver.findElement(By.xpath("//div[@id='uniform-years']/select"));
		Select yeardetails=new Select(year);
		yeardetails.selectByVisibleText("2000");
		
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Devan");	
		
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("senan");	
		
		driver.findElement(By.xpath("//input[@name='company']")).sendKeys("Luminar");	
		
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("abc, def p.o xyz");
		
		WebElement country = driver.findElement(By.xpath("//select[@name='country']"));
		Select countrydetails=new Select(country);
		countrydetails.selectByVisibleText("India");
		
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("kerala");
		
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("kochi");
		
		driver.findElement(By.xpath("//input[@name='zipcode']")).sendKeys("629851");
		
		driver.findElement(By.xpath("//input[@name='mobile_number']")).sendKeys("7306128797");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
}

