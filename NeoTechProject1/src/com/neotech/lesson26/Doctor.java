package com.neotech.lesson26;

public class Doctor {
	private long licenseID;
	private long phoneNumber;
	private String email;
	
	
	
	
	//setter for licenseID
	public void setLicenseID(long licenseID)
	{
		this.licenseID = licenseID;	
	}
	
	
	//getter for licenseID
	public long getLicenseID()
	{
		return licenseID;
	}
	
	//getter for email
	public String getEmail()
	{
		return email;
	}
	
	
	
	//write a setter for email
	//ONLY allow the change if:
		//the new email must not be empty
		//email must contain @gmail
	
	public void setEmail(String email)
	{
		if (!email.isEmpty())
		{
			if (email.contains("@gmail"))
			{
				this.email = email;
			}
			else //the email does not contain @gmail
			{
				System.out.println("You have to use @gmail!");
			}
		}
		else //it means the email is empty
		{
			System.out.println("Email cannot be empty!!!");
		}
			
	}
	
	
	//setter for phoneNumber
	public void setPhoneNumber(long phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
	
	
	
	//getter for phoneNumber
	public long getPhoneNumber()
	{
		return phoneNumber;
	}
	
	
	
}