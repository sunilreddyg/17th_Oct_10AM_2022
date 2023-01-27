package ui_verificationcommands.getcssvalue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_Element_Styles {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://instagram.com");
		Thread.sleep(20000);
		
		
		WebElement Button=driver.findElement(By.xpath("//button[@type='submit']"));
		System.out.println(Button.getCssValue("background-color"));
		

	}

}
