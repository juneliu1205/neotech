package com.neotech.review09;

import java.util.ArrayList;
import java.util.Iterator;

public class WrapperList {

	public static void main(String[] args) {

		// ArrayList can only store objects/classes
		// ArrayList<int> nums = new ArrayList<>();

		ArrayList<Integer> numbers = new ArrayList<>();

		boolean isEmpty = numbers.isEmpty();
		System.out.println("Is it empty? " + isEmpty);
		System.out.println("The size is -> " + numbers.size());

		numbers.add(new Integer(4)); // This is the long way
		numbers.add(6); // auto-boxing
		numbers.add(8);
		numbers.add(1);

		System.out.println("The size is -> " + numbers.size());

		// List is an Interface
		// ArrayList and LinkedList are two classes implementing the List Interface

		boolean contains = numbers.contains(8);
		System.out.println("Does the list contain the number 8 -> " + contains);

		System.out.println(numbers);

		// numbers.remove(1); // remove by index
		numbers.remove(new Integer(1)); // remove by object
		System.out.println(numbers);

		System.out.println("How can we iterate the ArrayList?");

		System.out.println("-> 1st way, using normal for loop");

		for (int i = 0; i < numbers.size(); i++) {
			int element = numbers.get(i); // Auto-UnBoxing
			System.out.println(element);
		}

		System.out.println("-> 2nd way, using enhanced for loop");

		for (Integer element : numbers) {
			System.out.println(element);
		}

		System.out.println("-> 3rd way, using iterator");

		Iterator<Integer> it = numbers.iterator(); // get the iterator from the list

		// There are 3 methods in the Iterator class
		// it.hasNext(); // This method will return true/false if there is a next
		// element
		// it.next(); // This method will return the next element from the list
		// it.remove(); // This method will the current element from the list

//		System.out.println(it.next()); // Move to the next element and get it
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next()); // Run-time Error

		while (it.hasNext()) {
			int element = it.next();
			System.out.println(element);
		}

		// This is Alban :)
		numbers.set(1, 9); // replacing the element at index 1
		System.out.println(numbers);
	}
}