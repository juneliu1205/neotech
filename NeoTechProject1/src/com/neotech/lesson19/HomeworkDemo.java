package com.neotech.lesson19;

public class HomeworkDemo {

	public static void main(String[] args) {

		Homework st1 = new Homework();
		st1.studentName = "Emre";
		st1.studentID = 1;
		//increment the number of students
		
		//can I do it this way?
		//it will work, but it is not the proper way
		//st1.numberOfStudents++;
		
		//how is the proper way??
		Homework.numberOfStudents++;
		
		
		
		Homework st2 = new Homework();
		st2.studentName = "Yildirim";
		st2.studentID = 2;
		//increment
		Homework.numberOfStudents++;
		
		
		Homework st3 = new Homework();
		st3.studentName = "Helen";
		st3.studentID = 3;
		Homework.numberOfStudents++;
		
		System.out.println("The total number of students is " + Homework.numberOfStudents);
		
		
		
		
		System.out.println(Homework.numberOfStudents);
		
		
	}
}