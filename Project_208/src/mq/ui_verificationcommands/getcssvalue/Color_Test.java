package ui_verificationcommands.getcssvalue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Color_Test 
{

	public static void main(String[] args) throws Exception {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
	
		WebElement Object=driver.findElement(By.xpath("//button[contains(.,'Login')]"));
		String RGBAColor_Code=Object.getCssValue("color");
		System.out.println(RGBAColor_Code);
		
		
		String Hex_colorCode="#FFFF01";
		//Converting Hex Colorcode into RGBA
		Color Default_Hex_Color=Color.fromString(Hex_colorCode);
		String Exp_RGBA_color=Default_Hex_Color.asRgba();
		
		if(RGBAColor_Code.equals(Exp_RGBA_color))
			System.out.println("Testpass, Color is Matching");
		else
			System.out.println("Testfail, Color is Mismatched");
		
		
		/*
		 * Refer here:-->
		 * 	https://www.selenium.dev/documentation/webdriver/support_features/colors/
		 */
	}

}
