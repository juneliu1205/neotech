package com.neotech.review03;

public class MoreNumberPatterns {

	public static void main(String[] args) {

		// 1
		// 22
		// 333
		// 4444

		for (int row = 1; row <= 4; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(row);
			}
			System.out.println();
		}

		System.out.println("---------------------");

		// 1111
		// 222
		// 33
		// 4

		for (int row = 1; row <= 4; row++) {
			//when row is 1, col will go from 4 down to 1 (4 iterations)
			//when row is 2, col will go from 4 down to 2 (3 iterations)
			
			
			
			for (int col = 4; col >= row; col--) {
				System.out.print(row);
			}
			System.out.println();
		}

		System.out.println("---------------------");
        //different way
		// 1111
		// 222
		// 33
		// 4

		for (int row = 1; row <= 4; row++) {
			//when row is 1, col will go from 1 to 5-1 (4 iterations)
			//when row is 2, col will go from 1 to 5-2 (3 iterations)
			for (int col = 1; col <= 5-row; col++) {
				System.out.print(row);
			}
			System.out.println();
		}

	}

}
