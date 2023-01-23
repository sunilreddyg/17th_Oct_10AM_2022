package ui_verificationcommands.getText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_TextPresented_At_Webpage {

	public static void main(String[] args) throws Exception {
		
		
		/*
		 * Scenario:  Verify Mandatory Error message displayed at webpage
		 * 		Given site url is "http://facebook.com/reg"
		 * 		And Leave empty informtion at firstname
		 * 		When User Click Signup now button
		 * 		Then verify error lable displayed "What's your name?"
		 */
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/reg");
		driver.manage().window().maximize();
		
		
		
		WebElement Signup_btn=driver.findElement(By.xpath("//button[@name='websubmit']"));
		Signup_btn.click();
		Thread.sleep(3000);
		
		//Target whole webpage
		WebElement page=driver.findElement(By.tagName("body"));
		
		//Read all visible text presented at webpage
		String VisibleText=page.getText();
		System.out.println(VisibleText);
		
		if(VisibleText.contains("What's your name?"))
		{
			System.out.println("Testpass, Expected Lable Presented at webpage");
		}
		else
		{
			System.out.println("Testfail, Label not presented at webpage");
		}

	}

}
