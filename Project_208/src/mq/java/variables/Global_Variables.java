package mq.java.variables;

public class Global_Variables 
{
	//Global Variable [Instant Variables]
	int a=100;
	String name="Mindq";
	boolean flag=true;
	double price=23456.23;
	char ch='A';
	float f=1234.1f;
	

	//Global Variable [Class Variables / Static Variables]
	static int b=200;
	static String fullname="MindqSystems";
	static boolean flag1=false;
	static double newprice=234000.34;
	static char group='B';
	static float f1=1234.1f;
	
	public static void main(String[] args) 
	{
		//Syntax to call global variables from outside class
		Global_Variables obj=new Global_Variables();
		
		//Calling Instant variable using object creation
		int x=obj.a;   				 System.out.println(x);
		String fname=obj.name;		 System.out.println(fname);
		boolean status=obj.flag;	 System.out.println(status);
		System.out.println(1000.00+obj.price);
		
		
		//Calling Static variables using Class Reference
		int y=Global_Variables.b;					 System.out.println(y);
		String instname=Global_Variables.fullname;	 System.out.println(instname);
		boolean newstatus=Global_Variables.flag1;	 System.out.println(newstatus);
		System.out.println(Global_Variables.group);
		
	}
	
	
	}
