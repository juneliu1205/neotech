package com.neotech.lesson20;

public class Task1 {
String name;
int age;
	
	Task1() {
		System.out.println("I am a non-argument constructor");
	}

	Task1(String str) {
		System.out.println("I am a constructor with a string: " + str);
	}
	
	
	public static void main(String[] args) {
		
		Task1 t = new Task1();

		Task1 t1 = new Task1("John");


	}

}
