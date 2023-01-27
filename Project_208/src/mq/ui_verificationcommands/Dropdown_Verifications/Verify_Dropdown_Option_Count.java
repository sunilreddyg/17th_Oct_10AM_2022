package ui_verificationcommands.Dropdown_Verifications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Verify_Dropdown_Option_Count 
{

	public static void main(String[] args) throws Exception 
	{
		
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/reg");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		
		WebElement DOB_month=driver.findElement(By.xpath("//select[@id='month']"));
	    int OptionCount=new Select(DOB_month).getOptions().size();
	
	    if(OptionCount==12)
	    	System.out.println("Testpass");
	    else
	    	System.out.println("Testfail");
		
		
	}

}
