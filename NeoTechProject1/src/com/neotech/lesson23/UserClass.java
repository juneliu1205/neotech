package com.neotech.lesson23;

public class UserClass {

	/*
	 * Write program: UserClass that has a constructor that initializes instance
	 * variable name and mobile number. Create a subclass UserInfo that will have
	 * user address variable and it also being initialized through constructor call.
	 * Print users name, mobile number and address in userDetails method. Test your
	 * code.
	 */
	
	String name;
	long mobileNumber;
	
	
	//if we define a parametrized constructor, but we do not define a default constructor
	//Java will not let the users of the class to call the default constructor
	
	//default constructor
	UserClass()
	{
		
	}
	
	
	UserClass(String name, long mobileNumber)
	{
		this.name = name;
		this.mobileNumber = mobileNumber;
	}
	
}


class UserInfo extends UserClass
{
	String userAddress;
	
	
	UserInfo(String name, long mobileNumber, String userAddress)
	{
	//	super();//if I do this, then the name and mobileNumber are initialized with default values
		super(name, mobileNumber);
		this.userAddress = userAddress;
	}
	
	void userDetails()
	{
		System.out.println("User Details:");
		System.out.println("Name -> " + name);
		System.out.println("Mobile -> " + super.mobileNumber);
		System.out.println("Address -> " + userAddress);
	} 
	
}