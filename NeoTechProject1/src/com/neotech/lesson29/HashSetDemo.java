package com.neotech.lesson29;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {

		HashSet<String>  breakfast = new HashSet<>();
		
		
		breakfast.add("eggs");
		breakfast.add("bread");
		breakfast.add("cheese");
		breakfast.add("eggs");
		breakfast.add("tea");
		breakfast.add("coffee");
		
		int size = breakfast.size();
		System.out.println("The size of the set is: " + size);
		
		System.out.println(breakfast);
		
		//get all elements using a for each loop
		for (String item : breakfast)
		{
			System.out.print(item + " ");
		}
		System.out.println();
		
		//can we use an iterator
		Iterator<String> it = breakfast.iterator();
		
		while(it.hasNext())
		{
			System.out.print(it.next() + " ");
		}
		System.out.println();
		
		
	}

}