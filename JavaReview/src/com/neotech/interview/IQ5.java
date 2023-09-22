package com.neotech.interview;

public class IQ5 {

	public static void main(String[] args) {
		// Write a java program to reverse String?
		// Reverse a string word by word?

		String str = "NeoTech";

		// 1st way
		System.out.println("reverse str -> " + reverseOne(str));

		// 2nd way
		System.out.println("reverse str -> " + reverseTwo(str));

		// 3rd way, using StringBuffer
		StringBuffer sb = new StringBuffer(str);
		sb.reverse(); // StringBuffer is mutable
		System.out.println("reverse string using StringBuffer -> " + sb);

		System.out.println("--------------------------------");
		// Second part of the question: Reverse a string word by word?

		String longStr = "bye bye Java hello Selenium";
		System.out.println(longStr);

		String[] words = longStr.split(" ");

		String reverseSentence = "";

		// start from the last element to the first one
		for (int i = words.length - 1; i >= 0; i--) {
			reverseSentence += words[i] + " ";
		}

		System.out.println(reverseSentence);
	}

	public static String reverseOne(String str) {
		// 1st way, using charAt()

		String reverseStr = "";

		// Starting from the last character to the first one
		for (int i = str.length() - 1; i >= 0; i--) {
			reverseStr += str.charAt(i);
		}

		return reverseStr;
	}

	public static String reverseTwo(String str) {
		// 2nd way, using toCharArray()

		String reverseStr = "";

		char[] chArray = str.toCharArray();

		// Getting the char from the array one by one, backwards
		for (int i = chArray.length - 1; i >= 0; i--) {
			reverseStr += chArray[i];
		}

		return reverseStr;
	}

}