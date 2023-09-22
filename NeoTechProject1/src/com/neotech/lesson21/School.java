package com.neotech.lesson21;

public class School {
	
public static void main(String[] args) {
		// Create a student using the 1st constructor
		Student st1 = new Student();
		st1.displayInfo();

		st1.name = "Emre";
		st1.address = "123 Main St.";
		st1.displayInfo();

		System.out.println("----------");
		// Create a student using the 2nd constructor
		Student st2 = new Student("Yasemin", "456 Brown St. FL");
		st2.displayInfo();

		System.out.println("----------");
		// Create a student using the 3rd constructor
		Student st3 = new Student("Gorkem");
		st3.displayInfo();
	}

}