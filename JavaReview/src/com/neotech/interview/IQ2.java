package com.neotech.interview;

public class IQ2 {

	public static void main(String[] args) {
		// Write a java program to check whether a given number is prime or not?
		// prime number is a number that is greater then 1.
		// Number 1 is NOT prime
		// prime number is divisible only by 1 and itself

		int number = 19; // Not prime, divisible by 1, 5, 7, 35
		boolean prime = true;

		if (number == 1) {
			prime = false;
		} else {

			for (int i = 2; i < number; i++) {

				if (number % i == 0) {
					System.out.println(number + " is divisible by " + i);
					prime = false;
					break;
				} else {
					System.out.println(number + " is NOT divisible by " + i);
				}

			}

		}

		System.out.println("--------------------------------");
		System.out.println(number + " is prime? " + prime);

	}

}