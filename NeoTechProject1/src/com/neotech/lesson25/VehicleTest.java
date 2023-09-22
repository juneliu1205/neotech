 package com.neotech.lesson25;

public class VehicleTest {

	public static void main(String[] args) {

		//cannot instantiate abstract classes
//		Vehicle v = new Vehicle("Red");
//		Car c = new Car("Red", "Tesla");
		
	Vehicle v1 = new Tesla("Red", "Tesla");
	v1.start();
	v1.drive();
	v1.brake();
	v1.stop();
		
	//display does not exist in the Vehicle class
	//v1.display();

	//we can downcast to use display()
	Tesla t1 = (Tesla) v1;
	t1.display();

	//-------------------------
	Toyota toyota1 = new Toyota("Black", "Camry");
	Car toyota2 = new Toyota("Grey", "Rav4");
	Vehicle toyota3 = new Toyota("Blue", "Highlander");
	
	toyota1.start();
	toyota2.start();
	toyota3.start();
	
	//-----------------------------
	
	Tesla tesla1 = new Tesla("Black", "S");
	Vehicle tesla2 = new Tesla("Red", "3");
	
	tesla1.display();
	//cannot access
	//tesla2.display();
	
	}

}