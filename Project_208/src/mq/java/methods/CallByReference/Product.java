package mq.java.methods.CallByReference;

import mq.java.methods.TypesofMethods.CallByValues;

public class Product 
{
	
	public String name="Iphone";
	public double price=750000.00;
	
	public void selectProduct()
	{
		System.out.println("Product hase been selected");
	}
	
	
	public String GetDetails()
	{
		return "64GB, Blue Color";
	}
	
	public CallByValues Sample()
	{
		return new CallByValues();
	}
	

}
