package mq.webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class DropdownSelection_Using_ClickMethod {

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://near-me.hdfcbank.com/branch-atm-locator/");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		//Instead of new Select() We can follow Click Method to Select dropdown Options..
		WebElement StateLocation=driver.findElement(By.id("customState"));
		StateLocation.findElement(By.xpath("//option[@value='andhra-pradesh']")).click();
		Thread.sleep(8000);
		
		//We can also copy Option Xpath
		driver.findElement(By.xpath("//option[@value='chirala'][contains(.,'Chirala')]")).click();
		
		
	}

}
