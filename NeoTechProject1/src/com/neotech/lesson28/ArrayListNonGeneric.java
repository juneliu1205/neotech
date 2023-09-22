package com.neotech.lesson28;

import java.util.ArrayList;

public class ArrayListNonGeneric {

	public static void main(String[] args) {

		// Generic ArrayList
		ArrayList<Double> numbers = new ArrayList<>();

		numbers.add(4.5);
		numbers.add(3.2);
		numbers.add(8.6);
		numbers.add(7.1);
		// numbers.add("Billur"); // CE, You can ONLY store Double
		// numbers.add(5); // CE, This is NOT converted automatically

		System.out.println(numbers);

		// Replacing items in ArrayList
		numbers.set(1, 6.7);
		System.out.println(numbers);

		// numbers.set(5, 9.3);
		// If the is larger than the size, you will get IndexOutOfBoundsException

		// Remove items from ArrayList
		numbers.remove(0); // removing by index
		System.out.println(numbers);

		// numbers.remove(6.7); // removing by using object
		// System.out.println(numbers);

		// Get an element at index 2
		// int el = arr[2];
		System.out.println(numbers.get(2));

		// for loop
		for (int i = 0; i < numbers.size(); i++) {
			System.out.print(numbers.get(i) + " ");
		}
		System.out.println();

		// for-each loop
		// Auto-boxing and Auto-unboxing is done AUTOMATICALLY
		for (Double num : numbers) {
			System.out.print(num + "-");
		}

		System.out.println("\n--------------------------------");

		// Non-Generic ArrayList
		ArrayList list2 = new ArrayList();
		list2.add(3); // storing an Integer object
		list2.add("Mesut"); // storing a String object
		list2.add('$'); // storing a Character object
		list2.add(numbers); // storing a ArrayList object

		System.out.println(list2);

		// Retrieving all elements from Non-Generic ArrayList
		for (Object el : list2) {
			System.out.println(el);
		}
	}

}