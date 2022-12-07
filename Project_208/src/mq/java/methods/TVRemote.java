package mq.java.methods;

public class TVRemote
{
	public void turnOn() 
	{
		System.out.println("Television is ON");
	}
	
	public void turnOff() 
	{
		System.out.println("Television is OFF");
	}
	
	public static void main(String[] args) 
	{
		new TVRemote().turnOff();
	}
	
}
