package com.neotech.lesson14;

public class ShoppingPhone {

	public static void main(String[] args) {
		
		Phone phone1 = new Phone();
		phone1.model = "iPhone";
		phone1.price = 1200;
		phone1.year = 2023;
		
		phone1.wirelessCharging();
		phone1.batteryLife();
		phone1.greatCamera();	
		
	System.out.println("----------------------------------");	
	
		Phone phone2 = new Phone();
		phone2.model = "Android";
		phone2.price = 1000;
		phone2.year = 2023;
		
		phone2.wirelessCharging();
		phone2.batteryLife();
		phone2.greatCamera();	
		
		System.out.println("----------------------------------");		
		
		Phone phone3 = new Phone();
		phone3.model = "Nokia";
		phone3.price = 800;
		phone3.year = 2022;
		
		phone3.wirelessCharging();
		phone3.batteryLife();
		phone3.greatCamera();	
		
		
	}

}
