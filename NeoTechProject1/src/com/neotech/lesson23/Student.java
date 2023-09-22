package com.neotech.lesson23;

public class Student {
//	Homework 2:
//▪ Create a Class Student that will have 3 subclasses as NeotechStudent, CollegeStudent, SchoolStudent.
//▪ Define common behavior within the parent class and override some of the methods in the child classes
//▪ Define some methods specific to the child classes
//▪ Write an example of achieving run time polymorphism
	public void dohomework(){
		System.out.println("All student do their homework.");
		}
}
class NeotechStudent extends Student{
	public void dohomework(){
		System.out.println("NeotechStudent do Replit homework.");
	}
	public void record(){
		System.out.println("NeotechStudent record video for Flip.");
	}
}
class CollegeStudent extends Student{
	public void dohomework(){
		System.out.println("CollegeStudent don't do homework.");
	}
	public void play(){
		System.out.println("CollegeStudent play Football.");
	}
}
	class SchoolStudent extends Student{
		public void eat(){
			System.out.println("School Student eat a healthy.");
		}
		public void play(){
			System.out.println("School Student play Football.");
		}

	}
