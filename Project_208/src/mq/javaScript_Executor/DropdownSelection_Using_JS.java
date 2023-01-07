package javaScript_Executor;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropdownSelection_Using_JS {

	public static void main(String[] args) 
	{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/reg");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
		
		//Enable Javascript at automatio browser
		JavascriptExecutor js=(JavascriptExecutor)driver;
	
		//Select dropdown option using Javascript
		WebElement DOB_Day=driver.findElement(By.xpath("//select[@aria-label='Day']"));
		js.executeScript("arguments[0].value='11'", DOB_Day);
		
		
		//Select dropdown option using Javascript
		WebElement DOB_Month=driver.findElement(By.xpath("//select[@aria-label='Month']"));
		js.executeScript("arguments[0].value='7'", DOB_Month);
			
		
		//Select dropdown option using Javascript
		WebElement DOB_Year=driver.findElement(By.xpath("//select[@aria-label='Year']"));
		js.executeScript("arguments[0].selectedIndex ='2'", DOB_Year);

	}

}
