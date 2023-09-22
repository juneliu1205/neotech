package com.neotech.review07;

public class Person {
    
	//instance variables
	String name;
	int age;
	protected int weight;
	//private String hairColor;

	public Person() {
		System.out.println("Creating a person with NO information");
	}
	
	public Person (String pName, int pAge) {
		name =pName;
		age=pAge;
	}
	
	public Person (String pName, int pAge, int pWeight) {
		
		this(pName,pAge);
		//name =pName;
		//age=pAge;
		weight=pWeight;
	}
	
	public void displayInfo() {
		System.out.println(" Name: " + name + " Age: " + 
	age + " Weight: "+ weight);
	}
	
	
}
