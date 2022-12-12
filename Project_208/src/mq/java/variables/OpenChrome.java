package mq.java.variables;

public class OpenChrome 
{
	
	public OpenChrome()
	{
		System.out.println("Chrome Is Opened");
	}
	
	public void TypeUrl() 
	{
		System.out.println("url is typed");
	}
	
	public void EnterLogindetails()
	{
		System.out.println("Login Details are entered");
	}
	
	public static void main(String[] args)
	{
		new OpenChrome().TypeUrl();
		new OpenChrome().EnterLogindetails();
		
	
		OpenChrome obj=new OpenChrome();
		obj.TypeUrl();
		obj.EnterLogindetails();
		
	}
	

}
