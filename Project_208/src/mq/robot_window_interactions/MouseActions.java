package robot_window_interactions;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MouseActions 
{

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
		
		Robot robot=new Robot();
		robot.setAutoDelay(500);
		
		//Move Cursor position to Required target
		robot.mouseMove(370, 466);
		
		//MousePress and Release On Button
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		
		//ScrollDown page
		robot.mouseWheel(100);
		
		
		
		
	}

}
