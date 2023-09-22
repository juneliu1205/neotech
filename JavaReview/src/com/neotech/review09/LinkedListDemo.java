package com.neotech.review09;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {

		List<String> asia = new LinkedList<>(); // Up-casting

		asia.add("Taiwan");
		asia.add("Japan");
		asia.add(0, "Singapore");
		asia.add("Turkey");
		asia.add("Japan");
		asia.add("Taiwan");

		System.out.println("asia -> " + asia);

		// Task
		// Iterate the Asia list and remove duplicates
		// hint: you can create a new List, add the elements one by one
		// but first check if the new list CONTAINS the country

		// Create a new empty list
		List<String> asia2 = new LinkedList<>();

		for (String country : asia) {

			if (asia2.contains(country)) {
				System.out.println("The country " + country + " exits in the list");
			} else {
				asia2.add(country);
			}

		}
		System.out.println("asia2 -> " + asia2);

		System.out.println("----Doing the same with iterator----");

		List<String> asia3 = new LinkedList<>();

		Iterator<String> iter = asia.iterator();

		while (iter.hasNext()) {
			String country = iter.next();

			// Add it into the new list ONLY if it is not there yet
			if (!asia3.contains(country)) {
				asia3.add(country);
			}
		}
		System.out.println("asia3 -> " + asia3);

		// Task fo Olga
		// Try to do it in another way

	}

}