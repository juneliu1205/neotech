package com.neotech.lesson29;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Homework1 {
//Homework 1:
//Create a Set collection in which you need to add names of the countries. 
//In this set we want all objects to be sorted in alphabetical order. 
//Using 2 different ways retrieve all elements from set.

	public static void main(String[] args) {
	
				Set<String> countries = new TreeSet<>();
				countries.add("South Korea");
				countries.add("Hong Kong");
				countries.add("Taiwan");
				countries.add("Japan");
				countries.add("Singapore");
				countries.add("Thailand");
				
	for (String ele : countries)	{
		System.out.print(ele+ ", ");
	}
	System.out.println();
	
			
	Iterator<String> it = countries.iterator();
	while (it.hasNext()) {
		System.out.print(it.next()+", ");
	}
	System.out.println();
}
	
	
	}
