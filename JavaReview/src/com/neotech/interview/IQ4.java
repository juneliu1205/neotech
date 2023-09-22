package com.neotech.interview;

public class IQ4 {

	public static void main(String[] args) {
		// Find out how many alpha characters are present in a String?
		// Find number of words in string?

		String str = "dfg%^&DF3434  ere  @#67";

		// Let's replace the characters that are not letters with empty string
		// String is immutable. If you want to update, you need to re-assign
		str = str.replaceAll("[^a-zA-Z]", "");

		System.out.println(str);

		System.out.println("The number of alpha characters = " + str.length());

		System.out.println("--------------------------------");

		String longStr = "bye bye Java hello Selenium";
		String[] words = longStr.split(" ");

		System.out.println("The number of words in the string = " + words.length);
		for (String w : words) {
			System.out.println(w);
		}

	}

}