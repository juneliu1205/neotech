package com.neotech.lesson09;

import java.util.Scanner;

public class HomeWork9 {

	public static void main(String[] args) {
//1. Print 5 times this statement: "I love Neotech"
//2. Write a program that asks user to enter his/her username and password until user enters them correctly.
//3. Print numbers from 1 to 50 except those that are divisible by 3.
//4. Create a program that will be asking user to apply for a credit card 10
//times.
//As soon you get an "yes" from a user program should stop asking.
		
		int count = 1;

		while (count <= 5) {
			System.out.println("I love Neotech");
			count++; // increment
		}
		System.out.println("==================================");
		
	
		// 3. Print numbers from 1 to 50 except those that are divisible by 3.

		for (int i = 1; i <= 50; i++) {
			if (!(i % 3 == 0)) {
				System.out.println(i);
			}
		}

		// 4. Create a program that will be asking user to apply for a credit card 10
		// times.
		// As soon you get an "yes" from a user program should stop asking.

		String answer;
		Scanner input = new Scanner(System.in);
		
		 System.out.println("Do you want to apply for a credit card?");
		 answer=input.next();
		 
		 for (int i=1; 1<=10; i++)
		    {	 
		    if (answer.equals("Yes") || answer.equals("yes")) 
		    { 
		    	System.out.println("You are Approved!");	 
	    			break;
	    	}
		    else if (i==10)
		    {
		    	System.out.println("Okay, Nevermind");
		    		break;
		    }
		    System.out.println("Do you want to apply for a credit card?");
			answer=input.next();
		    
	    	}
	    
		
		
		
		
		
		
		

			//for (int i=1; i<=10;)
		{//

		//do {	
			//System.out.println("Do you want to apply for a credit card?");
		//	answer = input.next();
			//i++;
	//	}while (!answer.equals("yes") && i<=9);
			//if (i==11)
			//{ System.out.println("Okay, Nevermind");
			//}
		}
	}
	

}
