package mq.webdriver.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown_Selection_Using_KeyBoard_Shortcuts {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.name("firstname"))
		.sendKeys("Rakesh"+Keys.TAB+"AG"+Keys.TAB+"rakeshag@gmail.com");
		
		//dropdown selection using sendkeys
		driver.findElement(By.name("birthday_day")).sendKeys("12");
		
		//dropdown selection using keyboard shortcuts
		driver.findElement(By.id("month")).sendKeys(Keys.ARROW_UP,Keys.ARROW_UP);
		
		/*
		 * Sendkeys allow keyboard shortcuts. For keyboard shortcuts
		 * Webdriver never through any exception on failures..
		 */
	}

}








