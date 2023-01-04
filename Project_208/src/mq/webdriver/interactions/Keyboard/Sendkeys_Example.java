package mq.webdriver.interactions.Keyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sendkeys_Example {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/reg");
		driver.manage().window().maximize();
		
		//All Keyboard interactions performing using single void method
		WebElement FirstName=driver.findElement(By.xpath("//input[@name='firstname']"));
		FirstName.sendKeys("Arjun"+Keys.TAB+"Kumar"+Keys.TAB+"Arjunkumar@gmail.com"+Keys.TAB+"arjunkumar@gmail.com");
		
		
		//We can use keyboard interaction using time intervals
		driver.get("https://www.facebook.com/reg");
		WebElement FirstName1=driver.findElement(By.xpath("//input[@name='firstname']"));
		new Actions(driver).sendKeys(FirstName1, "Arjun")
		.sendKeys(Keys.TAB).pause(1000)
		.sendKeys("kumar").sendKeys(Keys.TAB).pause(1000)
		.sendKeys("arjunkumar@gmail.com").pause(1000).sendKeys(Keys.TAB)
		.sendKeys("arjunkumar@gmail.com").perform();
		
	}

}
