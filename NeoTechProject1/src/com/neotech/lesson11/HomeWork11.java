package com.neotech.lesson11;

public class HomeWork11 {

	public static void main(String[] args) {
	
//  Homework 1:	
//	Create an array of cars and store 6 elements into it. Print all values from the array.
	
 String[] cars = new String[6];
 
	 cars[0] = "Toyota";
	 cars[1] = "Honda";
	 cars[2] = "Ford";
	 cars[3] = "Subaru";
	 cars[4] = "Nisson";
	 cars[5] = "Jeep";
	 
 int size= cars.length;
 
 for (int i=0; i<size; i++) {
		System.out.println(cars [i] + " ");
	}

	}

		
	}

