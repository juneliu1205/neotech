package com.neotech.lesson20;

public class Car {

	String make, model;
	int year;
	
	//non-argument constructor
	
	Car(){
	System.out.println("I am the default constructor");
}
	Car(String carMake, String carModel, int carYear){
		System.out.println("We are crating an object with parameters");
		make=carMake;
		model=carModel;
		year=carYear;
	}
	void printDetails() {
		System.out.println("I have a " + year + " " +make+ " " + model + " and it runs great!!!!");
	}
	
	 
}
