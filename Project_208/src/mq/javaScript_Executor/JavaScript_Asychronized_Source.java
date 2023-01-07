package javaScript_Executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Asychronized_Source
{

	public static void main(String[] args) 
	{
		
	
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
	
		   ((JavascriptExecutor) driver)
		   .executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 500);");
	
		  System.out.println("All Source loaded at webpage");
		  
		  /*
		   * What is the difference between Executescript and Execute
		   * 	AsyncScript
		   * 
		   * 		=> ExecuteSript:--> It helps to change content of Webpage
		   * 		=> ExecuteASyncScript --> It manage time gaps and loading obejcts
		   * 			with in webpage
		   */
		  
	}

}
