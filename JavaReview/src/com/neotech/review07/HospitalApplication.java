package com.neotech.review07;

public class HospitalApplication {

	public static void main (String[] args) {

	Doctor d1 =new Doctor("Olga", 310000, "RU123");
	
	
	d1.checkUp("Albert");
	
	//These are methods of the child class
	//d1.dermID="US235";
	//d1.applySkinTreatment();
	
	//Creating a Dermatologist with No initial information
	Dermatologist d2= new Dermatologist();
	d2.name="June";
	d2.salary=450000;
	d2.licenceID="TW8888";
	d2.dermID="DM89938";
	
	d2.checkUp("Joyce");
	d2.applySkinTreatment();
	
	
	System.out.println("-------------------------------");
	Dermatologist d3= new Dermatologist("Emma", 38000, "Em34677", "DL9483");
	d3.applySkinTreatment();
	d3.checkUp("Jason");
	
	System.out.println("-------------------------------");
	//Dermatologist d3= new Dermatologist("Emma", 38000, "Em34677");
	//The constructor are NOT inheritance 
	
	}
	
	
	
}
