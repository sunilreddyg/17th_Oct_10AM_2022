package waitcommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_TextPresentedAt_Location 
{
	
	public static void main(String args[])
	{
		
		
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.outlook.com");
		driver.manage().window().maximize();// TODO Auto-generated method stub
		

		driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]")).click();
		
		
		//Enable explicitwait on automation browser
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		try {
			wait.until(ExpectedConditions
					.textToBePresentInElementLocated
					(By.xpath("//div[@role='heading']"), "Sign in"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Text Presented at location");
		
		
		try {
			wait.until(ExpectedConditions.textToBe(By.xpath("//a[@id='signup']"), "Create one!"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Text presented at location");
		
	}

}
