package objectidentification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin_Test 
{

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("darshan");
		
		Thread.sleep(1000);
		driver.findElement(By.name("pass")).sendKeys("Hello@123");
		
		Thread.sleep(1000);
		driver.findElement(By.name("login")).click();
		
	}

}
