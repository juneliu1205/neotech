package com.neotech.review07;

public class Student {

	//instance variables 可改變 需要object
		String name;
		int age;
		
	//static/class variables 全部學生 可以不用object
	static String school;
	
	
	public Student(String name, int age) {
		this.name= name;
		this.age=age;
	}
	
	//instance method
	public void displayStudentsInfo() {
		System.out.println(" My name is " + this.name + " and my age is " + 
	this.age + " and my school is "+ Student.school);
	}
	
	//static method
	public static void main (String[] args) {
		
		Student.school ="NeoTech";
		
		//Student s1=new Student();
		//we don;t have default constructor
		
		Student s2=new Student("Ryan", 35);
		s2.displayStudentsInfo();
		
		Student s3=new Student("Brian", 25);
		s3.displayStudentsInfo();
		school="UCI";
		s3.displayStudentsInfo();
		
	}
	
	
}
