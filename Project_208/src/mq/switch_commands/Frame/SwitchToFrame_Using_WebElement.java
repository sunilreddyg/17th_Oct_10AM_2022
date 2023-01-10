package switch_commands.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchToFrame_Using_WebElement 
{

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://jqueryui.com/menu/");
	    driver.manage().window().maximize();
	    Thread.sleep(5000);
		
	    //Applying switch to frame using frame locator
	    WebElement Frame1=driver.findElement(By.xpath("//iframe[contains(@class,'demo-frame')]"));
		driver.switchTo().frame(Frame1);
		
		//Identifying Under Frame Element
	    WebElement Ele=driver.findElement(By.xpath("//div[@id='ui-id-4']"));
	    new Actions(driver).moveToElement(Ele).perform();
	    
	    //Get Controls back to MainPage
	    driver.switchTo().defaultContent();
	    
	}

}
