package firstPKG;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firstscripttitle {

	public static void main(String[] args) {
		
		ChromeDriver ob=new ChromeDriver(); //TO LAUNCH BROWSER
		ob.get("https://www.facebook.com");
		
		String Actualtitle = ob.getTitle();  //TO GET TITLE
		System.out.println("Title = "+ Actualtitle);
		
		String exp = Actualtitle;
		if(exp.equals(Actualtitle))      //TO CHECK TITLE IS SAME OR NOT
		{
			System.out.println("Title is same");
		}
		else
		{
			System.out.println("Title is not same");
		}
		
		ob.quit();  //QUIT METHODE = TO CLOSE BROUSER IF OPENED ONE TAB
		
		//CLOSE METHODE = CLOSE ONLY ONE TAB WHEN OPENED TWO OR MORE TABS
	}

}
