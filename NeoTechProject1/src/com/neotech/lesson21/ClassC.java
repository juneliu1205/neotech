package com.neotech.lesson21;

public class ClassC extends ClassB {

boolean lovetoRunning;
	
	public void running () {
		System.out.println(name + " love to run!");
}
	public static void main (String []args) {
		ClassC c=new ClassC();
		c.name="April";
		c.className= "Hitt Class";
		c.lovetoRunning=true;
		
		c.workout();
		c.dancing();
		c.running();
	
	}
	
}
