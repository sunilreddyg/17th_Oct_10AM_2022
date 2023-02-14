package mq.java.Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Interface_HashSet {

	public static void main(String[] args) {
		
		
		/*
		 * => Set is a unorder collection of objects
		 * => Set doesn't allow duplicates
		 */
		 
		Set<String> set=new HashSet<String>();
		set.add("iphone");
		set.add("vivo");
		set.add("samsung");
		set.add("oneplus");
		set.add("vivo");
		set.add("Oppo");
		
		
		//Removing object from collection using name
		set.remove("oneplus");
		
		//Get size of collection
		int Count=set.size();
		System.out.println("Object Count is --> "+Count);
		
		
		//Verify Object presented at collection
		boolean flag=set.contains("oneplus");
		System.out.println("Object presented status is --> "+flag);
		
		
		//Read first iterator object
		String itr=set.iterator().next();
		System.out.println("First Iterator value is ---> "+itr);
		
		
		//Clear Collection Data
		//set.clear();
		
		//Check Collection Empty status
		boolean flag1=set.isEmpty();
		System.out.println("Collection empty status is --> "+flag1);
		
		
		
		//Reading Collection of object using Foreach loop
		for (String Eachset : set) 
		{
			System.out.println(Eachset);
		}
		
		
		
		//Read data using while loop
		Iterator<String> iterator=set.iterator();
		while(iterator.hasNext())
		{
			String Eachiterator=iterator.next();
			System.out.println(Eachiterator);
		}
		
		
		
		
		

	}

}
