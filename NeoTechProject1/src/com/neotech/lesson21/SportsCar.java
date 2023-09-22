package com.neotech.lesson21;

public class SportsCar extends Car{

	boolean leatherSeats;
	
	public void heating() {

	if (leatherSeats==true) {
		System.out.println(make +" "+ model+ " has a leather seat");	
	}else {
		System.out.println("Dont have a leather seat");
	}
	
	}
	
	public void speed() {
		System.out.println( make +" "+ model +" is super fast sport car!");
	}

	
	public static void main (String []args) {
		SportsCar s = new SportsCar();
		s.make="Porsche";
		s.model="911";
		s.color="red";
		s.year=2022;
		
		s.leatherSeats=true;
		s.speed();
		s.run();
		s.printDetails();
		
	
	}
	
}
