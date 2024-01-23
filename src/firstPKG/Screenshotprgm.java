package firstPKG;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotprgm {
	
	ChromeDriver driver;
	String baseurl ="file:///D:/LUMINAR/alertpage.html";
	
	@Before
	public void setUp()
	{
		driver= new ChromeDriver();
		driver.get(baseurl);
		
	}
	
	@Test
	public void test() throws IOException
	{
		// PAGE SCREENSHOT			//TakesScreenshot IS AN INTERFACE AND //getScreenshotAS IS A METHOD.
		
		File s= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(s , new File("D:/LUMINAR/Pagess.png"));
		
		//ELEMENT SCREENSHOT
		
		WebElement button = driver.findElement(By.xpath("//input[@value='Display alert box']"));
		File s2 = button.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(s2, new File("./Screenshots/Displaybutton.png"));
	}

}
