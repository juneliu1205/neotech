package com.neotech.lesson27;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<Integer>();

		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(15);

		System.out.println("index no 2:" + numbers.get(2));
		System.out.println("size:" + numbers.size());

		System.out.println("Does contain 15? " + numbers.contains(15));
		System.out.println("Does contain 25? " + numbers.contains(25));

		System.out.println(numbers);

		System.out.println("iterating with a for loop");
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}

		System.out.println("iterating with a for-each loop");
		for (Integer number : numbers) {
			System.out.println(number);
		}
	}

}