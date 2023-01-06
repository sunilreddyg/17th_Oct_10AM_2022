package robot_window_interactions;

import java.awt.Robot;
import java.awt.event.InputEvent;

public class Mouse_Syntax 
{

	public static void main(String[] args) throws Exception {
		
		//Create object fo Robot Class
		Robot robot=new Robot();
		robot.setAutoDelay(500);
		
		//Move Cursor to Required location using X and Y Coordinates
		robot.mouseMove(10, 50);
		
		robot.mousePress(InputEvent.BUTTON1_MASK);  //Mouse left click
		robot.mousePress(InputEvent.BUTTON2_MASK);  //Mouse Middle Click
		robot.mousePress(InputEvent.BUTTON3_MASK);  //Mouse Right click
		
		//We Must Rlease Mouse action After MousePress
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		
		//Wheel down and Wheel Up
		robot.mouseWheel(100);

	}

}
