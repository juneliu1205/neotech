package com.neotech.review01;

public class VariableDemo {

	public static void main(String[] args) {

		// Declare a variable

		String firstName;

		// System.out.println("My first name is" + firstName);

		// Assign a value (initialize)

		firstName = "June";
		System.out.println("My first name is " + firstName);

		// Declare a variable & Assign a value
		String lastName = "Liu";

		System.out.println("My last name is " + lastName);

		int age = 25;

		System.out.println(firstName + " " + lastName + " " + age + 1);
		System.out.println(firstName + " " + lastName + " " + (age + 1));

		System.out.println(age);
		
		
		//After 10 years
		//re-assign a new value to the container
		age = age +10;
		lastName = "May";
		
		System.out.println("After getting married");	
		System.out.println(firstName + " " + lastName + " " + age);		
				
				
				
				
	}

}
