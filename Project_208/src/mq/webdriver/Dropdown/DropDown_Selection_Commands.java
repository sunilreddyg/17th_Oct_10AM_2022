package mq.webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Selection_Commands 
{

	public static void main(String[] args) 
	{
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com/reg");
		driver.manage().window().maximize();
		
		//Selecting dropdown option using visible text
		WebElement DOB_Day=driver.findElement(By.id("day"));
		new Select(DOB_Day).selectByVisibleText("12");
		
		//Selecting Dropdown option using value property
		WebElement DOB_Month=driver.findElement(By.id("month"));
		new Select(DOB_Month).selectByValue("7");
		
		//Selecting Dropdown option using index value
		WebElement DOB_Year=driver.findElement(By.id("year"));
		new Select(DOB_Year).selectByIndex(13);

	}

}
