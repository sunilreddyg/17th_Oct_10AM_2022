package ui_verificationcommands.getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_placeholder_Text {

	public static void main(String[] args) {
		
		
		/*
		 * Testcase:-->
		 * 			Verify watermark label displayed  "Email, phone, or Skype"
		 * 			at email entrybox..
		 * 
		 * 			Step1:--> Navigate to Outlook page
		 * 			Step2:--> Click on SignIn button
		 * 			
		 * 			Expecte:-->
		 * 				Watermark lable should be displayed "Email, phone, or Skype"
		 */
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://outlook.com");
		
		WebElement SignInButton=driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]"));
		SignInButton.click();
		
		WebElement Email=driver.findElement(By.name("loginfmt"));
		String RuntimeValue=Email.getAttribute("placeholder");
		
		if(RuntimeValue.equals("Email, phone, or Skype"))
			System.out.println("Testpass, Label Displayed as expected");
		else
			System.out.println("Testfail, Label is not displayed as expected");
		
		
		
	

	}

}
