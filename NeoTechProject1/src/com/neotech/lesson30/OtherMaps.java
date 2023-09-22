package com.neotech.lesson30;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class OtherMaps {

	public static void main(String[] args) {
		// Treemap: Will order the entries(pairs) alphabetically according to KEY

		Map<String, Integer> groceries = new TreeMap<>();

		groceries.put("Milk", 2);
		groceries.put("Bread", 3);
		groceries.put("Eggs", 12);
		// groceries.put(3, "Oil"); CE, key has to be string, value has to be int
		groceries.put("Oil", 3);
		groceries.put("Apples", 2);
		System.out.println(groceries);

		groceries.replace("Eggs", 6);
		System.out.println(groceries);

		Set<String> keys = groceries.keySet();
		System.out.println(keys);

		Collection<Integer> values = groceries.values();
		System.out.println(values);

		// iterate through the keys
		for (String key : keys) {
			System.out.println(key);
		}

		// iterate through the values
		Iterator<Integer> it = values.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}