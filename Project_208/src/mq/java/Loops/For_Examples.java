package mq.java.Loops;

public class For_Examples 
{
	
	public static void main(String[] args)
	{
		
		//Print Numbers 1 to 10
		for (int i = 1; i <= 10; i++) 
		{
			System.out.println(i);
		}
		
		
		//Print number 10 to 1
		for (int i = 10; i > 0; i--) 
		{
			System.out.println(i);
		}
		
		
		//print array values
		String mobiles[]= {"iphone","samsung","vivo","oneplus","oppo"};
		
		
		for (int i = 0; i < mobiles.length; i++) 
		{
			String EachMobile = mobiles[i];
			System.out.println(EachMobile);
		}
		
		
		//break keyword with for loop
		for (int i = 1; i <= 5; i++) 
		{
			if(i==3)
			{
				break;
			}
			System.out.println(i);
		}
		
		
		
		//Continue Keyword with for loop
		for (int i = 0; i <= 5; i++) 
		{
			
			if(i==3)
			{
				continue;
			}
			System.out.println(i);
			
		}
		
		
		//Conduct sum between 1 to 100 Numbers
		int sum=0;
		for (int i = 1; i <= 100; i++)
		{
			sum=sum+i;
		}
		System.out.println("total is --> "+sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
