package com.neotech.lesson05;

public class Task2 {

	public static void main(String[] args) {
		//* Create a Java program to check if it is Friday or not. If it is Friday, print
		// * “It’s Friday. I am going to watch a movie.” and check the date, if date is 13
		//* print “I will watch a scary movie.”. If date is not 13 print “I will watch a
		//* comedy.”. If it is not Friday, print “It is NOT Friday. I am going to study
		//* JAVA.”

	//boolean isFriday = true;
	//boolean is13 = false;
	
	//if (isFriday) {
	//	System.out.println("It’s Friday. I am going to watch a movie.");
	//if (is13) {
	//	System.out.println("I will watch a scary movie.");
	//} else {	
	//	System.out.println("I will watch a comedy.");
	//}
	//} else {	
	//	System.out.println("It is NOT Friday. I am going to study JAVA");
	//}
		
	boolean isFriday = true;
	int date = 15;
	//a nested if (if.......if-else......else)
	if (isFriday) {
		System.out.println("It’s Friday. I am going to watch a movie.");
	if (date == 13) {
		System.out.println("I will watch a scary movie.");
	} else {	
		System.out.println("I will watch a comedy.");
	}
	} else {	//it is not friday
		System.out.println("It is NOT Friday. I am going to study JAVA");
	}	
	//what if the date is 15th: I will be watching a thriller
	
	if (isFriday) {
		System.out.println("It’s Friday. I am going to watch a movie.");
	if (date == 13) {
		System.out.println("I will watch a scary movie.");
	} else if (date == 15) {	
		System.out.println("I will be watching a thriller movie.");
	} else {	
		System.out.println("I will watch a comedy.");
	}
	} else {	//it is not friday
		System.out.println("It is NOT Friday. I am going to study JAVA");
	}	
		
	}

}
