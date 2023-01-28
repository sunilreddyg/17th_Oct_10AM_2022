package ui_validationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckObject_VisibleStatus 
{

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();     
		driver.get("https://www.facebook.com");
	    driver.manage().window().maximize();
	    
	    
	   try {
		   	WebElement Email=driver.findElement(By.id("email"));
		    if(Email.isDisplayed())
		    {
		    	System.out.println("Object Visible at Webpage");
		    }
		    else
		    {
		    	System.out.println("Object not visible at webpage");
		    }

	} catch (Exception e) {
		System.out.println("Element not presented at source");
	}
	   
	   
	   
	   
	   
	}

}
