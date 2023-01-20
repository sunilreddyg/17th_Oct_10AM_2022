package conditional_statement;

public class If_Condition 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Note:-->
		 * 		If is a single decision statement
		 * 		If accept only boolean value
		 */
		
		
		System.out.println("Statement1");
		
		int Age=19;
		if (Age > 18)   // greaterthan ">" operator return boolean value
		{
			System.out.println("Statement2");
			System.out.println("Statement3");
		}
		
		
		String Color="Orange";
		if (Color.equals("Orange"))   //Equal is a string method it return boolean value
		{
			System.out.println("Color is Green");
		}
		
		
		//Note:--> If Condition we can define without boy when need to write single statement
		if("9030248856".length()==10)    //double eualsto is a operator it return boolean value
			System.out.println("Mobile Number available in 10 digits");
		
		
		System.out.println("Run Completed");
		

	}

}
