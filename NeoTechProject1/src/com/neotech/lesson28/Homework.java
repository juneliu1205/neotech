package com.neotech.lesson28;

import java.util.ArrayList;

public class Homework {
	// Create a ArrayList that will store 5 names into it.
	// ▪ Find out whether the given ArrayList is empty or not?
	// ▪ Check whether the specific name is present in an ArrayList or not?
	// ▪ Find the size of your ArrayList and print all values from the ArrayList

	public static void main(String[] args) {

		// Declare the ArrayList
		ArrayList<String> names = new ArrayList<>();

		// in arrays we use assign operator
		// arr[0] = "Can";

		// [Can, Julius, Helen, Smile, Caglar]
		names.add("Can");
		names.add("Helen");
		names.add("Smile");

		// [Can, Helen, Smile]
		names.add(1, "Julius");
		// [Can, Julius, Helen, Smile]

		names.add("Caglar");

		// Is the arraylist empty?
		System.out.println("Is the arraylist empty? " + names.isEmpty());

		// Does it contain Zeynep?
		System.out.println("Does it contain Zeynep? " + names.contains("Zeynep"));

		System.out.println("The size of ArrayList is -> " + names.size());
		
		System.out.println(names);
		
		for (String name : names) {
			System.out.print(name + " - ");
		}
	}
}