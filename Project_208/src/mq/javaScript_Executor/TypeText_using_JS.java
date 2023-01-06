package javaScript_Executor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TypeText_using_JS 
{

	public static void main(String[] args) 
	{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
		
		//Enable Javascriptexecutor at automation browser
		((JavascriptExecutor)driver)
		.executeScript("document.getElementById('email').value='Darshan';");

		
		((JavascriptExecutor)driver)
		.executeScript("document.getElementById('pass').value='Darsh@123';");
		
		//javascript using xpath
		WebElement LoginButton=driver.findElement(By.xpath("//button[@name='login']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].click()", LoginButton);
	}

}
