package mq.java.Loops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class While_Example {

	public static void main(String[] args) throws Exception 
	{
		
		//Printing number 1 to 10 with while loop
		
		int i=0;
		while (i < 10) 
		{
			System.out.println("HI");
			i=i+1;
		}
		
		
		
		//While with false Condition
		int j=10;
		while(j < 0)
		{
			System.out.println(j);
		}
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com/reg");
		driver.manage().window().maximize();
		
		
		WebElement RetypeEmail=driver.findElement(By.xpath("//input[@aria-label='Re-enter email address']"));
		
		int count=0;
		while(!RetypeEmail.isDisplayed())
		{
			System.out.println("Checking");
			Thread.sleep(1000);
			count=count+1;
			if(count==10)
			{
				throw new Exception("Failed to identify after 20 Seconds");
			}
		}
		
		System.out.println("OBject is Visible");
		
		
		
		
		
		

	}

}
