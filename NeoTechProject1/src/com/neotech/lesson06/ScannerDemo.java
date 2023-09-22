 package com.neotech.lesson06;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// data type identifier operator value;

		// hoe to import:
		// 1.import specifically the class
		// 2. Window: CTRL+SHIFT +O MAC:CMD +SHIFT +O

		//input is the identifier/name that we gave to this new thing we declared
		

		//System.out.println("Please enter your name:");
		//String name = input.next();
		//System.out.println("Your name is: "+ name);
		
		//
		//System.out.println("Please enter your age: ");
		//int age = input.nextInt();
		//System.out.println("Your age is: "+ age);
		
		//System.out.println("Please enter your salary: ");
		//double salary = input.nextDouble();
		//System.out.println("Your salary is: "+ salary);
		
		//System.out.println("Is is rainging?");
		//boolean raining = input.nextBoolean();
		
		//if (raining)
		//System.out.println("Bring an umbrella!!");
		//else 
		//{
		//System.out.println("Come as you wish!!");	
		//}
		
		
	    //Write a program that asks user to enter first name and 
		//then last name. At the end print user's full name.	
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your first name:");
		String firstname = input.next();
		
		System.out.println("Please enter your last name:");
		String lastname = input.next();
		System.out.println("Your name is: "+ firstname +" "+lastname);
		
	}

}
