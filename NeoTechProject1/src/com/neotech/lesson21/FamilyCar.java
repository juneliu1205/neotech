package com.neotech.lesson21;

public class FamilyCar extends Car {

boolean safety;
	
	public void bluetoothConnectivity() {
	System.out.println(make +" "+ model + " have bluetooth connection");
	
	if (safety==true) {
		System.out.println("It's great family car");	
	}else {
		System.out.println("Not a good family car");
	}
	
	}
	public static void main (String []args) {
		FamilyCar f = new FamilyCar();
		f.make="BMW";
		f.model="X7";
		f.color="black";
		f.year=2023;
		
		f.safety=true;
		f.bluetoothConnectivity();
		f.run();
		f.printDetails();
}
}