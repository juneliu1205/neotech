package com.neotech.lesson32;
import java.util.*;
import java.util.Map.Entry;

public class Hw311 {
//	   Create a Map that will store Employee name and salary.
//	   Write a logic to retrieve an employee who gets the highest salary.
//	   Output should be in the below format
//		- John Smith=$100000

	public static void main(String[] args) {

		Map<String, Integer> empMap = new LinkedHashMap<>();

		empMap.put("Helen", 105000);
		empMap.put("Emre", 115000);
		empMap.put("Fulin", 99000);
		empMap.put("June", 125000);
		empMap.put("Ahmet", 95000);

		System.out.println(empMap);

		// Let's find the highest salary in the map
		Collection<Integer> salaries = empMap.values();
		System.out.println(salaries);

		int max = 0;

		// Let's use an enhanced for loop
		for (int s : salaries) {
			if (s > max) {
				max = s;
			}
		}

		System.out.println("The highest salary is -> " + max);

		// A short way to find the highest salary
		System.out.println(Collections.max(salaries));

		System.out.println("--------------------------------");

		Set<Entry<String, Integer>> entrySet = empMap.entrySet();

		Iterator<Entry<String, Integer>> it = entrySet.iterator();
		Entry<String, Integer> maxEntry = it.next();

		while (it.hasNext()) {
			Entry<String, Integer> entry = it.next();

			if (entry.getValue() > maxEntry.getValue()) {
				maxEntry = entry;
			}

		}

		System.out.println("The highest is -> " + maxEntry.getKey() + "=$" + maxEntry.getValue());

		// HW for lazy smart students
		// Get the keys using a keySet(), from there compare the values

		// HW for Olga
		// Print two people that have the highest salary

	}

}