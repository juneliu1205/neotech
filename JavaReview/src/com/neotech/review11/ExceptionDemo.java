package com.neotech.review11;

public class ExceptionDemo {

	public static void main(String[] args) {
		int[] numbers = new int[3];

		try {

			for (int i = 0; i < 10; i++) {
				numbers[i] = i;
			}
			
			System.out.println("Will this line be executed?"); // NO
		} catch (Exception e) {
			// System.out.println(e);
			// System.out.println(e.getMessage());
			// e.printStackTrace();

			// Printing a meaningful message
			System.out.println("Error: You are storing an element outside of the array!");
		}

		System.out.println("Continue code execution...");

	}

}