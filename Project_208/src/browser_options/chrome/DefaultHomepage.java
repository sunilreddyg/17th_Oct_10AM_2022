package browser_options.chrome;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DefaultHomepage {

	public static void main(String[] args) {
		
		 	String Myurl="http://selenium.dev";
	        ChromeOptions chromeOptions = new ChromeOptions();
	        
	        
	  
	       WebDriver driver=new ChromeDriver(chromeOptions);
	       driver.get("http://google.com");

	}

}
