package com.neotech.lesson21;
//Homework 2:
//    Write a Java program called Car. Specify features and behaviours of the Car class.
//    Create SportsCar and FamilyCar subclasses of the Car class with their own features and behaviours.
//    Next, create a LuxurySportsCar that will inherit the SportsCar and also will have its own features and behaviours.
//    Create objects from each class and test them.
public class Car {
	
	String make, model, color;
	int year;
	
	public void run() {
		System.out.println(year + " " + make + " " + model+ " is running great!");
	}
	
	public void printDetails() {
		System.out.println("I have a " + color + " " + year + " " + make + " " + model +".");
	}
	
	 
}
	