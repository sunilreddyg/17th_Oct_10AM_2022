package javaScript_Executor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickMethod_Using_JS {

	public static void main(String[] args) throws Exception
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
		
		//Regular Method
		driver.findElement(By.linkText("Log in")).click();
		driver.navigate().back();
		Thread.sleep(4000);
		
		
		//Click using mouse interactions
		new Actions(driver)
		.click(driver.findElement(By.linkText("Messenger"))).perform();
		driver.navigate().back();
		Thread.sleep(4000);
		
		//Javscript Execute
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement Element=driver.findElement(By.linkText("Sign Up"));
		js.executeScript("arguments[0].click()", Element);
		
		
		
		

	}

}
