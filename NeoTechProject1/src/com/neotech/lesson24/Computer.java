package com.neotech.lesson24;
//▪ Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
//▪ Define some common behavior (methods) and some fields in the parent class, and override some of the methods in the child classes.
//▪ Define some methods specific to the child classes.
//▪ Create objects of the child classes and store them in an array.
//▪ Loop through each object and execute available methods.
public class Computer {
	
	String name;
	int memorySize; 
	
	Computer(String name, int memorySize) {
		this.name=name;
		this.memorySize=memorySize;
	}
	public void displayInfo() {
		System.out.println("This " + name + " havs "+ memorySize+ "G Unified Memory!");
	}
}
class Apple extends Computer {
	
	Apple(String name, int memorySize) {
		super(name, memorySize);
	}
	
	@Override
	public void displayInfo() {
		System.out.println("This " + name + " havs "+ memorySize+ "G Unified Memory!");
	}
	public void retinaDisplays() {
		System.out.println("This "+ name + "has Retina Displays!!!" );
	}
}	 
class Lenovo extends Computer {
	
	Lenovo (String name, int memorySize) {
		super(name, memorySize);
	}
	@Override
	public void displayInfo() {
		System.out.println("This " + name + " havs "+ memorySize+ "G Unified Memory!");
	}
}
class HP extends Computer {
	
	HP (String name, int memorySize) {
		super(name, memorySize);
	}
	
	@Override
	public void displayInfo() {
		System.out.println("This " + name + " havs "+ memorySize+ "G Unified Memory!");
	}
}
class Dell extends Computer {
	
	Dell (String name, int memorySize) {
		super(name, memorySize);
	}
	
	@Override
	public void displayInfo() {
		System.out.println("This " + name + " havs "+ memorySize+ "G Unified Memory!");
	}
}
	


