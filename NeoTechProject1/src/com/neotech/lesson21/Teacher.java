package com.neotech.lesson21;

public class Teacher {
//	Task 1:
//	Write a Java program called Teacher.
//	Specify features and behavior of the Teacher class.
//	Create 3 sub classes MathTeacher, ChemistryTeacher 
// and PianoTeacher that will also have their own features 
//and behavior. Test all 4 classes.
	
	String fullName, major;
	char gender;
	int age;
	int yearsOfExperience;
	
	// some behaviors (actions, methods, functions)
	public void teaches() {
		System.out.println(fullName + " is a teacher");
		System.out.println(fullName + "'s major is " + major+ " with a "+yearsOfExperience+ " experience" );
	}
	
	}
