package com.neotech.lesson05;

public class Task1 {

	// * Write a program.
	// * Create a variable day ( 1 - 7)
	// * For every weekday, print
	// * "Today is Monday and we are working."
	// * For weekend, print
	// * "We are on a break on Weekend."

	public static void main(String[] args) {
		int day = 1;

		// 1. if day ==1-->Today is Monday we are working.
		// 2. else if day ==2 -->Today is Tuesday we are working.
		// 3. else if day ==2 -->Today is Wednesday we are working.
		// .............
	
		if (day == 1) {
			System.out.println("Today is Monday we are working.");
		} else if (day == 2) {
			System.out.println("Today is Tuesday we are working.");
		} else if (day == 3) {
			System.out.println("Today is Wednesday we are working.");
		} else if (day == 4) {
			System.out.println("Today is Thursday we are working.");
		} else if (day == 5) {
			System.out.println("Today is Friday we are working.");
		} else {
			System.out.println("We are on a break on Weekend.");
		}

	// lets modify the task
	// print if its a weekday or weekend
	// [1-5]-->weekday
	// [6,7]-->weekend
	//else-->wrong input
	
	if (day >=1 && day <=5 ) {
		System.out.println("Today is weekday we are working!");
	}
	
	else if (day==6 || day==7){
		System.out.println("Today is weekend we are NOT working!");
	}
	else 	{
		System.out.println("Wrong input!");
	}
	
}

}
