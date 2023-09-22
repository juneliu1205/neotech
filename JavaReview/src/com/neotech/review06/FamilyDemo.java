package com.neotech.review06;

public class FamilyDemo {

	public static void main(String[] args) {

		//I CAN access static/class variables before we create an object
		FamilyMember.lastName = "James";
		
		//I CANNOT access instance variables without an object
//		FamilyMember.firstName = "LeBron";
	
		//I CAN access static/class methods before we create an object
		FamilyMember.printFamilyName(); 
		
		//I CANNOT access non-static method before we create an object
		//FamilyMember.printFullName();
		
		System.out.println("----------------------------------------");
		
		FamilyMember member1 = new FamilyMember();
		member1.firstName = "LeBron";
		member1.age = 35;
		
		FamilyMember member2 = new FamilyMember();
		member2.firstName = "Savannah";
		member2.age = 30;
		
		member1.printFullName();
		member2.printFullName();
		
		//can the static variables change????
		System.out.println("--------------------");
		System.out.println("They went to the court and change their last name!");
		
		FamilyMember.lastName = "King";
		
		member1.printFullName();
		member2.printFullName();
		
		
		//they had a baby
		FamilyMember baby = new FamilyMember();
		
		//does this baby have a first name?
		System.out.println("First name ---> " + baby.firstName);
		
		//does this baby have a last name??
		System.out.println("Last name ---> " + FamilyMember.lastName);		
		
		
	}

}