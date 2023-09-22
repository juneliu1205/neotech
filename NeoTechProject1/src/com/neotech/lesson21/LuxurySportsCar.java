package com.neotech.lesson21;

public class LuxurySportsCar extends SportsCar{

	boolean backupCamera;
	
	public void powerfulEngine() {
		System.out.println(make +" "+ model+ " have a powerful engine");
		if (backupCamera==true) {
			System.out.println(make +" "+ model+ " has backup camera");	
		}else { 
			System.out.println("Dont have backup camera");
		}
		
		}
	public void performance() {
		System.out.println( make +" "+ model +" has high-end performance!");
	}
	

	public static void main (String []args) {
		LuxurySportsCar l = new LuxurySportsCar();
		l.make="Jaguar";
		l.model="F-Type R Coupe";
		l.color="Silver";
		l.year=2023;
		
		l.leatherSeats=true;
		l.heating();
		l.speed();
		l.backupCamera=true;
		l.powerfulEngine();
		l.performance();
		
	
	}
	
}
