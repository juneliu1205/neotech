package com.neotech.review04;

public class TwoD_ArrayIntro3 {

	public static void main(String[] args) {
		

	int [][] nums= {
			        {3, 9}, 
			        {4, 6, 8, 2}, 
			        {7}
	               };	
		
		System.out.println(nums [1][3]);
		System.out.println(nums [2][0]);
		//System.out.println(nums [0][2]); //run-time error
		
		System.out.println("--------------------------------------");
		System.out.println("The number of rows is ---> " + nums.length);
		System.out.println("The length of rows with index1 ---> " + nums[1].length);
		System.out.println("The length of rows with index0 ---> " + nums[0].length);
		System.out.println("The length of rows with index2 ---> " + nums[2].length);
		
		System.out.println("--------------------------------------");
		
		//for loop
		
		for (int row=0; row<nums.length; row++) {
			
			//nums[row].length will give you the length of that specific row
			
			for (int col=0; col<nums[row].length; col++) {
				System.out.print(nums[row][col]+ " ");
			}
		System.out.println();
		
		}
		System.out.println("--------------------------------------");
		
		
		// Nested enhanced for loop
				for (int[] row : nums) {
					for (int element : row) {
						System.out.print(element + " ");
					}
					System.out.println();

				}
	}

}
