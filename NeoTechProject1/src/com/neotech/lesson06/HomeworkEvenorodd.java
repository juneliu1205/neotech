package com.neotech.lesson06;

public class HomeworkEvenorodd {

	public static void main(String[] args) {
		// *Interview Question:
		// Write a Java Program to check whether number is Even or Odd.

		int number = 34535;
		
		//3%2 -> remainder is 1
		
		int remainder = number % 2;
	
	    //1 st way
		if (remainder == 0)
		{
			System.out.println("The number is even!");
		}
		else
		{
			System.out.println("The number is odd!");
		}
	
	    //2nd way
		if (remainder == 1)
		{
			System.out.println("The number is odd!");
		}
		else
		{
			System.out.println("The number is even!");
		}
	    //3rd way
		if (number %2 == 1)
		{System.out.println("The number is odd!");
		}
		else
		{
			System.out.println("The number is even!");
		}
	
	
	}

}
