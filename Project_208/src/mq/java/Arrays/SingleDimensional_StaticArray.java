package mq.java.Arrays;

public class SingleDimensional_StaticArray 
{

	public static void main(String[] args) 
	{
		
		//String array to store group of strings
		String mobile[]=new String[5];
		mobile[0]="iphone";
		mobile[1]="samsung";
		mobile[2]="Vivo";
		mobile[3]="oppo";
		mobile[4]="OnePlusg";
		
		
		String SelectedMobile=mobile[2];
		System.out.println(SelectedMobile);
		
		
		//Get array length
		int len=mobile.length;
		System.out.println("Array length is --> "+len);
		
		//Integer array to store group of integer values
		int num[]=new int[4];
		num[0]=100;
		num[1]=200;
		num[2]=300;
		num[3]=400;
		
		int IndexNumber=num[3];
		System.out.println(IndexNumber);
		
		
		//Storing group of array values into single reference
		Object obj[]=new Object[4];
		obj[0]="Iphone";
		obj[1]=25000.00;
		obj[2]=true;
		obj[3]=3;
		
		System.out.println(obj[0]+"  "+obj[1]+"   "+obj[2]+"  "+obj[3]);
		
		String MyPhone=(String)obj[0];
		double price=(double) obj[1];
		boolean status=(boolean) obj[2];
		int quantity=(int) obj[3];
		
		System.out.println(MyPhone+"   "+price+"   "+status+"   "+quantity);
	}

}
