package waitcommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_ElementSelection_StateTobe {

	public static void main(String[] args) 
	{
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();// TODO Auto-generated method stub
		
		
		By FemaleRbtn=By.xpath("//input[@value='1']");

		//This action wait until expected radio button  is checked
		try {
			new WebDriverWait(driver, Duration.ofSeconds(30))
			.until(ExpectedConditions.elementSelectionStateToBe(FemaleRbtn, true));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Female Radio button is selected");
		
		
		//This action wait until expected radio button  is unchecked
		try {
			new WebDriverWait(driver, Duration.ofSeconds(30))
			.until(ExpectedConditions.elementSelectionStateToBe(FemaleRbtn, false));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Female Radio button is not selected");
		
		
		//Verify Radio buttion is selected
		new WebDriverWait(driver, Duration.ofSeconds(10))
		.until(ExpectedConditions.elementToBeSelected(By.xpath("//input[@value='2']")));
		System.out.println("Male Radio button is selected");
		
	}

}
