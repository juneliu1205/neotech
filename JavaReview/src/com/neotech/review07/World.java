package com.neotech.review07;

public class World {

	public static void main (String[] args) {
		
		//1st way using the constructor with NO parameters
		Person p1 = new Person();
		p1.displayInfo();
		
		
		p1.name="Jasmine";
		p1.age=20;
		p1.weight=120;
		//p1.String hairColor="Black";
		
		p1.displayInfo();
		
		System.out.println("----------------------------------");
		
		//2st way using the constructor with 2 parameters
		Person p2 =new Person("Ermal", 40);
		p2.displayInfo();
	
		p2.weight=200;
		p2.displayInfo();
		
		System.out.println("----------------------------------");
		Person p3 =new Person("Alban", 27);
		p3.displayInfo();
		
		//2st way using the constructor with 3 parameters
		System.out.println("----------------------------------");
		Person p4=new Person("John", 30, 195);
		p4.displayInfo();
		
	}
	
	
	
	
	
}
