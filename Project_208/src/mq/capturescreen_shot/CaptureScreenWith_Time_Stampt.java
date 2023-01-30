package capturescreen_shot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenWith_Time_Stampt 
{

	public static void main(String[] args) throws IOException {
		
		
		WebDriver driver=new ChromeDriver();     
		driver.get("https://www.naukri.com");
	    driver.manage().window().maximize();
	    
	    //get current system date
	    Date date=new Date();
	    //Create date simple format
	    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MMM-EEE dd-hh-mm-ss");
	   //Convert date using simple formatter
	    String time=sdf.format(date);
	    
	    WebElement Location=driver.findElement(By.xpath("//div[@class='qsb']"));
	    File srcimage=Location.getScreenshotAs(OutputType.FILE);
	    FileHandler.copy(srcimage, new File("Screens\\image1"+time+".png"));

	}

}
