package com.neotech.lesson29;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;


public class Homework2 {
//	Homework 2:
//	Create a Set of cities in which you want to make sure that insertion order 
//  is maintained. Using Iterator remove any city that starts with “A”;
//	    
	
	public static void main(String[] args) {
		
		Set<String> countries = new LinkedHashSet<>();
		countries.add("South Korea");
		countries.add("Hong Kong");
		countries.add("Taiwan");
		countries.add("Angola");
		countries.add("Japan");
		countries.add("Singapore");
		countries.add("Thailand");
		countries.add("Argentina");
		System.out.println(countries);
		
		
		Iterator<String> it = countries.iterator();
		
		while (it.hasNext()) 
		{
			String c= it.next();
			
			//if (c.contains("A")) 
			//{
			//	it.remove();
			//}
			if (it.next().startsWith("A")) {
				it.remove();
			}
		}
		System.out.println(countries);
	}
		
}