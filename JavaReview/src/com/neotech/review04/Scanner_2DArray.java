package com.neotech.review04;

import java.util.Scanner;

public class Scanner_2DArray {

	public static void main(String[] args) {
		// Ask the user: how many rows do you want in the array?
		//Ask the user: how many columns do you want in the array?
		
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("How many rows do you want in the array?");
		int rows=input.nextInt();
		
		System.out.println("How many colums do you want in the array?");
		int cols=input.nextInt();
		
		//Create the array (String [] [] names)
		String [][] names=new String [rows][cols];
		
		//Fill the array
		
		for (int i=0; i <rows; i++) {
			for (int j=0;j<cols; j++) {
				System.out.println("Please Enter a Name:");
				names[i][j]=input.next();
			}
		}
		
		
		//Print the array
		//I will using enhanced/advanced loop
		
		for (String[] row:names) {
			for (String name : row) {
				System.out.print(name + " ");
			}
			System.out.println();

		}
		}
		

}
