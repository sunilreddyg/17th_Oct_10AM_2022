package mq.java.variables;

public class VariableTypes
{
	String name="Shashi";
	
	public void method1() 
	{
		int a=100;     //Local Variable
		System.out.println(a);
		System.out.println(name);
	}
	
	public void method2()
	{
		System.out.println(name);
	}
	
	public static void main(String[] args) 
	{
		VariableTypes obj=new VariableTypes();
		obj.method1();
		obj.method2();
		String Fullname=obj.name;
		System.out.println(Fullname);
		
	}

}
