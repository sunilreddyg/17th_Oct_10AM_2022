package ui_verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyPageUrl 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=null;
		try {
			driver=new ChromeDriver(); 
			System.out.println("Browser is Opened");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if(driver!=null)
		{
			driver.get("https://www.instagram.com");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
			if(driver.getCurrentUrl().contains("https://"))
			{
				System.out.println("Secured protocal");
				
				 WebElement Signup=driver.findElement(By.linkText("Sign up"));
			     Signup.click();
			     Thread.sleep(1000);
			     
			     if(driver.getCurrentUrl().contains("accounts/emailsignup/"))
			    	 System.out.println("Sign up Url Verified");
			     else
			    	 System.out.println("Sign up url not verified");
			}
			else
			{
				System.out.println("un secured protocal");
			}
			
		}
	
		
		
		
	   

	}

}
