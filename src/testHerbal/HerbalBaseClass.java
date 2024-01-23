package testHerbal;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class HerbalBaseClass {
	
public static WebDriver Driver;
	
	@BeforeClass
	
	
	public void setUp()
	{
		Driver = new ChromeDriver();
		Driver.get("https://rishiherbalindia.linker.store/");
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}

}
