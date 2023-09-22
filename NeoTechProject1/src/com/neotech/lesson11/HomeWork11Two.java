package com.neotech.lesson11;

public class HomeWork11Two {

	public static void main(String[] args) {
		
//		Homework 2:
//		Create an array on integers and calculate the sum of all elements in an array.
	 int [] num = {78, 80, 72, 95, 54, 99, 100};
	 int size = num.length;
	 for (int i=0; i<size; i++) {
			System.out.println(num[i] + " ");
		}

		int sum=0; 
		for (int i=0; i<size; i++) {
			sum+=num[i];
		}
		System.out.println();
		System.out.println("The sum is: " +sum);

	}

}
