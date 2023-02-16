package findElements;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Get_All_DropdownOptions 
{

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://near-me.hdfcbank.com/branch-atm-locator/?lat=17.3686664&long=78.5306411&shared=1");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement StateDropdown=driver.findElement(By.id("customState"));
		List<WebElement> AllOptions=StateDropdown.findElements(By.tagName("option"));
		System.out.println("Option Count is --> "+AllOptions.size());
		
		if(AllOptions.size() > 0)
		{
			for (WebElement Eachoption : AllOptions) 
			{
				String EachState=Eachoption.getText();
				System.out.println(EachState);
				
				Eachoption.click();
				
				new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.not(ExpectedConditions.attributeContains(By.id("customCity"), "disabled", "disabled")));
				
				Thread.sleep(2000);
				
				WebElement CityDropdown=driver.findElement(By.id("customCity"));
				List<WebElement> CityOptions=CityDropdown.findElements(By.tagName("option"));
				if(CityOptions.size() > 0)
				{
					System.out.println(EachState+"   Cities Displayed");
					for (WebElement EachCity : CityOptions) 
					{
						EachCity.click();
						Thread.sleep(200);
						
						
					}
				}
				else
				{
					System.out.println(EachState+"   Cities not Displayed");
				}
			}
		}
		else
		{
			System.out.println("No Option Presented at Dropdown");
		}
		

	}

}
