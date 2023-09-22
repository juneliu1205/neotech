package com.neotech.lesson05;

public class Homework2 {

		// Write a program to implement following logic using
		// if-else if-else statement:
		// if hour is less than 12 noon, greet with Good Morning
		// if hour is greater than or equal 12 noon but less than 3 pm, greet with Good
		// Afternoon
		// if hour is greater than or equal to 3 pm, greet with Good Evening
	
		public static void main(String[] args) {
			
		int hours =17;
			
		if (hours < 12) {	
			System.out.println("Good Morning!");
		}	
		if (hours >= 12 && hours <=15) {	
			System.out.println("Good Afternoon");
		}		
		if (hours>=16) {	
			System.out.println("Good Evening");
		}			
		
		}
		}
 