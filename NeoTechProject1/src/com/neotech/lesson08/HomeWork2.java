package com.neotech.lesson08;

import java.util.Scanner;

public class HomeWork2 {


	public static void main(String[] args) {
		
	//Write a program that asks user to enter his/her username and password until user enters them correctly.
	//how do we deccide which loop?
		//for vs while vs do while
		
		String username, password;
		Scanner input = new Scanner(System.in);
		
	    System.out.println("Please enter your username: ");
	    username=input.next();
	    
	    System.out.println("Please enter your password: ");
	    password=input.next();
	
	    while (!username.equals("Abcjave4532") || !password.equals("Jave4532")) {
	    	
	    	 System.out.println("Wrong username or password, try again!");
	    	 System.out.println("Please enter your username: ");
	    	 username=input.next();
	    	 System.out.println("Please enter your password: ");
	 	     password=input.next();
	    	 
	    } if (username.equals("Abcjave4532") &&  password.equals("Jave4532")) {
	    		 System.out.println("You are logged in successfully");	 
	    	 
	    } else {
	    		System.out.println("Invalid Login!");	 
	    }

	}
	
		
	}


