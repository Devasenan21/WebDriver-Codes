package pageHerbal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Healthpage {
	
	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"menu\"]/ul/li[2]/a")
	WebElement healthbutton;
	
	@FindBy(xpath = "//*[@id=\"input-sort\"]")
	WebElement dropdown;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div[3]/div[1]/div/div/div[2]/button/span")
	WebElement sendenqu;
	
	@FindBy(xpath = "//*[@id=\"Enquiry\"]")
	WebElement enqtext;
	
	@FindBy(xpath = "//*[@id=\"sendEnquiryModal\"]/div/div/div[3]/button")
	WebElement sendbutton;
	
	public Healthpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Healthbutton()	{
		healthbutton.click();
	}
	
	public void Dropdown()	{
		
		Select select = new Select(dropdown);
		select.selectByIndex(01);
	}
	
	public void clicksendenq()	{
		
		sendenqu.click();
	}
	
	public void Enqtext() {
		
		enqtext.sendKeys("shhs");
	}

	public void Send() {
		sendbutton.click();
	}
}
