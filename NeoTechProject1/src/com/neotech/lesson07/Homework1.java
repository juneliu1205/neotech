package com.neotech.lesson07;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {

		// Ask the user to enter the height in inches. Person should be classified as
		// one of the following:
		// • short (under 60 inch)
		// • medium (between 60 -72 inch)
		// • tall (over 72 inch)

		Scanner scan;
		scan = new Scanner(System.in);

		System.out.println("Please enter height in inches: ");
		int height = scan.nextInt();

		if (height <= 60) {
		System.out.println(height + " Classified as short!");
		} else if (height >= 60 && height <= 72) {
		System.out.println(height + " Classified as medium!");
		} else if (height > 72 && height <= 150) {
		System.out.println(height + " Classified as tall!");
		} else {
		System.out.println(height + " is wrong!");
		}
	}

}
