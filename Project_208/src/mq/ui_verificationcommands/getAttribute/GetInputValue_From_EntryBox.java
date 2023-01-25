package ui_verificationcommands.getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetInputValue_From_EntryBox {

	public static void main(String[] args) throws Exception 
	
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://instagram.com");
		Thread.sleep(5000);
		
		
		WebElement MobileEB=driver.findElement(By.xpath("//input[@name='username']"));
		//MobileEB.sendKeys("9030248855");
		
		//Read Input From Editbox
		String MobileNum=MobileEB.getAttribute("value");
		
		//Condition to check Input Presented at Editbox
		if(!MobileNum.isEmpty())
		{
			    //Condition to check presented input match with expected result
			   if(MobileNum.equals("9030248855"))
				   System.out.println("Testpass");
			   else
				   System.out.println("Testfail");
		}
		else
		{
			System.out.println("No value presented at editbox");
		}

	}

}
