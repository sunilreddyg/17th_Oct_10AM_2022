package switch_commands.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrame2 {

	public static void main(String[] args) throws Exception 
	{
		
			WebDriver driver=new ChromeDriver();     //Launching browser method
			driver.get("https://demo.automationtesting.in/Frames.html");
		    driver.manage().window().maximize();
		    Thread.sleep(5000);
		    
		    
		    driver.switchTo().frame("singleframe");
		    
		    //Identification under single frame
		    WebElement EntryBox=driver.findElement(By.xpath("//input[@type='text']"));
		    EntryBox.sendKeys("Selenium");
		    
		    
		    //Get Controls back to MainPage
		    driver.switchTo().defaultContent();
	}

}
