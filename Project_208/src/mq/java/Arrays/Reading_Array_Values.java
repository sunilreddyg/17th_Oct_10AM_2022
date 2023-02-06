package mq.java.Arrays;

public class Reading_Array_Values {

	public static void main(String[] args) {
		
		
		//Storing group of strings
		String mobile[]= {"iphone","samsung","vivo","opppo","mi","oneplus"};
		System.out.println(mobile[2]);
		System.out.println(mobile.length);
		
		for (String EachMobile : mobile)
		{
			if(EachMobile.contains("vivo"))
			{
				System.out.println("Vivo Mobile selected");
				break;
			}
		}
		
				
		//Storing group of numbers into array
		int num[]= {100,200,300,400};
		System.out.println(num[2]);
		
		for (int i : num) 
		{
			System.out.println(i);
		}
				

	}

}
