package com.neotech.lesson20;

public class HomeWork2 {

//Homework 2:
//Write a program that will have 4 different access levels of constructors and 
//create 3 objects of this class: 1 -inside same class; 2 -from outside the 
//class; 3 -from different class inside different package and observe result.
	
		String name, from;
		int age, grade;
	
	  HomeWork2() {
			System.out.println("This is default constructor.");
		}

		public HomeWork2(String name) {
			System.out.println("My name is " + name);
		}

		protected HomeWork2(String from, int age) {
			System.out.println("I am from "+ from + " and I am "+ age);
		}

		private HomeWork2(int grade) {
			System.out.println("My grade is "+ grade);
		}
	
		public static void main(String[] args) {
			
			HomeWork2 obj1 = new HomeWork2("Jasmine");
			HomeWork2 obj2 = new HomeWork2("Taiwan", 35);
			HomeWork2 obj3 = new HomeWork2(98);
			
	}
}	
		 