package com.neotech.lesson06;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// Write a program that asks user to enter two numbers and prints
		// which one is larger.
		Scanner scan;
		scan = new Scanner(System.in);

		System.out.println("Please enter first numbers: ");
		int number1 = scan.nextInt();

		System.out.println("Please enter second numbers: ");
		int number2 = scan.nextInt();

		if (number1 > number2) {
			System.out.println(number1 + " is larger than " + number2);
		} else if (number1 < number2) {
			System.out.println(number2 + " is larger than " + number1);
		} else {
			System.out.println(number1 + " is equal to " + number2);
		}

	//Scanner name = new Scanner(System.in);
	//name.next (); --->read into a String
	//name.nexrTnt (); ---> read into a int
	//name.nextDouble (); --->it will read into a double
	//name.nextBoolean (); --->it will read into a boolean	
	
	}

}
