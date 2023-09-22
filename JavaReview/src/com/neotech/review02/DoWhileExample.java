package com.neotech.review02;

public class DoWhileExample {

	public static void main(String[] args) {
	
	int age = 1;
	while (age<=10) {
		
		System.out.println("Happy Birthday! Yor are " + age + " years old!");
		age++;
	}
	System.out.println("-----------------------------------");
	
	
	int age2 =1;
	do {
		System.out.println("Happy Birthday! Yor are " + age2 + " years old!");
		age2++;
	}while (age2<=10);
	

	System.out.println("-----------------------------------");
	System.out.println("Different between WHILE & DO-WHILE");	
		
	
	boolean hot= true;
	while (!hot) {
		System.out.println("While loop -> Drink");
	}
	
	
	do {
		System.out.println("Do-While loop -> Drink");
	} while (!hot);
	
	
	
	

	}

}
