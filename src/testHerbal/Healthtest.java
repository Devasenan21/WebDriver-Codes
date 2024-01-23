package testHerbal;



import org.testng.annotations.Test;

import pageHerbal.Healthpage;


public class Healthtest extends HerbalBaseClass{
		


		@Test
		public void createpage()
		{
			Healthpage ob = new Healthpage(Driver);
			ob.Healthbutton();
			ob.Dropdown();
			ob.clicksendenq();
			ob.Enqtext();
			ob.Send();
			Driver.navigate().refresh();
		}

}