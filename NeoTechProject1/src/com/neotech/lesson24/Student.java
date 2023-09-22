package com.neotech.lesson24;
//▪ Create a Class Student that will have 3 subclasses as 
//NeotechStudent, CollegeStudent, SchoolStudent.
//▪ Define common behavior within the parent class 
//and override some of the methods in the child classes
//▪ Define some methods specific to the child classes
//▪ Write an example of achieving run time polymorphism
public class Student {
	protected void study() {
		System.out.println("Student is studying");
	}

	public void doHomework() {
		System.out.println("Student is doing homework");
	}
}

class NeotechStudent extends Student {
	@Override
	public void study() {
		System.out.println("Neotech student is studying");
	}

	public void getJob() {
		System.out.println("Neotech student becomes a QA");
	}
}

class CollegeStudent extends Student {
	@Override
	public void study() {
		System.out.println("College student is studying");
	}
}

class SchoolStudent extends Student {
	@Override
	public void study() {
		System.out.println("School student is on a field trip");
	}
}