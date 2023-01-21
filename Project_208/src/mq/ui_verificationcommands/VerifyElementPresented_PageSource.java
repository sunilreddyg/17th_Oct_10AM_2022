package ui_verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyElementPresented_PageSource {

	public static void main(String[] args) {
		
		WebDriver driver=null;
		try {
			driver=new ChromeDriver(); 
			System.out.println("Browser is Opened");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		if(driver!=null)
		{
			driver.get("http://facebook.com");
			driver.manage().window().maximize();
			
			if(driver.getPageSource().contains("email123"))
			{
				driver.findElement(By.id("email")).sendKeys("darshan");
			}
			else
			{
				System.out.println("Element is Not presented");
			}
			
		}

	}

}
