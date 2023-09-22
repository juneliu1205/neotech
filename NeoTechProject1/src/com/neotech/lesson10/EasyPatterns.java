package com.neotech.lesson10;

public class EasyPatterns {

	public static void main(String[] args) {

		System.out.println();

		for (int down = 10; down > 0; down--) {
			for (int next = 0; next < down; next++) {
				System.out.print("*");
			}
			System.out.println();
		}
        // ******
		// *****
		// ****
		// ***
		// **
		// *

		
		
		
		
		
		
//				col0 col1 col2 col3 col4 col5
//		row 5    *    *    *    *   *
//		row 4    *    *    *    *
//		row 3    *   *    *
//		row 2    *   *
//		row 1
//		
		
		System.out.println("------------------------------------");

		// 1
		// 22
		// 333
		// 4444
		// 55555

		for (int row = 1; row <= 5; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(row);
			}
			System.out.println();
		}
		

		
		
		
		
		}

	}

