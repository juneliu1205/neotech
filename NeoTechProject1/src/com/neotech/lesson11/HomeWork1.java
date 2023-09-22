package com.neotech.lesson11;

import java.util.Scanner;

public class HomeWork1 {

	// Ask the user to enter an integer and build the following pattern:
	// Hint: Use scanner, if user entered number 5, there should be 5 rows.
	// In the first row, 0 spaces, (2 * 5) - 1 stars
	// In the second row, 1 spaces, (2 * 4) - 1 stars
	// In the third row, 2 spaces, (2 * 3) - 1 stars
	// In the fourth row, 3 spaces, (2 * 2) - 1 stars
	// In the fifth row, 4 spaces, (2 * 1) - 1 stars

//		*********
//		 *******
//		  *****
//		   ***
//		    *

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int num = input.nextInt();
		
    for (int i =1; i<=num; i++) {
    	//when i=1, there are 0 spaces
    	//when i=2, there is 1 space
    	
    	for (int j=1; j<i ;j++) { //this is for the columns
    		System.out.print(" ");
    	}
    	//what about star?
    	//when i=1 we have 2*5-1
    	//when i=2 23 have 2*4-1
    	for (int k=1; k<=2 *(num-i)+1 ; k++){
    	System.out.print("*");
    }
    	System.out.println();
    }
    
    
	
    
	}

}
