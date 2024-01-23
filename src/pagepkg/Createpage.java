package pagepkg;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Createpage {
	
	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"reg_pages_msg\"]/a")
	WebElement createapage;
	
	@FindBy(xpath = "//*[@id=\"headerInnerContainer\"]/div[1]")
	WebElement textcreatepage;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div/div[2]/table/tbody/tr/td[1]/div/div[1]/div[2]/button/div/div")
	WebElement getstarted;
	
	
	
	public Createpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	

	public void createapage() {
		// TODO Auto-generated method stub
		
		createapage.click();
		
	}

	public void textcreatepage() {
		// TODO Auto-generated method stub
		
		String exp = "Create a Page";
		String act= textcreatepage.getText();
		if(act.contains(exp))
		{
			System.out.println("title is present");
		}
		else
		{
			System.out.println("title is not present");
		}
		
	}


	public void getstarted() {
		// TODO Auto-generated method stub
		
		getstarted.click();
		
	}




	

}
