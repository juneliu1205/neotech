package com.neotech.lesson02;

public class PrintLine {

	public static void main(String[] args) {
		
		
		//sout and CTRL_SPACE
		
		System.out.println("Whats up Erol??");
		System.out.println("How are you doing?");
		
		
		//println-prints and then moves to the new line
		//print-print and DOES NOT move to the new line
		
		System.out.print("1");
		System.out.print("2");
		System.out.print("3");//after printing 3, it is still on the same line
		
		System.out.println("4");//after printing 4 on the location that the
		                       //previous sysout ended it moves the cursor to the new line
		System.out.println("5");
		System.out.println("6");
		
		// \n --> it will move to the new line
		System.out.println("Do you like Java? \n Yes, I do!");
		
		//this will print an empty line
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("Something?");
	}

}
