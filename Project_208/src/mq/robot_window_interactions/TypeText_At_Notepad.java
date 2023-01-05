package robot_window_interactions;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class TypeText_At_Notepad {

	public static void main(String[] args) throws IOException, Exception 
	{
		
		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(5000);
		
		Robot robot=new Robot();
		robot.setAutoDelay(500);
		
		robot.keyPress(KeyEvent.VK_H);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_O);
		
		robot.keyPress(KeyEvent.VK_SPACE);
		
		robot.keyPress(KeyEvent.VK_F);
		robot.keyPress(KeyEvent.VK_R);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_N);
		robot.keyPress(KeyEvent.VK_D);
		robot.keyPress(KeyEvent.VK_S);
		
		
		Runtime.getRuntime().exec("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		String url="https://www.facebook.com/";
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_H);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyPress(KeyEvent.VK_P);

	}

}
