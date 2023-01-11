package switch_commands.window;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Next_Window {

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://www.instagram.com");
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    
	    
	    WebElement Meta=driver.findElement(By.linkText("Meta"));
	    Meta.click();
	    Thread.sleep(3000);
	    
	    //Get All Window Handlings
	   Set<String> AllWindowIDs= driver.getWindowHandles();
	   
	   //Converting Set String into iteratables
	   Iterator<String> iterator=AllWindowIDs.iterator();
	   
	   //Read Each Iterator using Next Keyword
	   String Window1=iterator.next();
	   String Window2=iterator.next();
	   
	   
	   //switch to window using window id
	   driver.switchTo().window(Window2);
	   System.out.println("Second Window title ---> "+driver.getTitle());
	   

	   //Get Controls back to mainwindow
	   driver.switchTo().window(Window1);
	   System.out.println("Mainwindow Title is ---> "+driver.getTitle());
	}

}
