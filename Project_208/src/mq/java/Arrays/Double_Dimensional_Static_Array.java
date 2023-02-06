package mq.java.Arrays;

public class Double_Dimensional_Static_Array 
{

	public static void main(String[] args) 
	{
		
		
		String data[][]=new String[3][2];

		//Storing first row data
		data[0][0]="Raju";
		data[0][1]="9030248855";
		
		//Storing Second row data
		data[1][0]="Sam";
		data[1][1]="9030243333";
		
		//Storing 3rd row data
		data[2][0]="sony";
		data[2][1]="4545454545";
		
		
		
		String Mobile=data[1][1];
		System.out.println(Mobile);
		
		
		//Get Array Length
		System.out.println(data.length);
		
	}

}
