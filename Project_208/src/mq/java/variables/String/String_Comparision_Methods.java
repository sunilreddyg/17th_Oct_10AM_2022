package mq.java.variables.String;

public class String_Comparision_Methods 
{

	public static void main(String[] args) 
	{
		
		/*
		 * String:-->
		 * 			=> String store group of characters
		 * 			=> String is a non primitive datatype and 
		 * 				also called as class
		 * 			=> String contain set of events[Methods] to validate
		 * 				stored characters
		 */
		
		
		/*
		 * Equals:-->
		 * 		Method verify equal comparison between two strings
		 * 		and return boolean value true/false.
		 * 
		 * 		Note:--> Comparision is casesensitive
		 */
		
		String Act_res="Account Created Successful";
		String Exp_res="Account Created successful";
		
		boolean flag=Act_res.equals(Exp_res);
		System.out.println("Equal comparision is --->"+flag);
		
		/*
		 * EquaIgnoreCase:-->
		 * 		Method verify equal comparsion between two
		 * 		string by ignorning casesensitive
		 */
		
		boolean flag1=Act_res.equalsIgnoreCase(Exp_res);
		System.out.println("EqualIgnorecase Comparision is --> "+flag1);
		
		
		/*
		 * Contains:-->
		 * 		Method verify SubString charcter sequence
		 * 		available at main string.
		 */
		String Status="Account Created 100 SuccessfulA";
		boolean flag3=Status.contains("Successful");
		System.out.println("Sub String contains status is ---> "+flag3);
		

		/*
		 * Length:-->
		 * 		Method return number of characters available
		 * 		with in string..
		 */
		String MobileNumber="9030248855";
		int Length=MobileNumber.length();
		System.out.println("Mobile Number length is ---> "+Length);
		
		//Double equals compare two numbers and return true/false
		boolean flag4=Length==10;
		System.out.println("Mobile number available in 10 Digits --> "+flag4);
		
		
		/*
		 * SubString:-->
		 * 		Method get sub string characters from main string.
		 */
		String AccountNumber="100085859696";
		String LastDigits=AccountNumber.substring(8);
		System.out.println("Last 4 digit number ---> "+LastDigits);
		
		String Middledigits=AccountNumber.substring(4, 8);
		System.out.println("Middle 4 digit numbers ---> "+Middledigits);
		
		
		/*
		 * Trim:-->
		 * 	Method trim extra spaces with in String
		 * 		[It only Trims left and right spaces only]
		 */
		String PinCode="    500075    ";
		System.out.println("Before trim ---> "+PinCode.length());
		String NewPincode=PinCode.trim();
		System.out.println("After trim ---> "+NewPincode.length());

		
		/*
		 * isEmpty:-->
		 * 		Method verify string empty status and return
		 * 		boolean value true/false
		 */
		String var1="";
		String var2="Hi";
		System.out.println("var1 empty status is ---> "+var1.isEmpty());
		System.out.println("Var2 empty status is ---> "+var2.isEmpty());

		
		/*
		 * startswith:-->
		 * 			Method verify given string started with expected characters
		 * 			and return boolean value
		 */
		String Account_Number="1111222217777";
		boolean flag5=Account_Number.startsWith("1111");
		System.out.println("Starts with Comparision is --> "+flag5);

		
		/*
		 * endswith:-->
		 * 			Method verify given string ends with expected characters
		 * 			and return boolean value
		 */
		boolean flag6=Account_Number.endsWith("7777");
		System.out.println("ends with Comparision is --> "+flag6);
		
		
		/*
		 * ToLowerCase:-->
		 * 		method convert all Uppercase characters
		 * 		into lowercase
		 */
		String toolname="WebDriver";
		System.out.println(toolname.toLowerCase());
		
		/*
		 * toUppercase:-->
		 * 		method convert all lowercase characters 
		 * 		into uppercase
		 */
		System.out.println(toolname.toUpperCase());

		
		/*
		 * charsAt:-->
		 * 		Method return single character using index number
		 */
		String browsername="Chrome,Firefox";
		char ch=browsername.charAt(7);
		System.out.println("charcters available at 6th index number ---> "+ch);

		
		/*
		 * concat:-->
		 * 			Method club two string 
		 */
		String firstname="SunilReddy";
		String surname="gajjala";
		System.out.println(firstname.concat(surname));
		System.out.println(firstname+surname);
		
		
		/*
		 * replace:-->
		 * 		Replace old characters with New characters 
		 */
		String Rep=browsername.replace('F', 'G');
		System.out.println("After replace character is --> "+Rep);
		System.out.println(browsername.replaceAll("o", "i"));
		
		String Price="$25,000";
	    String NewPrice=Price.replace("$", "").replace(",", "");
	    System.out.println(NewPrice);
		
        String UniCode="&selenium& automation&";
        System.out.println(UniCode.replaceAll("&", ""));

		
		
		
	}

}
