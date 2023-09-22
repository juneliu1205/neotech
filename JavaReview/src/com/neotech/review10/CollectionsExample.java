package com.neotech.review10;
import java.util.*;

public class CollectionsExample {

	public static void main(String[] args) {
		// Collections Framework -- All interfaces and implementations
		// Collection Interface -- Only one interface
		// Collections -- It is a helper/utility class

		Set<Integer> numbers = new HashSet<>(); // Up-casting
		numbers.add(23);
		numbers.add(34);
		numbers.add(95);
		numbers.add(62);
		numbers.add(18);
		numbers.add(41);

		System.out.println(numbers);

		Integer min = Collections.min(numbers);
		System.out.println("min -> " + min);

		System.out.println("max -> " + Collections.max(numbers));

		// SET cannot be sorted/ordered
		// Collections.sort(numbers);

		// LIST can be sorted/ordered
		List<Integer> numberList = new ArrayList<>(numbers);
		System.out.println("List before sorting -> " + numberList);

		Collections.sort(numberList);
		System.out.println("List after sorting -> " + numberList);

		System.out.println("--------------------------------");

		List<String> students = new LinkedList<String>();
		students.add("Mesut");
		students.add("Alban");
		students.add("Nur");
		students.add("Burhan");
		System.out.println(students);

		String first = Collections.min(students);
		System.out.println("first -> " + first);
		System.out.println("last -> " + Collections.max(students));

		Collections.sort(students);
		System.out.println(students);

		System.out.println("--------------------------------");

		int[] arr = { 9, 4, 2, 6, 1 };
		Arrays.sort(arr);

		System.out.println(Arrays.toString(arr));
		

	}

}