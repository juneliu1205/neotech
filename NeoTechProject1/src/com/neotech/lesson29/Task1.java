package com.neotech.lesson29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Task1 {

	public static void main(String[] args) {

		//Create an arrayList with 6 names. 
		//Have at least 2 duplicates. 
		//How can you remove the duplicates from the ArrayList?
		
		List<String> ls = new ArrayList<>();
		ls.add("Merve");
		ls.add("Yahya");
		ls.add("merve");
		ls.add("mesut");
		ls.add("Yahya");
		ls.add("Merve");
		
		System.out.println(ls);
		
		//LinkedHashSet -- no duplicates, insertion order
		Set<String> lhs = new LinkedHashSet<>();
		lhs.addAll(ls);
		System.out.println(lhs);
		
		//HashSet -- no duplicates, no order
		Set<String> hs = new HashSet<>(ls); //passing a list as a constructor parameter
		System.out.println(hs);
		
		Set<String> ts = new TreeSet<>();
		ts.addAll(ls);
		System.out.println(ts);
		
		
		//how do I get a specific value
		if (lhs.contains("Merve"))
		{
			System.out.println("Contains Merve");
		}
		//to access specific elements, we can convert it back to a list
		List<String> list = new ArrayList<>(ts);
		//list.addAll(lhs);
		list.add(0, "Nur");
		list.add("Dogukan");
		System.out.println(list);
		//get the string with index 3
		System.out.println(list.get(3));
		
		
		//can we convert the set to an array?
		Object[] array = lhs.toArray();
		//Arrays have a utility class
		Arrays.sort(array);
		
		//for collections we have another utility class
		Collections.sort(list);
		System.out.println(list);
		
		
		
	}

}