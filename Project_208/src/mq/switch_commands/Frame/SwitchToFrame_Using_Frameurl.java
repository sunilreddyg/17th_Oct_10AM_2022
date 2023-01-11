package switch_commands.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrame_Using_Frameurl 
{

	public static void main(String[] args) throws Exception 
	{
	
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://www.redbus.in/info/redcare");
	    driver.manage().window().maximize();
	    Thread.sleep(5000);
	    
	    
	    //Navigating to frame using frame url
	    driver.navigate().to("https://www.redbus.in/login?offerType=Support&defaultSlide=home&isOnlyMobile=false");
	    WebElement MobileNumber=driver.findElement(By.xpath("//input[@id='mobileNoInp']"));
	    MobileNumber.sendKeys("9030248855");
	    
	    //Navigate back to main page
	    driver.navigate().back();
	}

}
