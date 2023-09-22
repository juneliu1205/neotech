package com.neotech.review07;

public class Forest {

	public static void main (String[] args) {	
	
	Wolf w = new Wolf ("Wolfy", 4);
	w.sleep();
	w.displayInfo();
		
	Fox f = new Fox ("Foxy", 4, "Orange");
	f.sleep();
	f.displayInfo();
		
	Bear b = new Bear ("Bear", 4);
	b.sleep();
	b.displayInfo();
	b.roar();
		
	}
	
}
