package switch_commands.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_With_OK_button {

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("http://demo.automationtesting.in/Alerts.html");
	    driver.manage().window().maximize();
	    
	    
	    WebElement Alert_prompt_link=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	    Alert_prompt_link.click();
	    Thread.sleep(3000);
	    
	    //Reading Text Presented at alert
	    String AlertMsg=driver.switchTo().alert().getText();
	    System.out.println(AlertMsg);
	    
	    //Press Ok Button At alert
	    driver.switchTo().alert().accept();
	    
	    //Printing current window title
	    System.out.println("Current window title is --> "+driver.getTitle());

	}

}
