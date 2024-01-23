package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class FbLoginPage {
	
	WebDriver driver;					
	
	By fbemail = By.id("email");				//WITHOUT PAGE FACTORY
													//IT IS HARD
	By fbpswrd = By.id("pass");
	By fbloginbutton = By.name("login");


	
	

	public FbLoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;			
	}



	public void setvalues(String email, String password) {
		// TODO Auto-generated method stub
		
		driver.findElement(fbemail).sendKeys(email);
		driver.findElement(fbpswrd).sendKeys(password);
		
		
	}



	public void login() {
		// TODO Auto-generated method stub
		
		driver.findElement(fbloginbutton).click();
		
	}
	
	

}
