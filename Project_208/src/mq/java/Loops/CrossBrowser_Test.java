package mq.java.Loops;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class CrossBrowser_Test 
{

	public static void main(String[] args) throws Exception 
	{
		
		
		String browsers[]= {"chrome","firefox"};
	
		String Footerlinks[][]= 
			{
				{"Sign Up","Sign up for Facebook | Facebook"},
				{"Log in","Log in to Facebook"},
				{"Messenger","Messenger"},
				{"Facebook Lite","Facebook Lite APK for Android"},
				{"Watch","Facebook Watch | Facebook"},
				{"Places","Discover great places in every city | Facebook"},
				{"Games","Games"},
				{"Groups","Facebook"},
			};
		
		
		
			WebDriver driver=null;
			for (String browser : browsers) 
			{
				  if(browser.equals("chrome"))
				  {
					  driver=new ChromeDriver();
				  }
				  else if(browser.equals("firefox"))
				  {
					  driver=new FirefoxDriver();
				  }
				  
				  
				  for (String[] Eachlink : Footerlinks) 
				  {
					  driver.get("http://facebook.com");
					  
					  String Linkname=Eachlink[0];
					  String pageTilte=Eachlink[1];
					  
					  driver.findElement(By.linkText(Linkname)).click();
					  
					  
					  try {
						new WebDriverWait(driver, Duration.ofSeconds(10))
						.until(ExpectedConditions.titleContains(pageTilte));
						System.out.println(Linkname+"  Title is Verified");
					} catch (Exception e) {
						System.out.println(Linkname+"  Title is not Verified");
					}
				  }
				  
				  
			}
			
			
			
		}
		

	}


