package com.neotech.lesson14;

public class School {

	public static void main(String[] args) {
		
		
		//ClassName identifier =  new ClassName();
		
		Student s1 = new Student(); //vs Student s1; --> I am also initializing
		s1.name = "Ali";
		s1.lastName = "K";
		s1.school ="Neotech Academy";
		s1.studentId = 1;
		s1.age = 20;
		s1.grade = 'A';
		
		s1.study();
		s1.doHomework();
		s1.grade();
		

		Student s2 = new Student();
		s2.name = "Huseyin";
		s2.lastName = "Kus";
		s2.school = "Neotech Academy";
		s2.studentId = 2;
		s2.age = 22;
		s2.grade = 'A';
		
		s2.study();
		s2.doHomework();
		s2.grade();
		
		//can I still access student 1 info???
		s1.study();
		
		

	}

}
