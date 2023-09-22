package com.neotech.lesson16;

public class HomeWork2 {
//	Homework 2:
//    Create a String that should be combination of
//	letters, numbers and special characters.
//Find out how many alpha characters are there in
//	the String. (alpha characters means letters)
//
	public static void main(String[] args) {


String str = "Hello1234582758275@#$%#$^%#&All94854%#$";
		
		
		
		//[0-9] --> any numbers
		//[a-z] --> all lowercase letters
		//[A-Z] --> All uppercase letters
		//[a-zA-Z] --> all letters
		//[0-9a-zA-Z] -- All numbers and letters
		//[^0-9a-zA-Z] --> anything that is not a number or a letter
		
		//[abc] -- same as -- [a-c]
		//[^abc]
		
		//. --> any character
		//\d --> same as [0-9]
		//\s --> a white space character 
		
		
		//\s+ --> one or more space
	
		String str2 = str.replaceAll("[^a-zA-Z]", "");
		System.out.println(str2);
		
		System.out.println("How many alpha characters are there? " + str2.length());
		
		//what if I want to find out how many numbers are there?
		System.out.println("How many numbers are there? " + str.replaceAll("[^0-9]", "").length());
		
		//what if I want to find out how many special characters I have?
		System.out.println(str.replaceAll("[0-9a-zA-Z]", "").length());
		
		
		//common issues
		String str3 = str.replaceAll("a-z", "-"); //not a regex -- regular expression
		String str4 = str.replaceAll("[az]", ""); //this only means a and z, not a to z
		
	


	String letters = "J";
	String numbers = "1024";
	String c="$";
	String many=letters+numbers+c;

	int size= many.length();
	System.out.println("The length of the string is: " + size);
 


	}

}
