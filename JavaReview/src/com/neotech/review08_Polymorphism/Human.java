package com.neotech.review08_Polymorphism;

//Every class by default extends the object class

public class Human {
//fields/variables
	String name; //instant variable
	static String planet; // class variable 每一個人是
	
	public Human() {
		//super();
		System.out.println("A human is being created!");
	}
	public Human (String name) {
		this();
		this.name=name;
	}
	
	
	//behavior/method
	public void talk() {
		System.out.println("Bla bla bla");
	}
	
	
}
