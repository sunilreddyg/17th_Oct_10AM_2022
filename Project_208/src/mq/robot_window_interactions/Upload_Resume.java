package robot_window_interactions;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Upload_Resume {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gclid=EAIaIQobChMIm-H64-Gv_AIVzp1LBR0zbQRKEAAYAiAAEgKys_D_BwE&gclsrc=aw.ds");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement UploadButton=driver.findElement(By.xpath("//button[contains(.,'Upload Resume')]"));
		UploadButton.click();
		Thread.sleep(1000);
		
		
		String path="D:\\images\\Latest\\Fresher\\MyResume.docx";
		
		StringSelection spath=new StringSelection(path);
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(spath, spath);
		
		
		//Create object for robot
		Robot robot=new Robot();
		robot.setAutoDelay(400);
		
		//Pressingn Control+V Shortcut
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		//Press Enter key
		robot.keyPress(KeyEvent.VK_ENTER);
	}

}
