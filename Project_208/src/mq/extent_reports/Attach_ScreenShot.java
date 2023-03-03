package extent_reports;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Attach_ScreenShot 
{

	public static void main(String[] args) throws Exception {
		
		
		//Create Html file at Selected Location
		String path="D:\\06_Dec_2022_10-30AM\\Project_208\\Reports\\Report5.html";
		ExtentReports reporter=new ExtentReports(path, true);
		
		//Creating First Test
		ExtentTest test1=null;
		test1=reporter.startTest("Tc001_Valid");
		
				WebDriver driver=null;
				driver=new ChromeDriver();
				if(driver!=null)
				{
					test1.log(LogStatus.PASS, "Browser is Opened");
				}
				
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				Thread.sleep(4000);
				
				String spath="D:\\06_Dec_2022_10-30AM\\Project_208\\Screen100.png";
				File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileHandler.copy(src, new File(spath));
		
				if(driver.getTitle().equals("OrangeHRM"))
					test1.log(LogStatus.PASS, "Page Verified ",test1.addScreenCapture(spath));
				else
					test1.log(LogStatus.FAIL, "Page Not Verified",test1.addScreenCapture(spath));
			
		reporter.endTest(test1);
		
		
	//Save and Flush Data to File
	reporter.flush();


	}

}
