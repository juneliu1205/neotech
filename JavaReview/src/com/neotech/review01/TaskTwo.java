package com.neotech.review01;

import java.util.Scanner;

public class TaskTwo {

	public static void main(String[] args) {
		
		//ask the user to enter the age
		//1-3 is a baby
		//4-5 is a toddler
		//6-12 is a kid
		//13-19 is a teenager
		//0ver 20 is a adult
		
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your age:");
		int age = scan.nextInt();
		
		
		String result="";
		
		if (age >=1 && age <= 3) { //using AND is better for range
		System.out.println("You are a baby!");
        //result = "baby";
		} else if (age >= 4 && age <= 5) {
		System.out.println("You are a Toddler!");
		//result = "Toddler";
		} else if (age >=6 && age <= 12) {
		System.out.println("You are a Kid!");
		//result = "Teenager";
		} else if (age >=13 && age <= 19) {
		System.out.println("You are a Teenager!");
		//result = "Adult";
		} else if (age >=20 && age <=65) {
		System.out.println("You are a Adult!");
		
		} else {
			System.out.println("You are a senior!");
		//System.out.println ("You are a/an " + result);

		}
		
		
		
		
		
		
		
		
		
		
	}

}
