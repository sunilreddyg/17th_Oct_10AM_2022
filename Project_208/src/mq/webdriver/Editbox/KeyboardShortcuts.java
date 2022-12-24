package mq.webdriver.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardShortcuts 
{

	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://outlook.com");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.name("loginfmt"))
		.sendKeys("sunilreddy.gajjala@outlook.com"+Keys.ENTER);
		
		Thread.sleep(4000);
		
		driver.findElement(By.name("passwd"))
		.sendKeys("admin@123"+Keys.ENTER);

	}

}
