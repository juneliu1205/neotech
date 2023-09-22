package com.neotech.lesson08;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
	// Find the largest among 3 different number
	// Let the user input the number
	 
	
	double a, b, c;
	
	Scanner input= new Scanner (System.in);	
			
	System.out.println("Enter three number: ");
	
	a=input.nextDouble();
	b=input.nextDouble();
	c=input.nextDouble();
	
	//nested if solution:
	
	if (a>b) {
		if (a>c) {
			System.out.println(a + " is the largest number!");
		}else { //a<c
			System.out.println(c + " is the largest number!");
		}
	}
	else { //a<b
		if (b>c) {
			System.out.println(b + " is the largest number!");
		}else { //b<c
			System.out.println(c + " is the largest number!");
		}
	    
	}
	//comparison operator solution:
	if (a>b && a>c) { //a is the largest
		System.out.println(a + " is the largest number!");
	}
	else if (b>a && b>c) { //a is the largest
		System.out.println(c + " is the largest number!");
	}
	else { //c is largest
		System.out.println(c + " is the largest number!");
	}
	
	
	}

}
