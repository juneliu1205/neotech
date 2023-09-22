package com.neotech.lesson05;

public class HomeWork1 {
	
	//Write a java program to check if a patient has allergies.
    //If the patient does not have allergies print "You’re healthy!".
    //If the patient has allergies, check if it is a peanut allergy, lactose allergy, bee allergy or seafood allergy 
    //and print a statement telling the patient 
    //"Don’t eat ___". (fill the line with the food names – peanut, seafood etc.)
	
	public static void main(String[] args) {
		
	boolean allergies = true;	
	boolean peanut = true;
	boolean lactose = false;
	boolean bee = false;
	boolean seafood = true;
	
	
	if (allergies) {
	
	}
	if (peanut) {
		System.out.println("Don’t eat peanut");
	}
	if (lactose) {
		System.out.println("Don’t eat lactose");
	}
	if (bee) {
		System.out.println("Don’t eat bee");
	}
	if (seafood) {
		System.out.println("Don’t eat seafood");
	}
	else {
		System.out.println("You’re healthy!");
	}

	}

}
