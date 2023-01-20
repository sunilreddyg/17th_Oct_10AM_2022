package conditional_statement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Else_If_Condition {

	public static void main(String[] args) {
		
		
		/*
		 * Else-if:-->
		 * 			Multiple Decisions take place here
		 */
		
		String Browser="chrome";
		
		if(Browser.equals("chrome"))
		{
			System.out.println("Chrome Is Opened");
		}
		else if (Browser.equals("firefox")) 
		{
			System.out.println("Firefox is Opened");
		}
		else if (Browser.equals("ie")) 
		{
			System.out.println("ie is Opened");
		}
		else
		{
			System.out.println("No Browse is opned");
		}
		
		
		
		//CrossBrowser Test Using Decision statement
		String BrowserName="firefox";
		WebDriver driver=null;
		if(BrowserName.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(BrowserName.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		
		
		if(driver!=null)
		{
			driver.get("http://facebook.com");
		}
		else
		{
			System.out.println("Browser initiation Failed");
		}
		
		

	}

}
