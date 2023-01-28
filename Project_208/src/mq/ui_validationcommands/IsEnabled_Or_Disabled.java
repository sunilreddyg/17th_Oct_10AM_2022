package ui_validationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class IsEnabled_Or_Disabled 
{

	public static void main(String[] args) throws Exception 
	{
		/*
		 * Testcase:-->
		 * 		Checking login button is disabled
		 * 		before enter username and password
		 */
		
		WebDriver driver=new ChromeDriver();  	
		driver.get("https://www.instagram.com/");  
		driver.manage().window().maximize();  
		Thread.sleep(4000);
								
		WebElement Signup=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div/div[1]/section/main/article/div[2]/div[1]/div[2]/form/div/div[3]/button"));
		if(!Signup.isEnabled())
			System.out.println("Buttion is Disabled");
		else
			System.out.println("Button is Enabled");
			
		
		

	}

}
