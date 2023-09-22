package com.neotech.lesson14;

public class Car {


	//what features does a car have??
		//make model color year mileage maxSpeed
	
	
	
	//what behaviors does a car have??
		//drive(), stop(), transportPeople()
	

	String make;
	String model;
	String color;
	int year;
	int mileage;
	int maxSpeed;
	
	//how do we code behaviors??? (methods)
	
	//what is a method:
		// think of it as a factory
		// ----INPUT--->  { METHOD   }   ------> OUTPUT 
	
	
	//return type 		method name ()
//	{
//		...code goes here	
//	}
	
	//void --> method will not return anything
	//int --> method will return an int
	
	
	void drive()
	{
		System.out.println(make + " " + model + " drives!");
	}
	
	
	void stop()
	{
		System.out.println(make + " stops!");
	}
	
	
	void transportPeople()
	{
		System.out.println(make + " can transport people!");
	}
	
	
	//What is a class???
		/// a class is a blueprint/template/structure
		//	it has -features and -behaviors
	//What is an object???
		// an object is an instance/example of a class
		// when we initialize a class
	
	
	public static void main(String[] args) 
	{
		
		int a = 5; //this lives within the curly brackets of the method
		int b;
		
		//how do we create an object with our blueprint/template???
		//ClassName	 identifier	 operator 	 NEW keyword	ClassName
		Car car1 = new Car();

		//what does this line do?
		//1. declaring an object of class Car
		//2. instantiation (new)
		//3. Car() -- Initialization
		
		//if you debug, you will see that the object is created with default values
		
		//how do we access elements (features or behaviors) of the car class??
		car1.make = "Toyota";
		car1.model = "Camry";
		car1.color = "Red";
		car1.year = 2019;
		car1.mileage = 25000;
		car1.maxSpeed = 140;
		
		
		System.out.println(car1.make + " " + car1.model + " " + car1.year);
		
		//how do I access the methods???
		car1.drive();
		car1.stop();
		car1.transportPeople();
		
		
		
		
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
