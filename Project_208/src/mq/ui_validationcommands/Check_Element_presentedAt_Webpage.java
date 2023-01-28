package ui_validationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_Element_presentedAt_Webpage {

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();     
		driver.get("https://www.makemytrip.com");
	    driver.manage().window().maximize();
		Thread.sleep(10000);
		
		
	   boolean flag=false;
	    try {
			driver.findElement(By.xpath("(//button[@data-cy='addAnotherCity'])[2]"));
			flag=true;
			System.out.println("Element Presnendt at webpage");
		} catch (Exception e) {
			System.out.println("Element Not Presneted at webpage");
		}
	    
	    
	    

	}

}
