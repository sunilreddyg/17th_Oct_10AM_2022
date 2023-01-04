package mq.webdriver.interactions.Keyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Interactions 
{

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.skyscanner.co.in/");
		driver.manage().window().maximize();
		
		WebElement FromEB=driver.findElement(By.xpath("//input[@id='fsc-origin-search']"));
		
		new Actions(driver)
		.click(FromEB)
		.sendKeys(Keys.BACK_SPACE)
		.sendKeys("HYD")
		.pause(2000)
		.sendKeys(Keys.ARROW_DOWN)
		.pause(1000)
		.sendKeys(Keys.ENTER)
		.perform();
		

	}

}
