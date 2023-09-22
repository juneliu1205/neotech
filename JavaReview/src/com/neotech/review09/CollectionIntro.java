package com.neotech.review09;

import java.util.*; // Imports all the classes under java.util package

public class CollectionIntro {

	public static void main(String[] args) {

		// List is an Interface
		// List<String> names = new List<>();

		List<String> africa = new ArrayList<>(); // Up-casting
		africa.add("Morocco");
		africa.add("Kenya");
		africa.add("Senegal");
		africa.add(0, "Congo"); // Adding to the list with an index

		System.out.println("africa1 -> " + africa);

		// 2nd way of filling an ArrayList
		List<String> africa2 = new ArrayList<>(); // Creating an empty list
		africa2.addAll(africa);
		System.out.println("africa2 -> " + africa2);

		// 3rd way of filling an ArrayList
		List<String> africa3 = new ArrayList<>(africa); // Creating an filled list
		System.out.println("africa3 -> " + africa3);

		System.out.println("--------------------------------");
		// There are 3 ways to iterate a list

		for (int i = 0; i < africa.size(); i++) {
			String country = africa.get(i);
			System.out.print(country + " ");
		}
		System.out.println();

		for (String country : africa) {
			System.out.print(country + " ");
		}
		System.out.println();

		System.out.println("----Using Iterator----");
		Iterator<String> iterator = africa.iterator();

		while (iterator.hasNext()) {
			String country = iterator.next();
			System.out.print(country + " ");
		}
		System.out.println();

		System.out.println("--------------------------------");

		// This is same as Non-Generic
		// ArrayList<Object> list = new ArrayList();

		ArrayList europe = new ArrayList(); // Non-Generic
		europe.add("Italy");
		europe.add(5.5);
		europe.add(true);

		for (Object element : europe) {
			System.out.println(element);
		}

	}
}