package com.neotech.lesson02;

public class VariableDeclaration {

	public static void main(String[] args) {
	
		//Data Type         identifier   operator value;
		
	
		//1st way
		int number1 = 15;   
		
		
		//2nd way
		//date type + identifier--> variable declaration
		int number2;
		
		//identifier + operator + value--> assigning a value
		number2=10;
		
		//3rd way
		/*
		 * same as:
		 * char var1;
		 * char var2;
		 *char var3;
		 */
		
		
		char var1, var2, var3; // declaring multiple cariables of the same type
		 
		 var1='@';
		 var1='#';
		 var1='T';
		 
		
		System.out.println(number1);
		System.out.println(number1);
		//value reassignment
		//value are NOT creating a new variable
		
		
		number1=55;
		System.out.println(number1);
		
		//we can not do this since we told Java that the number1 is of type int.
		//number1="sabah";


	}

}
