package com.neotech.lesson29;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Student {
	
//Homework 3:
//Create a Set collection that will hold Objects of Student Type. 
//In this set we do not care about the insertion order. 
//Each student object should have name and studentID. 
//Display name of each student.
	
	String Studentname, studentID;
	
	public Student (String Studentname, String studentID)
	{
		this.Studentname = Studentname;
		this.studentID=studentID;
	}
	
	
	public void displayInfo() {
		System.out.println("Student Name: "+ Studentname );
	}
}