package com.neotech.interview;

public class IQ6 {

	public static void main(String[] args) {
		// Write a Java Program to find whether a String is palindrome or not?

		String original = "Aziza";

		// 1st way,reversing the string
		String reversed = IQ5.reverseOne(original);

		System.out.println(original + "<->" + reversed);

		if (original.equalsIgnoreCase(reversed)) {
			System.out.println(original + " is a Palindrome");
		} else {
			System.out.println(original + " is NOT a Palindrome");
		}

		System.out.println("----------------------------");

		// 2nd way, checking for symmetry
		boolean palindrome = true;
		int lastIndex = original.length() - 1;

		for (int i = 0; i < original.length() / 2; i++) {
			if (original.charAt(i) != original.charAt(lastIndex - i)) {
				palindrome = false;
				break;
			}
		}

		System.out.println(original + " is a Palindrome? " + palindrome);

	}
}