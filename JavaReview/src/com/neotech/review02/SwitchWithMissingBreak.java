package com.neotech.review02;

public class SwitchWithMissingBreak {

	public static void main(String[] args) {

		int number = 5;

		switch (number) {
		case 3:
			System.out.println("3");
		case 4:
			System.out.println("4");
			break;
		case 5:
			System.out.println("5");
		case 6:
			System.out.println("6");
			break;
		case 7:
			System.out.println("7");
		default:
			System.out.println("The number was not 3,4,5,6,7");

		}
		// Limitation of switch
		// 1. you can't have duplicate cases
		// 2. you should be careful with break
		// 3. you can't have logical operators like in if-else

		if (number == 3 || number == 4) {
		}
		// 4. you can't use double
		double d = 3.4;
		if (d == 4.6) {
		}

	}

}
