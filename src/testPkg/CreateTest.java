package testPkg;


import org.testng.annotations.Test;

import pagepkg.Createpage;

public class CreateTest extends Baseclass{
	
	

	@Test
	public void createpage()
	{
		Createpage ob = new Createpage(driver);
		ob.createapage();
		ob.textcreatepage();
		ob.getstarted();
	}
}
