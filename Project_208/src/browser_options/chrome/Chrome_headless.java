package browser_options.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome_headless 
{

	public static void main(String[] args) {
		
		
		ChromeOptions options=new ChromeOptions();
		options.setHeadless(true);
		
		//2nd Method to Set headless browser option
		//options.addArguments("--headless");
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.linkText("Sign Up")).click();
		System.out.println(driver.getTitle());
	}

}
