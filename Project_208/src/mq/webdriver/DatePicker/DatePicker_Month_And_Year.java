package mq.webdriver.DatePicker;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePicker_Month_And_Year 
{

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/datepicker/dropdown-month-year.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
		driver.findElement(By.id("datepicker")).click();
	
		
		new Select(driver.findElement(By.xpath("//select[@aria-label='Select month']")))
		.selectByVisibleText("Jul");
		
		
		new Select(driver.findElement(By.xpath("//select[@aria-label='Select year']")))
		.selectByVisibleText("2020");
	
		driver.findElement(By.linkText("21")).click();
		
		
		
	}

}
