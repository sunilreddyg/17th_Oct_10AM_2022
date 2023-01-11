package switch_commands.window;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium4_Create_NewWindow {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://www.instagram.com");
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    
	    //Get Mainwindow ID
	    String MainWindowID=driver.getWindowHandle();
	    
	    
	    WebDriver MetaWindow=driver.switchTo().newWindow(WindowType.WINDOW);
	    MetaWindow.get("https://about.meta.com/");
	    System.out.println(MetaWindow.getTitle());
	    
	    //Switch to Mainwindow
	    driver.switchTo().window(MainWindowID);
	    System.out.println(driver.getTitle());
	}

}
