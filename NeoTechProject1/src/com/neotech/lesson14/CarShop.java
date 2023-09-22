package com.neotech.lesson14;

public class CarShop {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.make = "Toyota";
		car1.model = "Camry";
		car1.color = "Black";
		car1.year = 2020;
		car1.mileage = 35000; 
		car1.maxSpeed = 200;
		
		System.out.println(car1.make + " " + car1.model + " " + car1.color + " "
				+ car1.year + " " + car1.mileage + " " + car1.maxSpeed);
		 
		car1.drive();
		car1.stop();
		car1.transportPeople();
		

		
		Car car2 = new Car();
		car2.make = "Honda";
		car2.model = "Accord";
		car2.color = "Red";
		car2.year = 2021;
		car2.mileage = 15000;
		car2.maxSpeed = 220;
		
		car2.drive();
		car2.stop();
		car2.transportPeople();
		
	
		
		//can I create a new object of Class Car???
		Car car3 = new Car();
		//I can create an object and not instantiate it
		Car car4;
		
		
	}

}