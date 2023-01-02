package mq.webdriver.DatePicker;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteBox_WIth_ImplicitWait {

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Close WelComeNote window
		driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[4]")).click();

		//Selecting Departure city from autoComplete Editbox
		driver.findElement(By.xpath("//span[contains(.,'From')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("HYD");
		driver.findElement(By.xpath("//div[@class='calc60'][contains(.,'Hyderabad, India Rajiv Gandhi International Airport')]")).click();
		
		//Selecting Arrival city from autocomplete editbox
		driver.findElement(By.xpath("(//span[contains(.,'To')])[1]")).click();
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("CCu");
		driver.findElement(By.xpath("//p[contains(.,'Kolkata, India')]")).click();
		
		//Selecting Date from datepicker
		driver.findElement(By.xpath("(//p[contains(.,'18')])[1]")).click();
		
		//Clicking on search button
		driver.findElement(By.xpath("//p[@data-cy='submit']")).click();

	}

}
