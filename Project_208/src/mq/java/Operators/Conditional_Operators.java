package mq.java.Operators;

public class Conditional_Operators 
{

	public static void main(String[] args) 
	{
		
		/*
		 * 		== 	Equal to 					x == y 	
		 * 		!= 	Not equal 					x != y 	
		 * 		> 	Greater than 				x > y 	
		 * 		< 	Less than 					x < y 	
         * 		>= 	Greater than or equal to 	x >= y 	
         * 		<= 	Less than or equal to 		x <= y
		 */
		
		
		int a=10;
		int b=20;
		System.out.println(a==b);      //false
		System.out.println(a!=b);      //true
		System.out.println(b>a);       //true
		System.out.println(a<b);       //true
		System.out.println(b<=20);     //true
		
		
	
		
		/*
		 * Logical Operators
		 * 		
		 * 		&&  	Logical and 	Returns true if both statements are true 	
		 * 						x < 5 &&  x < 10 	
         *      ||  	Logical or 	    Returns true if one of the statements is true 	
         *      				x < 5 || x < 4 	
         *      ! 	   Logical not 	    Reverse the result, returns false if the result is true 	
         *      				!(x < 5 && x < 10)
		 */
		
		
		
		int age=19;
		boolean goodhealthis=false;
		
		//Condition with and comparision
		if(age>1 &&  goodhealthis==true)
		{
			System.out.println("Accept");
		}
		else
		{
			System.out.println("Reject");
		}
		
		
		
		//Condition with or comparision
		if(age>1 ||  goodhealthis==true)
		{
			System.out.println("Accept");
		}
		else
		{
			System.out.println("Reject");
		}
		
		
		//Not Condition
		if(!(age>1 && goodhealthis==true))
		{
			System.out.println("Sending Report to  manager");
		}
		

	}

}
