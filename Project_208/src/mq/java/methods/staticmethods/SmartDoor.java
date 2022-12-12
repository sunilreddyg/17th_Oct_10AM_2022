package mq.java.methods.staticmethods;

public class SmartDoor 
{
	
	public static void Open() 
	{
		System.out.println("Door is Opened");
	}

	public static void shut() 
	{
		System.out.println("Door is closed");
	}
	
	public static void main(String[] args) 
	{
		//Calling Static methods with in class no need of class
		Open();
		shut();
		
		//Calling static methods from different class
		SmartDoor.Open();
		SmartDoor.shut();
	}
}
