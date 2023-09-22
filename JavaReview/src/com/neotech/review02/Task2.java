package com.neotech.review02;

import java.util.Scanner;

public class Task2 {

	//Ask the user to enter a positive number and add it to the total
	
	public static void main(String [] args) {
		Scanner scan = new Scanner (System.in);
		
		int num =0;
		int total=0;
		
		System.out.println("Please enter a positive number! To stop Enter -1");
		num=scan.nextInt();
		
		while (num !=-1) {
	     	total +=num;
		  System.out.println("Please enter a positive number! To stop Enter -1");
		  num=scan.nextInt();	
		}
		System.out.println("Total = " + total); 		
			
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
