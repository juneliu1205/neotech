package com.neotech.review01;

import java.util.Scanner;

public class TaskOneCalculator {

	// Ask the user to enter 2 numbers
	// Ask the user for the operator (+,-,*,/)
	// Solve it using if-else
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter the first number:");
		double d1 = input.nextDouble();

		System.out.println("Please enter the second number:");
		double d2 = input.nextDouble();

		// System.out.println(d1 + d2);

		System.out.println("Please enter the operator (+,-,*,/):");
		String operator = input.next();

		
		double result = 0;
		if (operator.equals("+")) {
			result = d1+d2; 
			//System.out.println("The result is " + (d1 + d2));

		} else if (operator.equals("-")) {
			result = d1 - d2;
			//System.out.println("The result is " + (d1 - d2));

		} else if (operator.equals("*")) {
			result = d1 * d2;
		//	System.out.println("The result is " + (d1 * d2));

		} else if (operator.equals("/")) {
			result = d1 / d2;
			//System.out.println("The result is " + (d1 / d2));
		} else {
			System.out.println("Invalid operatoe!");
		}
			
		if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
			
		System.out.println("The result is -> " + result);}
		

		

	}

}
