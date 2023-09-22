package com.neotech.lesson27;

import java.util.ArrayList;

public class ArrayListIntro {

	public static void main(String[] args) {
		int[] numbers = new int[4]; // you have to specify the size, and you
		// can not change it

		ArrayList<String> names = new ArrayList<>();
		int size = names.size();
		System.out.println("size:" + size);

		names.add("Mesut");
		names.add("Zeynep");
		names.add("Irem");
		System.out.println("size:" + names.size());

		System.out.println(names);

		System.out.println("Iterate the ArrayList with for loop");
		for (int i = 0; i < names.size(); i++) {
			String name = names.get(i);
			System.out.println(name);
		}

		System.out.println("Iterate the ArrayList with for-each loop");
		for (String name : names) {
			System.out.println(name);
		}

	}

}