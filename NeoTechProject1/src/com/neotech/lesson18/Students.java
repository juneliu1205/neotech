package com.neotech.lesson18;

public class Students {

//	Create a Class called Students 
//	▪ Create three variables studentName, studentID and numberOfStudents (should be a static variable)
//	▪ Create three objects of the Students Class
//	▪ Set the value for studentName, studentID and increment
//	the numberOfStudents for each object
//	▪ Print out total the number of students
	
	//static variables
	String studentName;
	int studentID;
	static int numberOfStudents;

	void displayStudentInfo() {
		System.out.println("Student Name: " + studentName + " Student ID: " + studentID + " Number Of Students:" + numberOfStudents);
	
	}
	public static void main(String[] args) {
	Students stu1 = new Students();
	stu1.studentName = "Sharley";
	stu1.studentID = 99578;
	stu1.numberOfStudents++;

	Students stu2 = new Students();
	stu2.studentName = "Steven";
	stu2.studentID = 99978;
	
	Students stu3 = new Students();
	stu3.studentName = "Sue";
	stu3.studentID = 91578;
	
	stu1.displayStudentInfo();
	Students.numberOfStudents++;
	stu2.displayStudentInfo();
	Students.numberOfStudents++;
	stu3.displayStudentInfo();
	
	System.out.println("total the number of students: " + numberOfStudents);
	
	}
}
	
			
