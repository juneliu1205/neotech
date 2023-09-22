package com.neotech.lesson06;

import java.util.Scanner;

public class HomeworkJava6 {

	public static void main(String[] args) {
		// Use Scanner
		// Use AND,OR Operator

		// 1. Ask the user to enter the height in inches. Person should be classified as
		// one of the following:
		// • short (under 60 inch)
		// • medium (between 60 -72 inch)
		// • tall (over 72 inch)

		//Scanner scan;
		//scan = new Scanner(System.in);

		//System.out.println("Please enter height in inches: ");
		//int number1 = scan.nextInt();

		//if (number1 <= 60) {
		//	System.out.println(number1 + " is short!");
		//} else if (number1 >= 60 && number1 <= 72) {
		//	System.out.println(number1 + " is medium!");
		//} else if (number1 > 72 && number1 <= 150) {
		//	System.out.println(number1 + " is tall!");
		//} else {
		//	System.out.println(number1 + " is wrong!");
		//}
		// Write a program that will ask for the day (a number from 1-7). Print whether
		// it is a weekend or weekday.
		// If any day from 1-5 → output "It is a weekday"
		// Any day from 6-7 → output "It is a weekend",
		// Any other day → output "Invalid day"
 
		Scanner scan;
		scan = new Scanner(System.in);

		System.out.println("What day is today? (number from 1-7)");
		int day1 = scan.nextInt();

		if (day1 >= 1 && day1 <= 5) {
			System.out.println(day1 + " is a weekday!");
		} else if (day1 >= 5 && day1 <= 7) {
			System.out.println(day1 + " is a weekend!");
		} else {
			System.out.println(day1 + "Invalid day!");
		
		}
		
	}

}
