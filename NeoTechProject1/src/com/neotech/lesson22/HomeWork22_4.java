package com.neotech.lesson22;

//Homework 4:
//Write program: UserClass that has a constructor that
//initializes instance variable name and mobile number.
//Create a subclass UserInfo that will have user address
//variable and it also being initialized through constructor
//call. Print users name, mobile number and address in
//userDetails method. Test your code.
	
public class HomeWork22_4 {

	String name;
	int number;

	HomeWork22_4 (String name, int number){
		this.name=name;
		this.number=number;
	}
	void userDetails() {
		System.out.println("Users Name: " + name + " Mobile Numer: " + number );
	}
	}
	
	class UserInfo extends HomeWork22_4 {
		
	String address;
	
	public UserInfo (String name, int number, String address) {
		super (name, number);
		this.address=address;
	}
	void userDetails2() {
		System.out.println("Users Name: " + name + " Mobile Numer: " + number + " Address: " +address);
	}
	}
	

