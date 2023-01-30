package capturescreen_shot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Capture_Screen 
{

	public static void main(String[] args) throws IOException 
	{
	
		WebDriver driver=new ChromeDriver();     
		driver.get("https://www.naukri.com");
	    driver.manage().window().maximize();
	    
	    //Capturing current window screen and storing scree into file output
	   File srcimage= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   
	   //Create folder at local driver
	   FileHandler.createDir(new File("Screens\\"));
	   
	   //Copy Image file into Local folder
	   FileHandler.copy(srcimage, new File("Screens\\Image.png"));
	    

	   
	   /*
	    * PNG---> Portable Network graphic
	    * 			Image Extension
	    */
	}

}
