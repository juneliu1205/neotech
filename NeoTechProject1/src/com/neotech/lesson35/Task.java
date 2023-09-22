package com.neotech.lesson35;

class CantDriveException extends RuntimeException
{
	public CantDriveException (String msg)
	{
		super(msg);
		}
	}
	
public class Task {
	/*
	 * Create a method to check age eligibility that will throw a runtime 
	 * exception.
	 * Method should throw an exception if age is less than 16.
	 */
	
	public static void main(String[] args) {
	
		try {
		canIdrive(18);
		canIdrive(14);
	
		}
		catch (Exception ex) 
		{
			System.out.println(ex.getMessage());
		}
		System.out.println("end of code");
	}

	
	public static void canIdrive(int age)
	{
		if (age<16)
		{
			//throw new RuntimeException("You can't drive!");
			//I should throw an exception
			throw new CantDriveException("You can't drive!");
		}
		else
		{
			System.out.println("Drive Safe!");
		}
	}
	
}
