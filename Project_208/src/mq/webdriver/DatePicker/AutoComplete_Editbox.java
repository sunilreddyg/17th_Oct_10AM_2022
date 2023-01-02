package mq.webdriver.DatePicker;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete_Editbox {

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(5000);
		
		//Close WelComeNote window
		driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[4]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[contains(.,'From')]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("HYD");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='calc60'][contains(.,'Hyderabad, India Rajiv Gandhi International Airport')]")).click();
		
		driver.findElement(By.xpath("(//span[contains(.,'To')])[1]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("CCu");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//p[contains(.,'Kolkata, India')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//p[contains(.,'18')])[1]")).click();
		Thread.sleep(5000);
		
		//Clicking on search button
		driver.findElement(By.xpath("//p[@data-cy='submit']")).click();
	}

}
