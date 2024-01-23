package testPkg;


import org.testng.annotations.Test;

import pagepkg.FbLoginPage;				//WITHOUT PAGE FACTORY
											//IT IS HARD

public class FbLoginTest extends Baseclass{
	
	
	
	@Test
	public void testlogin()
	{
		FbLoginPage ob = new FbLoginPage(driver);
		ob.setvalues("abc@gmail.com", "hshcy");
		ob.login();
		driver.navigate().back();
	}

}
