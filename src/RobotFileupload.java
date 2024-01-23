import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RobotFileupload {
	
ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		driver.manage().window().maximize();
	}
	
	@Test
	public void fileuploadpgrm()throws Exception
	{
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
		
		fileupload("\"D:\\LUMINAR\\Test Scenario Document.docx\"");
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
