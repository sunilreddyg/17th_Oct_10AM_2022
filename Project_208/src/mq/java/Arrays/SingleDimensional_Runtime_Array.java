package mq.java.Arrays;

public class SingleDimensional_Runtime_Array 
{

	public static void main(String[] args)
	{
		
		//Storing group of strings
		String mobile[]= {"iphone","samsung","vivo","opppo","mi","oneplus"};
		System.out.println(mobile[2]);
		System.out.println(mobile.length);
		
		
		//Storing group of numbers into array
		int num[]= {100,200,300,400};
		System.out.println(num[2]);
		
		
		//Storing group of array values into single reference
		Object obj[]= {"iphone",32000.00,true,3};
		String MyPhone=(String)obj[0];
		double price=(double) obj[1];
		boolean status=(boolean) obj[2];
		int quantity=(int) obj[3];
		
		System.out.println(MyPhone+"   "+price+"   "+status+"   "+quantity);
		
	}

}
