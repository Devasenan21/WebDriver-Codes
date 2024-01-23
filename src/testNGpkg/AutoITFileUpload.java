package testNGpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutoITFileUpload {
	
ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		driver.manage().window().maximize();
	}
	
	@Test
	public void fileuploadpgrm() throws Exception 
	{
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
		Thread.sleep(3000);
		//AutoIT SCRIPT EXE FILE'S PATH
		Runtime.getRuntime().exec("\"C:\\Users\\devas\\OneDrive\\Desktop\\AutoIT Script\\T1.exe\"");
		Thread.sleep(4000);
	}

}
