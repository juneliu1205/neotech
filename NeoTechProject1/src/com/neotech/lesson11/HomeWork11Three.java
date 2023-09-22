package com.neotech.lesson11;

public class HomeWork11Three {

	public static void main(String[] args) {

//		Homework 3:
//		Create an array of countries. While retrieving all values from an array print capital for each country.

		
    String[] countries = new String[3];
		
    countries[0] = "Taiwan";
    countries[1] = "Japan";
    countries[2] = "Korea";

    String[] capital = new String[3];
	
    capital[0] = "Taipei";
    capital[1] = "Tokyo";
    capital[2] = "Seoul";	
    
    System.out.println("The capital city of " + countries[1] + " is " +  capital[1]);	
    System.out.println("The capital city of " + countries[0] + " is " +  capital[0]);		
    System.out.println("The capital city of " + countries[2] + " is " +  capital[2]);		
		
	}
	}


