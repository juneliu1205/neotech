package com.neotech.lesson10;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		//Ask the user to enter an integer and build the following pattern:
			//Hint: Use scanner, if user entered number 5, there should be 5 rows.
			//In the first row, 0 spaces, (2 * 5) - 1 stars
			//In the second row, 1 spaces, (2 * 4) - 1 stars
			//In the third row, 2 spaces, (2 * 3) - 1 stars
			//In the fourth row, 3 spaces, (2 * 2) - 1 stars
			//In the fifth row, 4 spaces, (2 * 1) - 1 stars

//			*********
//			 *******
//			  *****
//			   ***
//			    *
		
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter a number: ");
		int size = scan.nextInt();
		
		    
		for (int row=size; row >0 ; row-- )
		{ 
			for (int col=size; col>row; col--)
			{
				System.out.print(" ");
			}
			for (int stars=1; stars<=(2*row)-1; stars++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	
		
		
		
		
		
		
		
		
		
		
		
//		
//		
//		
//		
//
//		Scanner scan=new Scanner (System.in);
//		
//		System.out.println("Enter a number: ");
//		
//		int size = scan.nextInt();
//		int totalStars = (size*2)-1;
//		
//		
//		for (int row=2, spaces = 0; totalStars > 0; totalStars-=2) {
//			for (int col=0; col<totalStars; col++) {
//				for(int i=0; i<spaces; i++) {
//				System.out.print(" ");
//				}
//				System.out.print("*");	
//				spaces=0;
//		}
//			spaces=row-1;
//			System.out.println();
//			row++;
//		}
//		
		
		
		
	}
	
		
		
		}
