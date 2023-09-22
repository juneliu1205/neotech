package com.neotech.lesson10;

public class Patterns {

	public static void main(String[] args) {
		// *
		// **
		// ***
		// ****
		// *****

		for (int row = 0; row < 5; row++) {
			// 1st loop:inner loop need iterate once

			for (int col = 0; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();

		}

		for (int row = 4; row >= 1; row--) {
			// 1st loop:inner loop need iterate once

			for (int col = 0; col < row; col++) {
				System.out.print("*");
			}
			System.out.println();

		}

//		1
//		22
//		333
//		4444
//		55555
//		666666
//		55555
//		4444
//		333
//		22
//		1
		for (int row = 0; row < 5; row++) {
			// 1st loop:inner loop need iterate once

			for (int col = 0; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();

		}

		for (int row = 4; row >= 1; row--) {
			// 1st loop:inner loop need iterate once

			for (int col = 0; col < row; col++) {
				System.out.print("*");
			}
			System.out.println();

		}
		
		
		

		for (int row = 1; row <= 6; row++) 
		{
			for (int col = 1; col <= row; col++) 
			{
				System.out.print(row);
			}
			System.out.println();
		}
		
		for (int row = 5; row >= 1; row--) 
		{
			for (int col = 0; col < row; col++) 
			{
				System.out.print(row);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}

}
