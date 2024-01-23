package pageHerbal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[1]/a/i")
	WebElement myaccount;
	
	@FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[1]/ul/li[2]/a")
	WebElement login;
	
	@FindBy(xpath = "//*[@id=\"cont-login-with-email\"]/form/div[1]/input")
	WebElement email;
	
	@FindBy(xpath = "//*[@id=\"cont-login-with-email\"]/form/div[2]/input")
	WebElement password;
	
	@FindBy(xpath = "//*[@id=\"cont-login-with-email\"]/form/button[1]")
	WebElement loginbutton;

	

	



	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}



	public void Myaccount() {
		
		myaccount.click();
		
	}
	
	public void Login()	{
		
		login.click();
		
	}
	
	public void Email()	{
		
		email.sendKeys("rectidq@gmail.com");
		
	}
	
	public void Password()	{
		
		password.sendKeys("Abc@123456");
		
	}
	
	public void LoginButton()	{
		
		loginbutton.click();
		
	}

	

}
