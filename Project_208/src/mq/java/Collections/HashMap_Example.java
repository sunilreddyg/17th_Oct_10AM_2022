package mq.java.Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Example {

	public static void main(String[] args) {
		
		
		/*
		 * HashMap:-->
		 		HashMap is non synchronized.
		 		HashMap allows one null key and multiple null values.				
		 */
		
		Map<Integer, String> map=new HashMap<>();
		map.put(100, "Iphone");
		map.put(101, "Samsung");
		map.put(102, "Vivo");
		map.put(null, "Vivo");
		map.put(104, null);
		map.put(105, null);
		
		
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
