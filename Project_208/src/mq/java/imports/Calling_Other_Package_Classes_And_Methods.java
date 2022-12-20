package mq.java.imports;

import mq.java.methods.Movies;
import mq.java.methods.staticmethods.SmartDoor;
import mq.java.variables.OpenChrome;

public class Calling_Other_Package_Classes_And_Methods {

	public static void main(String[] args) 
	{
		Movies obj=new Movies();
		obj.pause();
		obj.play();
		
		
		SmartDoor.Open();
		SmartDoor.shut();
		
		OpenChrome chrome=new OpenChrome();
		chrome.TypeUrl();
	
	}

}
