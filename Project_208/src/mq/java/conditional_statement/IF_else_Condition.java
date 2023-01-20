package conditional_statement;

public class IF_else_Condition 
{

	public static void main(String[] args) 
	{
		
		
		/*
		 * If-else:-->
		 * 		it is a two decision statement
		 */
		
		
		int age=20;
	   if (age > 18) 
	   {
		   System.out.println("Accepted");
		   System.out.println("Photo captured");
	   } 
	   else 
	   {
		   System.out.println("Rejected");
	   }
		
		System.out.println("Run Continued");
		
		
		
		//Two Decision statement
		boolean flag=false;
		if(flag==true)  //Double equal is comparing boolean value and return true/false
			System.out.println("Active Status");
		else
			System.out.println("Deactivated");

	}

}
