package com.neotech.review08_Abstraction;

public class Word {

	public static void main(String[] args) {
		
		//I cant create an object from an abstract class
		//Human h1 = new Human("Olga");
		
		//up-casting and down-casting
		//can only be done because INHERITANCE
        Human a1= new Albanian("Alban");//up-casting
        a1.talk();
        a1.sleep();
        //a1.albanianDance();
        
        Human t1= new Turkish("Mesut");
        t1.talk();
        t1.sleep();
        //t1.makeBaklava();
	
        Turkish tur = (Turkish) t1; //down-casting
        tur.makeBaklava();
         
        System.out.println("-------------------------");
    	Human[] human = new Human[5];
		human[0] = a1;// Albanian
		human[1] = t1; // Turkish
		human[2] = a1; // Albanian
		human[3] = t1; // Turkish
		human[4] = a1; // Albanian
		// This is possible because of inheritance

		for (Human element : human) {
			element.talk();
			element.sleep();
		}
        
        
        
        
        
        
	}
		
		
}
