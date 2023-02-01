package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ExpectedConditions_WithoutWait 
{

	public static void main(String[] args) {
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://instagram.com");
		driver.manage().window().maximize();
		
		/*
		 * When we use ExpectedConditions without wait commands
		 * We must use  Apply method at End  of the syntax..
		 */
		boolean flag=ExpectedConditions.titleIs("Instagram").apply(driver);
		System.out.println(flag);
		
		//Loading AlertPage
		driver.get("http://demo.automationtesting.in/Alerts.html");
	 
	    WebElement Alert_prompt_link=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	    Alert_prompt_link.click();
	  
	    //This syntax verify alert preseted at webpage and return boolean value
		if((ExpectedConditions.alertIsPresent().apply(driver))!=null)
		{
			System.out.println("Alert presented");
		}
		else
		{
			System.out.println("Alert not presented");
		}

	}

}
