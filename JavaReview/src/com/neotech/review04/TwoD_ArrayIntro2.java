package com.neotech.review04;

public class TwoD_ArrayIntro2 {

	public static void main(String[] args) {

		// 1D Array
		// int [] num= {4, 5, 6};

		// 2D Array
		int[][] nums = { { 2, 8, 4 }, { 6, 0, 7 }, { 9, 5, -3 }, { 8, 1, 4 } };
		
		System.out.println(nums[1][2]);
		System.out.println(nums[3][1]);
		System.out.println(nums[3][0]);
		System.out.println(nums[0][1]);

		System.out.println("--------------------------------------");

		// nested enhanced for loop
		for (int[] row : nums) {

			// I will iterate the row (1D-Array) with an enhanced for loop
			for (int element : row) {
				System.out.print(element + " ");
			}
			System.out.println();

		}
		System.out.println("--------------------------------------");
// How to get the row with index2
		
		int[] row2= nums[2];
		for (int element:row2){
			System.out.print(element + " ");
		}
		System.out.println();
		
		System.out.println("--------------------------------------");

		for (int[] row:nums) {
			//I will iterate the row (1D-Array) with a normal for loop
			for (int i=0; i<row.length;i++) {
				System.out.print(row[i]+ " ");
			}
			System.out.println();

		}
		
		
		
		
		
		
	}

}
