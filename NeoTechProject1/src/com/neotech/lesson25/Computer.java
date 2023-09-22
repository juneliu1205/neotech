package com.neotech.lesson25;

public class Computer {

	/*
	 * ▪ Create a Class Computer that will have 4 subclasses as Apple, 
	 * Lenovo, HP, Dell. 
	 * Define some common behavior (methods) and some fields in the parent
	 * class, and override some of the methods in the child classes. 
	 * Define some methods specific to the child classes. 
	 * Create objects of the child classes and store them in an array. 
	 * Loop through each object and execute available methods.
	 */
	
	
	String brand; 
	
	//I am not using a default constructor. Sooo, I am actually forcing users
	//to enter the brand when they create an object!!
	Computer(String brand)
	{
		this.brand = brand;
	}
	
	public void run()
	{
		System.out.println(brand +" computer can run the system");
	}
	
}


class Apple extends Computer
{
	
	Apple(String brand) {
		super(brand);
	}
	
	//overriding the run() method
	public void run()
	{
		System.out.println(brand + " computer runs faster!");
	}
	
	public void safe()
	{
		System.out.println(brand + " is very safe!");
	}
	
}


class Lenovo extends Computer
{

	Lenovo(String brand) {
		super(brand);
	}
	
	@Override
	public void run()
	{
		System.out.println(brand + " computers run even faster!");
	}
	
	
	
	public void save()
	{
		System.out.println(brand + " has a lot of memory!");
	}
}

class HP extends Computer
{

	String color;
	
	HP(String brand, String color) {
		super(brand);
		this.color = color;
	}
	
	public void run()
	{
		System.out.println(brand + " computer runs slow!");
	}
	
	public void save()
	{
		System.out.println(brand + " computer does not have a big storage!");
	}
	
}

class Dell extends Computer
{

	Dell(String brand) {
		super(brand);
	}
	
	//lets not override the run() method
}