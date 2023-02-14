package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Selecting_Dropdown_Options {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/reg");
		driver.manage().window().maximize();
		
		
		Select MonthSelector=new Select(driver.findElement(By.id("month")));
		List<WebElement> AllOptions=MonthSelector.getOptions();
		for (WebElement EachOption : AllOptions) 
		{
			EachOption.click();
			Thread.sleep(400);
		}
		
	}

}
