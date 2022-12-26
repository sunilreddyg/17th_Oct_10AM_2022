package mq.webdriver.Link;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText_Locator 
{

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://instagram.com");
		
		
		driver.findElement(By.linkText("Locations")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("India")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Somajiguda")).click();
		Thread.sleep(2000);
	}

}
