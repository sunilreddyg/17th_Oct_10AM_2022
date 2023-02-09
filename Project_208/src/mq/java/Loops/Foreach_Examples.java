package mq.java.Loops;

public class Foreach_Examples 
{

	public static void main(String[] args) 
	{
		//Reading array value using foreach loop
		String browsers[]= {"chrome","firefox","safari","opera"};
		for (String eachbrowser : browsers) 
		{
			if(eachbrowser.equals("safari"))
			{
				System.out.println("Browser available");
				break;
			}
		}
		
		
		//Read integer values using foreach loop
		int num[]= {100,200,300,400};
		for (int i : num) 
		{
			System.out.println(i);
		}
		
		
		//User Data using double dimensional array
		String data[][]=	
						{
								{"Aakash","EID001"},
								{"Dhanush","EID002"},
								{"pavan","EID003"},
						};
		
		
		for (String[] Row : data) 
		{
			System.out.println(Row[0]+"     "+Row[1]);
		}
		
		

	}

}
