package switch_commands.window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_WindowUsing_Title {

	public static void main(String[] args) throws Exception 
	{
		
		
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://www.instagram.com");
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    
	    //Storing Mainwindow ID
	    String MainWindowID=driver.getWindowHandle();
	    
	    
	    //Hyper link [It opens in new Tab]
	    WebElement Meta=driver.findElement(By.linkText("Meta"));
	    Meta.click();
	    Thread.sleep(5000);
	    
	    //Get AllWindowHandles
	    Set<String> AllWindowIDs=driver.getWindowHandles();
	    for (String EachwindowID : AllWindowIDs) 
	    {
			String WindowTitle=driver.switchTo().window(EachwindowID).getTitle();
			if(WindowTitle.contains("Meta"))
			{
				break;
			}
		}
	    
	    
	    System.out.println("Current window Title is --> "+driver.getTitle());
	    
	    
	    //Get Controls back to mainwindow
	    driver.switchTo().window(MainWindowID);
	    System.out.println("MainWindow Title is ----> "+driver.getTitle());

	}

}
