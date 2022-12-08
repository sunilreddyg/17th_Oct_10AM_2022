package mq.java.methods;

public class RobotX 
{

    public void turnon()
	{
		System.out.println("turn on");
	}
    
    public void turnoff()
    {
    	System.out.println("turn off");
    }
    
    public void startwalk() 
    {
		System.out.println("Start Walk");
	}
    
    public void stopwalk()
    {
    	System.out.println("Stop walk");
    }
    
    
    public static void main(String[] args) 
    {
		new RobotX().turnon();
		new RobotX().turnoff();
		new RobotX().startwalk();
		new RobotX().stopwalk();
	}

}
	





