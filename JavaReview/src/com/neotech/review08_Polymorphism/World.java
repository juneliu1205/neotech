package com.neotech.review08_Polymorphism;

public class World {

	public static void main(String[] args) {

		Human.planet = "Earth";
		Human h1 = new Human();
		System.out.println(h1.name + " lives in " + Human.planet);

		Human h2 = new Human("Joyce");
		System.out.println(h2.name + " lives in " + Human.planet);

		Human.planet = "Mars"; // We are sending everyone to Mars
		System.out.println(h2.name + " lives in " + Human.planet);

		// Declaring a variable of type Human
		Human h3;

		// Creating an Albanian and assigning to h3
		h3 = new Albanian("John"); // up-casting
		System.out.println(h3.name + " lives in " + Human.planet);

		Human h4 = new Turkish("Aybars");// up-casting, automatically
		System.out.println("Ler us make the people talk, by giving money");
		h1.talk();
		h2.talk();
		h3.talk();
		h4.talk();

		// Polymorphism
		// Method Overriding
		// Runtime Polymorphism/late blinding/dynamic binding

		// Compile Error, because h4 is of type uman
		// h4.makeBaklava()

		System.out.println("------------------------------------");
		Turkish t1 = (Turkish) h4; // down-casting, manually
		t1.makeBaklava();

		// This will give a runtime error
		// Turkish t2 = (Turkish) h3;
		// t2.makeBaklava();

		System.out.println("------------------------------------");
//		
//		//This is a safe way to down-cast
//		if (h3 instanceof Albanian) {
//			//Can cast/Covert in to Albanian
//			Albanian alb = (Albanian) h3;
//			alb.albanianDance();
//			
//		}else if (h3 instanceof Turkish) {
//			//Can cast/Covert in to Turkish
//			Turkish tur = (Turkish) h3;
//			tur.makeBaklava();
//		}
		System.out.println("--------------------------------");

		American us1 = new American("Donald", "234-65-0986");
		us1.talk();
		us1.taxReturn();

		Human h5 = us1; // up-casting, implicitly
		h5.talk();
		// h5.taxReturn();

		American us2 = (American) h5; // down-casting, explicitly
		us2.taxReturn();

		System.out.println("--------Power of Polymorphism--------");

		Human[] humans = new Human[6];
		humans[0] = h1;
		humans[1] = h2; // Human
		humans[2] = h3; // Albanian
		humans[3] = h4; // Turkish
		humans[4] = h5; // American
		humans[5] = new American("Barrack", "secret"); // up-casting
		// This is possible because of inheritance

		for (Human element : humans) {
			element.talk();
		}

	}
}