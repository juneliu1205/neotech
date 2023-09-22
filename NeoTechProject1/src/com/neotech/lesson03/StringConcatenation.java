package com.neotech.lesson03;

public class StringConcatenation {

	public static void main(String[] args) {

		System.out.println("Hello" + " " + "World");

		String language = "Python";
		System.out.println("I love" + " " + language);
		System.out.println("I love Java");

		String s1 = "I love";
		String s2 = "Programming";
	
		// I am sorry, I am going back to my first love

		// re-assigning again
		language = "Java";

		System.out.println(s1 + " " + language + " " + s2);

		// spacing in String

		System.out.println(        "Joyce");
		System.out.println("          Joyce");
		
		//String + number
		System.out.println("I am scared of " + 13);
		
		String s3 = "I am " + 2; // I am 2
		String s4 = s3  + 5; // I am 25
		System.out.println(s3);
	    System.out.println(s4);
	
	    //order of operations in a string
	    System.out.println("I have " + 2 + 4 + " apples!");
	    //1. I have 2
	    //2. I have 24
	    //3. I have 24 apples!
	    
	    System.out.println("I have " + (2 + 4) + " apples!");
	    //1. I have 2 + 5 = 6
	    //2. I have 6
	    //3. I have 6 apples!
	    
	}

}
