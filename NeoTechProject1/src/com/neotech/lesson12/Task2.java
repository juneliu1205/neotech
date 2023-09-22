package com.neotech.lesson12;

public class Task2 {

	public static void main(String[] args) {

//	Create an array of integers and calculate the sum of all elements in an array.
		

		int[] numbers = {5, 15, 4, 13, 25};
		
		
		//first way 
		int sum = 0;
		for (int i = 0; i < numbers.length;i++)
		{
			sum += numbers[i];
		}
		
		System.out.println("The sum is: " + sum);
		
		
		//second way
		int sum2 = 0;
		for (int num : numbers)
		{
			sum2 += num;
		}
		
		System.out.println("The sum is: " + sum2);
		}
}