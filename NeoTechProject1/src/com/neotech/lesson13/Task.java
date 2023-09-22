package com.neotech.lesson13;

public class Task {

	public static void main(String[] args) {

//		Create a 2D array of integer type and store numbers in 3 rows 
//		and 3 columns. Print the sum of all numbers.

		
		int[][] numbers = {
				{2,3,4,5},
				{6,7,8,9},
				{10,11,12,13}
		};
		
		
		int sum = 0; 
		
		for (int i = 0; i < numbers.length; i++)
		{
			for (int j = 0; j < numbers[i].length; j++)
			{
				sum += numbers[i][j];
			}
		}
		
		System.out.println("The total sum is: " + sum);
		

		//using for each
		
		
		int sum2 = 0; 
		
		for(int[] el : numbers)
		{
			for(int value : el)
			{
				sum2 += value;
			}
		}
		
		System.out.println("The total sum is: " + sum2);
		

	}

}