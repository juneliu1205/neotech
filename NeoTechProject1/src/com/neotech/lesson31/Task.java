package com.neotech.lesson31;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Task {

	public static void main(String[] args) {
		/*
		 * Create a Map from array of cities that will sort keys in alphabetical order.
		 * As a key store the name of the city and as a value store the length of the
		 * city (Example: Paris=5, Moscow =6, Washington DC=13 etc..). - If any city
		 * name is more than 7 characters remove that city
		 */
		
		
		String[] cities = {"London", "Ankara", "Paris", "Washington DC", "Rome"};
		
		
		Map<String, Integer> map = new TreeMap<>();
		
		for (String str : cities)
		{
			map.put(str, str.length());
		}
		
		//remove cities with length more than 7
		//NOTE: how does iterator work: 
			// Iterator< Object Type > name = collectionName.iterator();
 		
											//map.entrySet() -- this is a Set
		Iterator<Entry<String, Integer>> it = map.entrySet().iterator();
		
		//we could do this in two steps: 
		//		Set<Entry<String, Integer>> set = map.entrySet();
		//		Iterator<Entry<String, Integer>>  it = set.iterator();

		while(it.hasNext())
		{
			Entry<String, Integer> entry = it.next();
			if (entry.getValue() > 7)
			{
				it.remove();
			}
		}
		System.out.println(map);
		
		
		for (Entry<String, Integer> entry : map.entrySet())
		{
			// we can also get the values first, and the create the condition
			String key = entry.getKey();
			int value = entry.getValue();
			
			if (value > 7)
			{
				map.remove(key);
			}
		}
		
	}

}