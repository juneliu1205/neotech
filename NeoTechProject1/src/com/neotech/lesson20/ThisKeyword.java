package com.neotech.lesson20;

public class ThisKeyword {
	
	int a, b;
		ThisKeyword() {
			
		}
		ThisKeyword(int a, int b) {
			// we want to assign values we get from the user to
			// our instance variables.
			// a--> is the local variable
			// this.a --> instance variable
			this.a = a;
			this.b = b;
		}
		void sum(int a, int b) {
			System.out.println("Sum of the local variables is " + (a + b));
			System.out.println("Sum of the instance variales is " + (this.a + this.b));
		}
	} 