package com.neotech.review07;


//OOP-> Object Oriented Programming
//1. Inheritance 
//2. Polymorphism
//3. Abstraction
//4. Encapsulation

//Every class in java is extending the object
//Object class is like Adam in humanity

public class Doctor {

	String name;
	int salary;
	String licenceID;
	
	//Its is good to leave a default constructor
	Doctor(){
	}
	
	Doctor(String name, int salary, String licenceID){
		this.name=name;
		this.salary=salary;
		this.licenceID=licenceID;
		
	}
	
	public void checkUp(String patientName) {
		System.out.println("Doctor "+ name + " make a checkup on "+ patientName );
	}
	
	
	
}
