package mq.webdriver.interactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover_Action 
{

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//Performing hover action at selected targets
		WebElement MainMenu_Consumer=driver.findElement(By.xpath("//a[@href='javascript://'][contains(.,'Paytm for Consumer')]"));
		new Actions(driver).moveToElement(MainMenu_Consumer).perform();
		Thread.sleep(1000);
		
		WebElement Payments_SubMenu=driver.findElement(By.xpath("(//div[@class='_2dve7'])[1]"));
		new Actions(driver).moveToElement(Payments_SubMenu).perform();
		Thread.sleep(1000);
		
		WebElement OnlinePayment=driver.findElement(By.xpath("//a[@href='https://paytm.com/online-payments']"));
		new Actions(driver).click(OnlinePayment).perform();
		
		
	}

}
