package javaScript_Executor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollIntoView 
{

	public static void main(String[] args) throws Exception {
		

		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(3000);
		
		
		//Enable Javascript at automatio browser
		JavascriptExecutor js=(JavascriptExecutor)driver;
	
		//Select dropdown option using Javascript
		WebElement ITServices=driver.findElement(By.xpath("//span[@filter-label='IT Services']"));
		js.executeScript("arguments[0].scrollIntoView(false)", ITServices);
		
		
		/*
		 * scrollIntoView(true)
		 * 			Scroll object to view. object display at top of the page
		 * 
		 * scrollIntoView(false)
		 * 			Scroll object to view. object display at bottom of the page
		 */

	}

}
