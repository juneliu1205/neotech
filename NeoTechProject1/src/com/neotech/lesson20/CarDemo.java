package com.neotech.lesson20;

public class CarDemo {

	public static void main(String[] args) {
		Car c = new Car();
			
		c.make="Toyota";
		c.model="Camry";
		c.year= 2023;
		
		c.printDetails();

		Car c2 = new Car("BMW", "M5", 2021);
		c2.printDetails();
		
		Car c3=new Car("Honda", "CRV", 2022);
		c3.printDetails();
	}

}
