package mq.selenium.browserlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchBrowsers
{

	public static void main(String[] args) 
	{
	
		ChromeDriver chrome=new ChromeDriver();
		chrome.get("https://www.facebook.com/");
		System.out.println(chrome.getTitle());
		chrome.close();
		
		/*
		 * new ChromeDriver();
		 * 			Open ChromeBrowser 
		 * get:-->
		 * 		    Load new page to automation browser
		 * 
		 * getTitle:--> 
		 * 			Method return  current window title
		 * 
		 * close:-->
		 * 			Method Close Automation browser window
		 */
		
	
		/*
		 * => WebDriver is Interface class it is designed
		 * 			to manipulate all browser instances...
		 * => WebDriver can manage cross browser automation
		 * 		[It means we can write program in one browser
		 * 			and we can with multiple browsers]
		 */
	
		//Launching chrome browser using webdriver reference
		WebDriver CD=new ChromeDriver();
		CD.get("http://outlook.com");
		System.out.println(CD.getTitle());
		
		//launching firefox browser using webdriver reference
		WebDriver firefox=new FirefoxDriver();
		firefox.get("http://outlook.com");
		System.out.println(firefox.getTitle());
		
		//launching IE browser using Webdriver reference
		WebDriver ie=new InternetExplorerDriver();
		ie.get("http://google.com");
		System.out.println(ie.getTitle());
		
		//launching edge browser using webdrive reference
		WebDriver edge=new EdgeDriver();
		edge.get("http://gmail.com");
		System.out.println(edge.getTitle());
	
	}

}
