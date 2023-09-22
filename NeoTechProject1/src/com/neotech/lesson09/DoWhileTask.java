package com.neotech.lesson09;

import java.util.Scanner;

public class DoWhileTask {

	public static void main(String[] args) {

	

		// Ask a user: Guess the number
		// Lucky number is 5
		// As long as the entered number is not 5 we need keep ask for trying
		// Once number is correct --> "You're winner"
		
		Scanner input = new Scanner(System.in);
		int luckyNumber = 5;
		int number;

		//using while loop
		//System.out.println("Guess my number!"); 
		//number = input.nextInt();
		// 
		//while(number != luckyNumber) 
		//{ System.out.println("Guess my number!"); 
		//number = input.nextInt(); } 
		// 
		//System.out.println("You are the winner!");
		//
		//

		// using do while loop
		// so while is better for this type of tasks

		do {
			System.out.println("Guess my number!");
			number = input.nextInt();
		} while (number != luckyNumber);
		System.out.println("You are the winner!");

	}

}
