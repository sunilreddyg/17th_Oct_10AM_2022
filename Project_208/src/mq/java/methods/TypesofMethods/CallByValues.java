package mq.java.methods.TypesofMethods;

public class CallByValues 
{
	//method is a void type this method only execute statements method
	public void method1()
	{
		int a=100;
		System.out.println("It is a void method");
	}
	
	//Integer method type
	public int method2()
	{
		int x=100;
		return x;
	}
	
	/*
	 * => Other than void all methods return values
	 * => If method is not void type we should write return keyword
	 * => "return" keyword should write as last statement
	 * => "return" value should match with method type
	 * => Finally it return value to method name..
	 * 
	 */
	
	
	//Integer method with Parameters
	public int add(int x, int y)
	{
		return x+y;
		
	}
	
	//String Method type
	public String method3()
	{
		return "Selenium";
	}
	
	//Boolean method type
	public boolean method4()
	{
		return true;
	}
	
	//double method type
	double method5()
	{
		return 1234.00;
	}
	
	//Char method type
	char method6()
	{
		return 'D';
	}
	

	public static void main(String[] args)
	{
		CallByValues obj=new CallByValues();
		obj.method1();  //Calling void method
		
		//Calling Integer Return method
		int val=obj.method2();
		System.out.println(val);
		
		//Calling Integer return method
		int total=obj.add(100, 200);
		System.out.println(total);
		
		//Calling String return method
		String toolname=obj.method3();
		System.out.println(toolname);
		
		//Calling boolean return method
		boolean status=obj.method4();
		System.out.println(status);
		
		//Calling double return method
		System.out.println(obj.method5());
		
		//Calling char return method
		System.out.println(obj.method6());
	}

}
