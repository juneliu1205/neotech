package com.neotech.lesson20;

public class ConstructorIntro {

	
	String name;
	int age;

	// name of constructor is the name of the class
	// there is no return type
	ConstructorIntro() {
		System.out.println("I am the default constructor!");
	}

	public static void main(String[] args) {

		ConstructorIntro con = new ConstructorIntro();
		con.name = "Dogukan";
		con.age = 27;
		System.out.println(con.name + " " + con.age);
	}

}