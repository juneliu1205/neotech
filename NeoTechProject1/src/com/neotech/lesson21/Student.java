package com.neotech.lesson21;

public class Student {
	// Write program as a Student class
		// that has instance variables name and address.
		// Create a constructor that will initialize those variables.
		// Print name & address of given student using displayInfo method.

		// instance variables
		String name, address;

		// 1st default constructor
		Student() {
		}	
		// 2nd constructor
		Student(String name, String address) {
			this.name = name;
			this.address = address;
		}
		
		// 3rd constructor
		Student(String name) {
			this.name = name;
		}
		
		public void displayInfo() {
			System.out.println("Name:" + this.name + " Address:" + this.address);
		}
	}