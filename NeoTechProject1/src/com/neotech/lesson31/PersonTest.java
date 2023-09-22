package com.neotech.lesson31;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class PersonTest {

	public static void main(String[] args) {

		Map<Integer, String> cities = new TreeMap<>();
		
		
		cities.put(2, "Tirana");
		cities.put(1, "Rome");
		cities.put(3, "Barcelona");
		
		for (Entry<Integer, String> entry : cities.entrySet())
		{
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		//how do the user defined objects work in maps
		Map<Integer, Person> people = new TreeMap<>();
		
		
		people.put(3, new Person("Emre", "Cinar", 25, 90000));
		people.put(2, new Person("Mert", "Sorkun", 28, 100000));
		people.put(1, new Person("Caglar", "Akcinar", 30, 140000));
		
		
		//loop through the entries
		
		for (Entry<Integer, Person> entry : people.entrySet())
		{
			System.out.println(entry.getKey() + " " + entry.getValue().name 
					+ " " + entry.getValue().lastName);
			
			
			entry.getValue().printDetails();
		}
		
	}

}