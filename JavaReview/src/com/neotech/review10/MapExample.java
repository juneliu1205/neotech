package com.neotech.review10;

import java.util.*;
import java.util.Map.Entry;

public class MapExample {
	// Map
	// HashMap | LinkedHashMap | TreeMap | HashTable

	public static void main(String[] args) {

		Map<Integer, String> phoneBook = new HashMap<>();
		phoneBook.put(123456789, "John Smith");
		phoneBook.put(234567890, "Julia Roberts");
		phoneBook.put(345678901, "Donald Trump");
		phoneBook.put(111111111, "Obama");
		phoneBook.put(678901234, "Brad Pitt");
		phoneBook.put(409384756, "John Smith");

		// It will replace Julia Roberts with Emre
		phoneBook.replace(234567890, "Emre");

		// Another way to replace
		// phoneBook.put(234567890, "Emre");

		System.out.println(phoneBook);

		// Map is one-directional, from key to value
		// There is NO way to go from the value to the key
		String name = phoneBook.get(234567890);
		System.out.println(name + " is calling....");

		name = phoneBook.get(9999);
		System.out.println(name + " is calling....");

		boolean containsK = phoneBook.containsKey(9999);
		System.out.println("9999 is in map -> " + containsK);

		boolean containsV = phoneBook.containsValue("Julia Roberts");
		System.out.println("Julia Roberts is in my contact list -> " + containsV);

		phoneBook.remove(345678901); // Will remove the pair/entry from my map
		System.out.println(phoneBook);

		System.out.println("The size of my phonebook is -> " + phoneBook.size());

		// Let's get all the keys and store them in a SET
		System.out.println("--------phoneBook.keySet()--------");

		Set<Integer> numbers = phoneBook.keySet();
		System.out.println(numbers);

		Iterator<Integer> itNums = numbers.iterator();
		while (itNums.hasNext()) {
			Integer number = itNums.next();

			// Find the name/value by using the number/key
			String personName = phoneBook.get(number);
			System.out.println(number + " -> " + personName);
		}

		// Let's get all the values and store them in a COLLECTION
		System.out.println("--------phoneBook.values()--------");

		Collection<String> names = phoneBook.values();
		System.out.println(names);

		for (String element : names) {
			System.out.println(element);

			// from the value we CANNOT find the key
			// phoneBook.get(element);
		}
		
        // Task until 1:35
        // Get the Entries from the Map
        // Iterate them using Enhanced for loop
        // Iterate them using Iterator

		Set<Entry<Integer, String>> allEntries	= phoneBook.entrySet();
		
		for (Entry<Integer, String> entry : allEntries)
		{
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+"-->"+value);
		}
		System.out.println("---------------------------------------------------");
		
		Iterator<Entry<Integer, String>> it = allEntries.iterator();
		while(it.hasNext())
		{
			Entry<Integer, String> entry = it.next();
			
			System.out.println(entry.getKey()+ " --> " + entry.getValue());
		}
	}
}