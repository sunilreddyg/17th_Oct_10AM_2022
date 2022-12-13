package mq.java.methods.parameters;

public class Multiple_Parameters 
{
	
	public void method1(int a, int b)
	{
		System.out.println(a+b);
	}
	
	public void method2(String name,String email)
	{
		System.out.println(name);
		System.out.println(email);
	}
	
	
	public void method3(int a,String details)
	{
		//a is a integer value and details is string value
		//Here plus will club both values
		System.out.println(a+details);
	}
	
	public void product(String name,double price,boolean status,int quantity)
	{
		System.out.println(name+"   "+price+"    "+status+"    "+quantity);
	}

	public static void main(String[] args) 
	{
		//Creating object for class
		Multiple_Parameters par=new Multiple_Parameters();
		
		//calling with multiple arguments
		par.method1(100, 200);
		par.method1(300, 100);
		
		//Calling with multiple string arguments
		par.method2("Aryan", "arya@gmail.com");
		
		//Calling with different parameters
		par.method3(200, "   --Totalvalue");
		
		//Calling method with different parameters
		par.product("Iphone", 75000.00, true, 2);

	}

}
