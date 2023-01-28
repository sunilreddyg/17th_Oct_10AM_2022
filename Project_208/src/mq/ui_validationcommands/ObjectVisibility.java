package ui_validationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectVisibility {

	public static void main(String[] args) throws Exception
	{
		/*
		 * testcase:-->
		 * 			Verify retype password visible on 
		 * 			valid entry of email id...
		 */
		
		
		
		WebDriver driver=new ChromeDriver();     
		driver.get("https://www.facebook.com/reg");
	    driver.manage().window().maximize();
		
		
	    WebElement Email=driver.findElement(By.name("reg_email__"));
	    Email.sendKeys("sunilreddy@gmail.com");
	    Thread.sleep(3000);
	    
	    
	    WebElement RetypeEmail=driver.findElement(By.name("reg_email_confirmation__"));
	    if(RetypeEmail.isDisplayed())
	    	System.out.println("Testpass, Retype email visible at webpage");
	    else
	    	System.out.println("testfail, Retype email not visible at webpage");
	    
	    
	    
	    
	}

}
