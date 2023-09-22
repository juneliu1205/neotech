package com.neotech.lesson17;

public class HomeWork2 {

		// Write a program to print out the following conversion:
		// Today is Tuesday and we have a Java Class!!! to
		// yadoT si yadseuT dna ew evah a avaJ !!!ssalC.
		public static void main(String[] args) {
			String str = "Today is Tuesday and we have a Java Class!!!";
			// Two steps: 1. split the sentence into words
			// 2. reverse every word
			String[] words = str.split(" ");
			
			HomeWork2 hw2 = new HomeWork2();
			for (String word : words) {
				// 1st way
				// String reversedWord = hw2.reverseString(word);
				// System.out.print(reversedWord + " ");
				// 2nd way
				StringBuffer strBuffer = new StringBuffer(word);
				strBuffer.reverse();
				System.out.print(strBuffer + " ");
			}
		}
		String reverseString(String input) {
			String reversed = "";
			char[] letters = input.toCharArray();
			for (int i = input.length() - 1; i >= 0; i--) {
				reversed += letters[i];
			}
			return reversed;
		}
	}