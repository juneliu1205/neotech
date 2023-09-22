package com.neotech.interview;

import java.util.Arrays;

public class IQ7 {

	public static void main(String[] args) {
		// Write a java program to find the second largest number in the array?
		// Maximum and minimum number in the array?

		int[] numbers = { 1, 25, 5, 90, -1, 89, 74, 125, 25, 100 };

		// 1st way, using Arrays.sort()
		// This method will sort the array
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));

		// The smallest number is the first element in the array
		System.out.println("Smallest is -> " + numbers[0]);

		// The biggest number is the last element in the array
		System.out.println("Biggest is -> " + numbers[numbers.length - 1]);

		// The second biggest number is the one before the last element in the array
		System.out.println("Second biggest is -> " + numbers[numbers.length - 2]);

		System.out.println("----------------------------");

		// 2nd way, without sorting
		int[] nums = { 1, 25, 5, 90, -1, 89, 74, 125, 25, 100 };
		int biggest = nums[0];
		int biggest2 = nums[0];
		int smallest = nums[0];

		for (int el : nums) {

			if (el > biggest) {
				// We found a bigger number than the first place
				biggest2 = biggest;
				biggest = el;
			} else if (el > biggest2) {
				// We found a bigger number than the second place
				biggest2 = el;
			} else if (el < smallest) {
				// We found a smaller number
				smallest = el;
			}

		}
		
		System.out.println("Biggest is -> " + biggest);
		System.out.println("Biggest2 is -> " + biggest2);
		System.out.println("Smallest is -> " + smallest);

	}

}