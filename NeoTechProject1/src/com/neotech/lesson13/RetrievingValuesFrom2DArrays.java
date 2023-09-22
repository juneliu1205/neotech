package com.neotech.lesson13;

public class RetrievingValuesFrom2DArrays {

	public static void main(String[] args) {
		
		

		String[][]  months = {
				{"December", "January", "February"},
				{"March", "April", "May"},
				{"June", "July", "August"},
				{"September", "October", "November"}
		};
		
		int rows = months.length;
		
		//since all rows have the same number of columns, we can use any row
		//to get the number of columns
		int cols = months[2].length;
		
		System.out.println("The number of rows is " + rows 
				+ " and the number of columns is "  + cols);
		
		
		//first loop - rows
		for (int row = 0; row < rows; row++)
		{
			//second loop - columns
			//if the length of the rows is different, months[row].length will
			//get the length of the specific row we are at
			for(int col = 0; col < months[row].length;col++)
			{
				System.out.print(months[row][col] + " ");
			}
			System.out.println();
		}
		
		System.out.println("------------------");
		
		int[][] numbers = {
				{1,4,5,6},
				{2,3,4,5,6}, 
				{7}, 
				{8}
		};
		
		//rows: 0, 1, 2, 3
		for(int row = 0; row < numbers.length; row++)
		{
		//	System.out.println("Number of elements in row " + row 
		//			+ " is " + numbers[row].length);
			for(int col = 0; col < numbers[row].length; col++)
			{
				//when row is 0: this loop goes from 0 to 3
				//when row is 1: this loop goes from 0 to 4
				//when row is 2: this loop goes from 0 to 0
				System.out.print(numbers[row][col] + " ");
			}
			System.out.println();
		}
		
		
	}

}
