package testNGpkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileupload {
	
	ChromeDriver driver;				//THIS CODE IS FAILURE
	
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void test() throws Exception
	{
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='uploadfile_0']")).click();
		
		Thread.sleep(4000);
		
		fileupload("\"D:\\movies\\wallpaperflare.com_wallpaper.jpg\"");
		
		
		WebElement accept = driver.findElement(By.xpath("//*[@id=\"terms\"]"));
		accept.click();
		
		WebElement submit = driver.findElement(By.xpath("//*[@id=\"submitbutton\"]"));
		String text = submit.getText();
		System.out.println(text);
		submit.click();
		
		
				
	}

	public void fileupload(String p) throws AWTException {
		
		StringSelection strSelection = new StringSelection(p); //STORING PATH TO STRING P
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);
															//FOR COPY PATH TO CLIPBOARD
		
		Robot robot = new Robot();
		
		robot.delay(3000);
									//PASTING THE COPIED ITEM.
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		
	}
		
	
}

	