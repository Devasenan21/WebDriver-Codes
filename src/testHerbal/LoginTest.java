package testHerbal;


import org.testng.annotations.Test;

import pageHerbal.LoginPage;


public class LoginTest extends HerbalBaseClass{
	


	@Test
	public void createpage()
	{
		LoginPage ob = new LoginPage(Driver);
		ob.Myaccount();
		ob.Login();
		ob.Email();
		ob.Password();
		ob.LoginButton();
	}

}
