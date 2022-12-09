package mq.java.constructor;

public class HoldClutch 
{
	
	public HoldClutch()
	{
		System.out.println("Holding Clutch");
	}
	
	public void change_firstgear()
	{
		System.out.println("Changed To First Gear");
	}
	
	public void change_secondgear()
	{
		System.out.println("Changed to Second Gear");
	}
	
	
	public static void main(String[] args) 
	{
		 new HoldClutch().change_firstgear();
		 new HoldClutch().change_secondgear();
		 
	}

}
