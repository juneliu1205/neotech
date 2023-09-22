package com.neotech.review06;

public class FamilyMember {

	String firstName; // instance variable
	static String lastName; //static/class variable, belongs to the class (family)
	int age; //instance variable
	
	//with non-static methods we can access ALL variables
	void printFullName()
	{
		System.out.println("Full name is " + firstName + " " + lastName);
	}
	
	//with static methods, we can only access static variables
	static void printFamilyName()
	{
		System.out.println("Family name is: " + lastName);
	}
	
	
}
