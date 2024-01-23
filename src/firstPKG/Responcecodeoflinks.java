package firstPKG;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Responcecodeoflinks {
	
	ChromeDriver driver;
	String baseurl ="https://www.Google.com";
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	
	@Test
	public void test1() throws Exception
	{
		List<WebElement> linkdetails=driver.findElements(By.tagName("a"));
		
		System.out.println("Total no of links= "+ linkdetails.size());
		
		for(WebElement element : linkdetails)
		{
			String link=element.getAttribute("href");
			verify(link);
		}
	}

	public void verify(String link) {
		
		try
		{
			URL u=new URL(link);
			HttpURLConnection con=(HttpURLConnection)u.openConnection();
			int code=con.getResponseCode();
			
			if(code==200)
			{
				System.out.println("responce code is 200____"+link);
				
			}
			else if(con.getResponseCode()==404)
			{
				System.out.println("responce code is 404____"+ link);
			}
			else if(con.getResponseCode()==201)
			{
				System.out.println("response code is 201____"+link);
			}
			else
			{
				System.out.println("other response code____"+ link);
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}

}
