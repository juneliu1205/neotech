package com.neotech.lesson28;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {

	public static void main(String[] args) {

		ArrayList<String> choco = new ArrayList<>();
		choco.add("Kinder");
		choco.add("Hershey");
		choco.add("Godiva");

		ArrayList<String> sweets = new ArrayList<>();
		sweets.add("Baklava");
		sweets.add("Tiramisu");
		sweets.add("Tres Leches");

		// Add all elements of choco on the sweets ArrayList
		sweets.addAll(choco);
		System.out.println("The size of sweets is: " + sweets.size());
		System.out.println(sweets);

		// Iterate
		// We can iterate using Normal for loop
		// We can iterate using Advanced for loop
		// We can iterate using Iterator

		// Iterator for string objects -- to iterate the objects of sweets ArrayList
		Iterator<String> it = sweets.iterator();

		// it.hasNext() checks if there are any more elements
		while (it.hasNext()) {
			String element = it.next(); // Get the next element
			System.out.print(element + " - ");

			if (element.equals("Kinder")) {
				it.remove();
			}
		}
		System.out.println();

		System.out.println(sweets);

		// Advanced for loop
		for (String str : sweets) {
			System.out.print(str + " - ");
		}
		System.out.println();

		// Normal for loop
		// Use this loop if you want to iterate backwards
		for (int i = sweets.size() - 1; i >= 0; i--) {
			System.out.print(sweets.get(i) + " = ");
		}
		System.out.println();

	}

}