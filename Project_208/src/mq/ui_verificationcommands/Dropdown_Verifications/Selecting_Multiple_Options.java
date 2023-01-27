package ui_verificationcommands.Dropdown_Verifications;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selecting_Multiple_Options 
{

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/reg");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		//Identify Dropdown element at webpage
		WebElement Month=driver.findElement(By.xpath("//select[@id='month']"));
		
		//Using Javascript Converting Single Option Dropdown into Multiple Selection Type
		((JavascriptExecutor)driver)
		.executeScript("arguments[0].setAttribute('multiple','multiple')", Month);
		Thread.sleep(4000);
		
		if(new Select(Month).isMultiple())
		{
			System.out.println("Drodow is Multiple type");
			new Select(Month).deselectAll();
			new Select(Month).selectByIndex(4);
			//new Select(Month).selectByIndex(6);
			//new Select(Month).selectByIndex(10);
			
			
			if(new Select(Month).getAllSelectedOptions().size() > 1)
				System.out.println("Testpass, More than one option selected");
			else
				System.out.println("Testfail, Only Single oPtion selected");
		}
		else
		{
			System.out.println("Dropdown is Single selection");
		}
		
		
	}

}
