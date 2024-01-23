package firstPKG;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertbox {
	
	ChromeDriver driver;
	String baseurl ="file:///D:/LUMINAR/alertpage.html";
	
	@Before
	public void setUp()
	{
		driver= new ChromeDriver();
		driver.get(baseurl);
		
	}
	
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//input[@value='Display alert box']")).click(); //EPPOZHUM ALERT FIND CHEYTHA CODE INTE THAAZHE THANNE DRIVER SWITCH CHEYYAAN OLLA CODE KODUKKUKA
		
		Alert a= driver.switchTo().alert(); //EPPOZHUM SWITCH CHEYTHATHIN SHESHAM MAATHRAM ACCEPT OR DISMISS KODUKKUKA
		
		a.accept(); //----> FOR ACCEPT ALERT
		//a.dismiss(); ---->FOR CANCEL ALERT
		//String alerttext = a.getText(); ----> FOR GET TEXT OF AN ALERT MESSAGE
		
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("devan");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("senan");
			
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}

}
