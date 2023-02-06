package mq.java.Arrays;

public class Double_Dimesional_Runtime_Array {

	public static void main(String[] args) {
		
		
		String data[][]=
			{
					{"raju","9030245585"},
					{"sony","5454544444"},
					{"rohit","852225222"},
			};
		
		System.out.println(data[1][1]);
		
		
		
		
		//Runtime Dimensional array Object type
		Object obj[][]=
			{
					new Object[] {"Iphone",true},
					new Object[] {"Samsung",true},
					new Object[] {"Oneplus",false},
					new Object[] {"Oppo",true},
			};
		
		//By default print statement cast the value
		System.out.println(obj[1][0]);
		
		//Casting object to string value
		String OnePlus=(String) obj[2][0];
		System.out.println(OnePlus);
		

	}

}
