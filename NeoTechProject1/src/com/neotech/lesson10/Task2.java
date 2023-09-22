package com.neotech.lesson10;

import java.util.Scanner;

public class Task2 {
	
	
	public static void main(String[] args) {
	
//ask user to input a number		
//	1
//	22
//	333
//	4444
//	55555
//	666666
//	55555
//	4444
//	333
//	22
//	1
	
	Scanner scan=new Scanner (System.in);
	System.out.println("Enter a number: ");
	int size = scan.nextInt();
	
		for (int row = 1; row <= size; row++) 
		{
			//first loop:
			//row 1, col 0---> it runs only once
			
			for (int col = 0; col < row; col++) 
			{
				System.out.print(row);
			}
			System.out.println();
		}
		
		for (int row = size-1; row >= 1; row--) 
		{
			//now on the first loop:
			//row = 5, col = 0
			
			for (int col = 0; col < row; col++) 
			{
				System.out.print(row);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
