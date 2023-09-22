package com.neotech.lesson15;

public class CaculatorWithReturn {

	// add two numbers
	
	int add (int a, int b) {
		int sum = a+b;
		return sum; 
	}
	// multiply two numbers

	int multiply (int a, int b) {
		return a*b;
	}
	 
	// multiply two numbers

		double divid (double a, double b) {
			double result= a/b;
		    return result;
			//return a/b;
		}
	int giveBackSomething() {
		return 5;
	}
	void dontGivebackAnything() {
		System.out.println("Nothing is sent back");
	}
	//create a method that gets 3 doubles and returns their avg.
	double average (double a, double b, double c) {
		double sum =a+b+c;
		return sum/3;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
