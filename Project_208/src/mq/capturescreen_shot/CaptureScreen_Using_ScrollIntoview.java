package capturescreen_shot;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreen_Using_ScrollIntoview {

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver=new ChromeDriver();     
		driver.get("https://www.naukri.com");
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    
	    
	    WebElement Location=driver.findElement(By.xpath("//h2[contains(.,'Sponsored companies')]"));
	    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",Location);
	    new Actions(driver).sendKeys(Keys.PAGE_UP).sendKeys(Keys.PAGE_UP).perform();
	    
	    
	    //Capture screen at current page
	    WebElement Page=driver.findElement(By.tagName("body"));
	    File srcimage=Page.getScreenshotAs(OutputType.FILE);
	    FileHandler.copy(srcimage, new File("D:\\06_Dec_2022_10-30AM\\Project_208\\Screens\\image1.png"));
	}

}
