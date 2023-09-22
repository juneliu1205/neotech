package com.neotech.review02;

public class SumEvenForLoop {

	public static void main(String[] args) {
		// Add Even numbers
		// Also add Odd numbers
		// Also add All numbers
		// Between 1 && 20
		// Using for loop
		
		int sumEven=0;
		int sumOdd=0;
		int total=0;
		
		for (int i=1; i<=20; i++)
		{
			if (i%2==0) { //even number
				sumEven+=i;   
		}else { //odd number
			    sumOdd+=i;   
		}
		total +=i;
		}
		System.out.println("The sum of even number ->: "+ sumEven); 
		System.out.println("The sum of even number ->: "+ sumOdd); 
		System.out.println("The sum of even number ->: "+ total); 
		
		
		
		
		
		
		
		
		
	}

}
