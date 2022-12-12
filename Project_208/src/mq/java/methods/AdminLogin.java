package mq.java.methods;

public class AdminLogin 
{
	
	public void EnterUsername() 
	{
		System.out.println("Username is entered");
	}
	
	public void Enterpassword() 
	{
		System.out.println("Password is Entered");
	}
	
	public void clickSignInbutton()
	{
		System.out.println("Click on Signbutton");
	}
	
	public void Login_valid()
	{
		//With in class Instant methods we can call eachother without object creation
		EnterUsername();
		Enterpassword();
		clickSignInbutton();
	}
	
	

	public static void main(String[] args) 
	{
		//because static method doesn't allow non static method to call directly
		//Not static methods only we can call using object creation syntax
		 new AdminLogin().Login_valid();

	}

}
