package com.neotech.review03;

public class TwoD_ArrayIntro {

	public static void main(String[] args) {

		int[][] numbers = new int[3][4]; // [rows][columns]
				numbers[1][2] = 6;
				numbers[0][2] = 1;
				numbers[0][0] = 4;
				numbers[2][1] = 9;
				// re-assign a value to one element
				numbers[2][1] += -3;
				// numbers[3][0] = 5; // run-time error
		
				int rows = numbers.length;
				System.out.println("The number of rows is -> " + rows);
		
				// The length of columns in row with index 1
				int cols1 = numbers[1].length;
				System.out.println("The length of row with index 1 is -> " + cols1);
		
				System.out.println("--------------------------------");
		
				int[][] number2 = { 
						{ 3, 6, 0, 2 }, 
						{ 7, 3, 9, 1 }, 
						{ 6, 4, 8, 2 } 
				};
		
			}
		
		}