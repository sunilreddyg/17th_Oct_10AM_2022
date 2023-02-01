package waitcommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitFor_Page_Title 
{

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://instagram.com");
		driver.manage().window().maximize();
		
		
		new WebDriverWait(driver, Duration.ofSeconds(30))
		.until(ExpectedConditions.titleIs("Instagram"));
		
		System.out.println("Title is Verified");
		
		
		
		new WebDriverWait(driver, Duration.ofSeconds(20))
		.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Sign up"))).click();

		
		boolean flag=new WebDriverWait(driver, Duration.ofSeconds(30))
		.until(ExpectedConditions.titleContains("Sign up"));
		
		System.out.println("Title is Presented --> "+flag);
		
		
		
		
		
	}

}
