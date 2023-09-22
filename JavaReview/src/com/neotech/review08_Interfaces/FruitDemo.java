package com.neotech.review08_Interfaces;

public class FruitDemo {

	public static void main(String[] args) {
		Apple a= new Apple("Yelloe");
		a.peel();
		a.wash();
		
		
		Walnut w =new Walnut("Brown");
		w.Crack();
		
	
		Fruit f = new Apple("Red"); // up-casting
		//f.peel();
		//f.wash();
		
		Apple a2 = (Apple) f; //down-casting
		a2.peel();
		a2.wash();
		
		
		//We cant not create an object from an interface
		//Peelable p = new Peelable();
		
		Peelable p2 = new Apple ("Green"); //up-casting
		p2.peel();
		
		//wash() method is not defined in the Peelable Interface
		//p2.wash();
		
		Apple a3 = (Apple) p2;//down-casting explicitly
		a3.wash();
		a3.peel();
		
		
		// Task 1
		// Create an Orange class that extends Fruit and implement Peelable
		// Task 2
	    // Create an array of Peelable with 3 elements, one apple and two oranges
		// Iterate the array and execute the peel() method
		// Try to execute wash() method???
		
		System.out.println("--------Task 1-------");
		
		Orange o1= new Orange ("Blood Orange");
		o1.peel();
		
		
		System.out.println("--------Task 2-------");
		
		Peelable [] Peelable = new Peelable[3];
		Peelable[0] = a3; //apple
		Peelable[1] = o1; // orange
		Peelable[2] = new Orange("Orange"); // orange
		
		for (Peelable element : Peelable) {
			element.peel();
			//element.wash
		}
		
	}
	
}
