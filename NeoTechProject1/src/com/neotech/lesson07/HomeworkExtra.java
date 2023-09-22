package com.neotech.lesson07;

import java.util.Scanner;

public class HomeworkExtra {

	public static void main(String[] args) {
	//Create a Jave program that will asl user to input city and temperature.
	//Your program should convert Fahrenheit into celsius and print 
	//"The temperature in the city________is __________"
		
	Scanner scan= new Scanner (System.in);
	String city;
	Double f, c;
	
	System.out.println("Please enter the city and temperature:");
	city= scan.next();
	f= scan.nextDouble();
	c= (f-32)*5/9;
	System.out.println("The temperature in " + city + " is " + c + " degree celcius!");
	
		

	}

}
