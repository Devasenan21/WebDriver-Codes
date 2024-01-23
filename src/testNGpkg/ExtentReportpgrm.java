package testNGpkg;

import java.io.File;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportpgrm {
	
	WebDriver driver;
	String baseurl ="https://www.facebook.com";
	ExtentHtmlReporter reporter;  //FOR ADDING THEMES, REPORTNAME, TITLE,.. TO REPORT.
	ExtentTest test;  	//FOR UPDATE REPORT.
	ExtentReports extent;	//FOR ADDIND INFO TO REPORT.
	
	@BeforeTest
	public void beftest()
	{
		reporter = new ExtentHtmlReporter("./reports/reportdemo.html"); //CREATE REPORTS FOLDER IN THIS PROJECT
		reporter.config().setDocumentTitle("Automation Demo Report");
		reporter.config().setReportName("Functional Test");
		reporter.config().setTheme(Theme.DARK);
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Host Name", "Local Host");
		extent.setSystemInfo("OS", "Windows 11");
		extent.setSystemInfo("Tester name", "Devan");
		extent.setSystemInfo("Browser name", "Chrome");
		driver = new ChromeDriver();
	}
	
	@BeforeMethod
	public void setUp()
	{
		driver.get(baseurl);
	}
	
	@Test
	public void fbtitleverification()
	{
		test=extent.createTest("FB Title verification");
		String exp = "Facebook – log in or sign up";
		String act = driver.getTitle();
		//System.out.println(driver.getTitle());
		Assert.assertEquals(exp, act);
	}
	
	
	@Test
	public void fblogotest()
	{
		test=extent.createTest("FB Logo test");
		boolean b= driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div[1]/img")).isDisplayed();
		Assert.assertTrue(b);
	}
	
	
	@AfterTest
	public void teardown()
	{
		extent.flush();
	}
	
	
	@AfterMethod
	public void browserclose(ITestResult result) throws IOException
	{
	
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, "test case failed is"+result.getName());
			test.log(Status.FAIL, "test case failed is"+result.getThrowable());
			String screenshotpath=ExtentReportpgrm.screenshotMethod(driver,result.getName());
			test.addScreenCaptureFromPath(screenshotpath);
			
		}else if(result.getStatus()==ITestResult.SKIP)
		{
			test.log(Status.SKIP, "test case skipped is"+result.getName());
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, "test case Passed is"+result.getName());
		}
		 
	}

			public static String screenshotMethod(WebDriver driver,String screenshotname) throws IOException
			{
				File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				
				String destination="./Screenshots/"+screenshotname +".png";
				//File finaldestination=new File(destination);
				//FileHandler.copy(src, finaldestination);
				FileHandler.copy(src, new File(destination));
		
				return destination;
			}

			
	
	
}

