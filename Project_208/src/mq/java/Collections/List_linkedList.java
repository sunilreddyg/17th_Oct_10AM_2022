package mq.java.Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class List_linkedList {

	public static void main(String[] args) {
		
		/*
		 * List Accept duplicates,
		 * List store object with in order
		 */
		
		
		List<String> list=new LinkedList<String>();
		list.add("iphone");
		list.add("vivo");
		list.add("samsung");
		list.add("oneplus");
		list.add("vivo");
		list.add("Oppo");
		
		
		//Method get Single object from collection..
		String IndexObj=list.get(3);
		System.out.println(IndexObj);
		
		//Removing object from collection using name
		list.remove("oneplus");
		
		//Get size of collection
		int Count=list.size();
		System.out.println("Object Count is --> "+Count);
		
		
		//Verify Object presented at collection
		boolean flag=list.contains("oneplus");
		System.out.println("Object presented status is --> "+flag);
		
		
		//Read first iterator object
		String itr=list.iterator().next();
		System.out.println("First Iterator value is ---> "+itr);
		
		
		//Clear Collection Data
		//list.clear();
		
		//Check Collection Empty status
		boolean flag1=list.isEmpty();
		System.out.println("Collection empty status is --> "+flag1);
		
		
		//Reading collection of object using for loop
		for (int i = 0; i < list.size(); i++) 
		{
			String Object=list.get(i);
			System.out.println("=>"+Object);
		}
		
		
		//Reading Collection of object using Foreach loop
		for (String EachObj : list) 
		{
			System.out.println("*"+EachObj);
		}
		
		
		
		//Read data using while loop
		Iterator<String> iterator=list.iterator();
		while(iterator.hasNext())
		{
			String Eachiterator=iterator.next();
			System.out.println(Eachiterator);
		}
		
		
		//Read Object using iteratble 
		for (Iterator iterator2 = list.iterator(); iterator2.hasNext();) 
		{
			String ItrObj = (String) iterator2.next();
			System.out.println(ItrObj);
		}
		


	}

}
