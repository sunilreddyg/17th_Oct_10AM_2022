package mq.java.methods.parameters;

public class Method_Parameters 
{
	
	//method without parameter
	public void method1()
	{
		System.out.println("Method1 Executed");
	}
	
	//Method with Integer parameter
	public void method2(int x)
	{
		System.out.println(x);
	}
	
	//Method with String parameter
	public void method3(String name)
	{
		System.out.println(name);
	}
	
	//Method with Boolean parameter
	public void method4(boolean flag)
	{
		System.out.println(flag);
	}
	
	//Method with double parameter
	public void method5(double price)
	{
		System.out.println(price);
	}
	
	//Method with char parameter
	public void method6(char ch)
	{
		System.out.println(ch);
	}
	
	//Method with float value
	public void method7(float f)
	{
		System.out.println(f);
	}
	
	public static void main(String[] args) 
	{
		Method_Parameters obj=new Method_Parameters();
		
		//Calling method with no arguments
		obj.method1();
		
		//Calling method with integer parameter
		obj.method2(100);
		
		//Calling method with string parameter
		obj.method3("Iphone");
		
		//Calling method with boolean parameter
		obj.method4(true);
		
		//Calling method with decimal values
		obj.method5(100);
		obj.method5(12500.50);
		
		//Calling method with Single Characters
		obj.method6('A');
		
		//Calling method with float value
		obj.method7(120);
		obj.method7(120.20f);
		
	}

}
