package switch_commands.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class SwitchToFrame1 
{

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://jqueryui.com/draggable/");
	    driver.manage().window().maximize();
	    Thread.sleep(10000);
	    
	    /*
	     * The below element is under frame available, Selenium
	     * IDE detect frame and provide syntax to swith to alert
	     */
	    driver.switchTo().frame(0);
	    
	    WebElement Object=driver.findElement(By.xpath("//div[@id='draggable']"));
	    new Actions(driver).dragAndDropBy(Object, 50, 30).perform();
	    
	    //Get Controls back to MainPage
	    driver.switchTo().defaultContent();
	}

}
