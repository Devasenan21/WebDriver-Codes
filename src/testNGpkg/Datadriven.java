package testNGpkg;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriven {
	
	
	WebDriver driver;
										//THIS IS VERY VERY IMPORTENT
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
	}
	
	@Test
	public void test() throws IOException
	{
		driver.get("https://www.facebook.com/");
		
		FileInputStream f = new FileInputStream("C:\\Users\\devas\\OneDrive\\Desktop\\Book1.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(f); //RETURN WORKBOOK(EXCELL) DETAILS
		XSSFSheet s = wb.getSheet("sheet1");   //RETURN SHEET DETAILS
		int rowcount = s.getLastRowNum();      //RETURN ROW COUNT
		for(int i=1;i<=rowcount;i++)
			{
				String username = s.getRow(i).getCell(0).getStringCellValue();
				String password = s.getRow(i).getCell(0).getStringCellValue();
				System.out.println("username = "+ username +"/n" + "password =" + password);
				driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
				driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(username);
				driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(password);
				driver.findElement(By.xpath("//button[@name='login']")).click();
				
				
			}
		
		
		
	}
	

}
