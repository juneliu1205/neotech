package com.neotech.lesson31;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Homework2 {
//Create the collection that will store single unique objects of a String 
//type in which order is preserved. Write a logic to concatenate all string 
//from the collection.
	
	public static void main(String[] args) {
		
		Set<String> objects = new LinkedHashSet<>();
		objects.add("apple");
		objects.add("kiwi");
		objects.add("grape");
		objects.add("banana");
		objects.add("watermelon");
		
		System.out.println(objects);
		
Iterator<String> it = objects.iterator();
		
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		System.out.println();
		
	}

}
