package com.neotech.lesson17;

public class HomeWork3 {

	public static void main(String[] args) {
//		Homework 3: 
//			Find out how many alpha characters are present in a String?
//			Find number of words in string?
//
//		Homework 4:
//			Write a java program to reverse String? Reverse a string word
//			by word?
//
//		Homework 5:
//			You have a String a = “Is it saturday? Is it raining? Do we have
//			a Java Class today?” How would you find out how many
//			sentences are in that String?

		String str = "How many alpha characters are present in a String?";

		String str2 = str.replaceAll("[^a-zA-Z]", "");
		System.out.println("How many alpha characters are there? " + str2.length());
		
	System.out.println("-------------------------------------------------------");	
		
		StringBuffer sb = new StringBuffer("I need a vacation");
		System.out.println(sb.reverse());
		
	System.out.println("-------------------------------------------------------");
		

	String sentence2 = "Is it saturday? Is it raining? Do we have a Java Class today?";
	String[] result2 = sentence2.split(" ");
	for (String sentences : result2){
	}
	System.out.println("This sentence has " + result2.length + " words!");
		
		
		
		
	}

}
