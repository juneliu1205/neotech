package com.neotech.lesson14;

public class Student {

	
	//features:
	//name, lastName, studentId, age, school, grade
	String name, lastName, school;
	int studentId, age;
	char grade;
	
	//behaviors:
	// study(), doHomework()
	
	void study()
	{
		System.out.println(name + " "  + lastName + " is studying!");
	}
	
	void doHomework()
	{
		System.out.println(name +" is doing homework!");
	}
	
	//Merve: how can I use grade as output here (in the behavior)
	void grade()
	{
		System.out.println(name + " has an " + grade);
	}
	
	
}