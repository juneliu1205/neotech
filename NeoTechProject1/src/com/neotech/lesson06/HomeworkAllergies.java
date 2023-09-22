package com.neotech.lesson06;

public class HomeworkAllergies {
	
	//Write a java program to check if a patient has allergies.
    //If the patient does not have allergies print "You’re healthy!".
    //If the patient has allergies, check if it is a peanut allergy, lactose allergy, bee allergy or seafood allergy 
    //and print a statement telling the patient 
    //"Don’t eat ___". (fill the line with the food names – peanut, seafood etc.)
	
	public static void main(String[] args) {
		
	boolean  allergies = true;	
	boolean  peanut = false;
	boolean  lactose = false;
	boolean  bee = false;
	boolean  seafood = true;	
		
	if (allergies) {
		System.out.println("You have an allergy!");
		
		if (peanut) 
		 {
			System.out.println("Don’t eat peanuts!");
		 }
		if (lactose) 
		 {
			System.out.println("Don’t drink milk!");
		 }
		else 
		{
			System.out.println("You can drink milk!");
		}
		
		if (bee) 
		 {
			System.out.println("Don’t eat peanuts!");
		 }
		if (seafood) 
		 {
			System.out.println("Don’t eat seafood");
		 }
		
	}	
	else{
		System.out.println("You’re healthy!");
		
	}	
	}

}
