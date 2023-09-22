package com.neotech.lesson28;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>();

		LinkedList<String> list2 = new LinkedList<>();
		list2.add("Bianca");
		list2.add("Ahmet");
		list2.add(1, "Olga");
		list2.add("Dogukan");

		System.out.println(list2);

		System.out.println("The size of the LinkedList -> " + list2.size());

		// Getting element using the index
		for (int i = 0; i < list2.size(); i++) {
			System.out.print(list2.get(i) + " ");
		}
		System.out.println();

		System.out.println("--------------------------------");

		// Enhanced for loop
		for (String person : list2) {
			System.out.print(person + " ");
		}
		System.out.println();

		System.out.println("--------------------------------");

		// Iterator
		Iterator<String> it = list2.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}