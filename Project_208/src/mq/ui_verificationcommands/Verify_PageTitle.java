package ui_verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_PageTitle 
{

	public static void main(String[] args) throws Exception 
	{
		
		
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://www.instagram.com");
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    
	   if(driver!=null)
	   {
		   if(driver.getTitle().equals("Instagram"))
		   {
			   System.out.println("Navigated to Right page");
			   WebElement Signup=driver.findElement(By.linkText("Sign up"));
			   Signup.click();
			   Thread.sleep(1000);
			   
			   if(driver.getTitle().contains("Sign up"))
				   System.out.println("Sign up title is verified");
			   else
				   System.out.println("Sign up title is not verified");
		   }
		   else
		   {
			   System.out.println("Page Title is Not Verified");
		   }
	   }
	  
	    
	    

	}

}
