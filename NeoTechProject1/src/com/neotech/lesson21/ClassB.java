package com.neotech.lesson21;

public class ClassB extends ClassA {

boolean  lovetoDance;
	
	public void dancing() {
		System.out.println(name + " love to dance!");
		}

	
public static void main (String []args) {
	ClassB b=new ClassB();
	b.name="Kristien";
	b.className= "Pole Fitness";
	
	b.lovetoDance=true;
	b.workout();
	b.dancing();
}
}