package com.neotech.lesson23;

public class StudentTest {

	public static void main(String[] args) {
		
		Student s1 = new Student();	
		s1.dohomework();
		
		NeotechStudent s2 = new NeotechStudent();
		s2.dohomework();
		s2.record();
		
		CollegeStudent s3 = new CollegeStudent();
		s3.dohomework();
		s3.play();

		SchoolStudent s4 = new SchoolStudent();
		s4.eat();
		s4.play();
		
		Student s5= new NeotechStudent();
		s5.dohomework();
        //s5.record();
		
		NeotechStudent s6= (NeotechStudent) s2;
		s6.dohomework();
		s6.record();
	}

}
