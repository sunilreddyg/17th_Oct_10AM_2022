package mq.java.Collections;

import java.util.Hashtable;
import java.util.Map;

public class HashTable_Example {

	public static void main(String[] args) {
		
		/*
		    HashTable:-->
		 		HashTable is synchronized.
		 		Hashtable doesn't allow any null key or value.	
		 		
		 		Note:--> Throw Nullpointer exception in case
		 				 any key or value null defined
		 */
		
		
		Map<Integer, String> map=new Hashtable<>();
		map.put(100, "Iphone");
		map.put(101, "Samsung");
		map.put(102, "Vivo");
		map.put(103, "Oppo");
		map.put(104, "Oneplus");
		map.put(105, "MI");
		
		
		//get Object value using keyname
		String Phone=map.get(101);
		System.out.println(Phone);
		
		
		//Check Key available
		boolean flag=map.containsKey(102);
		System.out.println("Key Contains status is --> "+flag);
		
		//Check Value available
		boolean flag1=map.containsValue("iphone");
		System.out.println("value Contain status is ---> "+flag1);
		
		//using foreach loop read 
		for (Integer keys : map.keySet()) 
		{
			System.out.println(map.get(keys));
		}
		
		

	}

}
