package com.neotech.lesson26;

public class Employee {
	private String name;
	private int age; 
	private double salary; //this can be access only within the same class
	
	
	//we can define getters and setters
	
	//I want to provide a method that allows
	//the users who use my class to get the name variable
	//getter: has a return type
	
	
	public String getName()
	{
		return name;
	}
	
	
	//I want to provide a method that allows users of this 
	//class to set the name
	
	//setters: 
	public void setName(String name)
	{
		//I want to allow this only if the string sent is not empty
		//and it is at least 3 characters
		if(!name.isEmpty() && name.length()>=3)
		{
			this.name = name;
		}
	}
	
	
	//getter for age
	public int getAge()
	{	
		return age;
	}
	
	//setter for age
	public void setAge(int age)
	{
		this.age = age;
	}

	//getter for salary
	public double getSalary() {
		return salary;
	}

	//setter for salary
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
}