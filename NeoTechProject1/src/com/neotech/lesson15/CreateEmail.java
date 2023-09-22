package com.neotech.lesson15;

public class CreateEmail {

// Create a method createEmail(). Based on provided users firstName, lastName and emailType, 
//your method should return complete email address.
//Example: 
//firstName -> john
//lastName -> snow
//emailType -> gmail
//return -> johnsnow@gmail.com
	
	
	
	
	
	String create (String firstName, String lastName, String emailType) {
		String result= firstName+lastName+"@" +emailType+ ".com";
		 return result;
	}
	
	public static void main(String[] args) {
		CreateEmail c = new CreateEmail();
		String result= c.create("john", "snow", "gmail");
		System.out.println(result);
	}
}