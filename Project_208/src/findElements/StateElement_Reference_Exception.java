package findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StateElement_Reference_Exception 
{

	public static void main(String[] args) throws Exception 
	{
		

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		By Email=By.id("email");
		driver.findElement(Email).sendKeys("Rahul");
		
		driver.navigate().refresh();
		
		
		driver.findElement(Email).sendKeys("Sharma");
		
		
		
		
		WebElement Password=driver.findElement(By.id("pass"));
		Password.clear();
		Password.sendKeys("Rajesh111111");
		
		//Method Refresh Page
		driver.navigate().refresh();
		
		
		driver.findElement(By.id("pass")).sendKeys("jdsfjdsjfldsjfkd");
		Thread.sleep(2000);
		
		
		Password.clear();
		Password.sendKeys("Admin");
		
		
	}

}
