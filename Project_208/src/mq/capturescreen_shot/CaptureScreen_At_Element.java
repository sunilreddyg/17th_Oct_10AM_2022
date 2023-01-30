package capturescreen_shot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreen_At_Element {

	public static void main(String[] args) throws IOException {
		
		
		
		WebDriver driver=new ChromeDriver();     
		driver.get("https://www.naukri.com");
	    driver.manage().window().maximize();
	    
	    WebElement Location=driver.findElement(By.xpath("//div[@class='qsb']"));
	    File srcimage=Location.getScreenshotAs(OutputType.FILE);
	    FileHandler.copy(srcimage, new File("D:\\06_Dec_2022_10-30AM\\Project_208\\Screens\\image1.png"));
	}

}
