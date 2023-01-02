package mq.webdriver.DatePicker;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selecting_Data_From_Date_Picker {

	public static void main(String[] args) throws Exception {
		
	WebDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/resources/demos/datepicker/default.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	
	driver.findElement(By.xpath("//input[@id='datepicker']")).click();
	Thread.sleep(1000);
	
	//Selecting Date using click method
	driver.findElement(By.linkText("24")).click();
	
	/*
	 * If Datepicker editbox is in editable format
	 * so that we can type required date
	 */
	driver.findElement(By.id("datepicker")).clear();
	driver.findElement(By.id("datepicker")).sendKeys("05/17/2023");
	
	
	}

}
