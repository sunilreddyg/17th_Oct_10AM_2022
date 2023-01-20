package conditional_statement;

public class SwitchCase 
{

	public static void main(String[] args) {
	
		
		/*
		 * Switch-case:-->
		 * 		Switch statement work similar as else-if
		 * 		statement but only difference is switch
		 * 		directly execute required case instead of
		 * 		checking verify condition...
		 */
		
		
		String month="Apr";
		switch (month) 
		{
		case "jan":
			System.out.println("10% Discount");
			break;
			
		case "feb":
			System.out.println("20% Discount");
			break;
			
		case "mar":
			System.out.println("30% Discount");
			break;
			
		case "Apr":
			System.out.println("40% Discount");
			break;

		default: System.out.println("No discount");
			break;
		}
		
		
		
		int date=2;
		switch (date) {
		case 1:
			System.out.println("1st date selected");
			break;
			
		case 2:
			System.out.println("2nd date selected");
			break;
			
		case 3:
			System.out.println("3rd date selected");
			break;

		default: System.out.println("No Date selected");
			break;
		}
		

	}

}
