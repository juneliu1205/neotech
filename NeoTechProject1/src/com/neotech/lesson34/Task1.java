package com.neotech.lesson34;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		//How would handle InputMismatchException? 
		//Input Mismatch Exception when user enters mismatch value then 
		//programmer expected.

		Scanner scan = new Scanner (System.in);
		
		String name= "";
		int age;
		
		try {
		
		System.out.println("Enter your name: ");
		name=scan.next();
		
		System.out.println("Enter your age: ");
		age=scan.nextInt();
		
		System.out.println("I am "+name+ " and I am "+age + "years old!");
		}
		catch (InputMismatchException ime)
		{
			System.out.println(ime.getMessage());
			ime.printStackTrace();
			System.out.println("Make sure your input type is correct!");
		}
		
		
	}

}
