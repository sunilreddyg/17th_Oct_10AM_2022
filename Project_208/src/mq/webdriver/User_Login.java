package mq.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class User_Login 
{

	public static void main(String[] args)
	{
		//Setup browser and webpage
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("Darshan");
		driver.findElement(By.id("pass")).sendKeys("Darsh@123");
		driver.findElement(By.name("login")).click();
		
	
	}

}
