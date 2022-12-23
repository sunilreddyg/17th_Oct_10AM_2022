package mq.java.methods.CallByReference;


public class GetInfo 
{

	public static void main(String[] args) 
	{
		
		Info obj=new Info();
		obj.GetProjectDetails().Sample().method1();
		String ToolName=obj.GetProjectDetails().Sample().method3();
		System.out.println(ToolName);
		
	}

}
