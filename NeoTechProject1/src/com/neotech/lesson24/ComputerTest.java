package com.neotech.lesson24;

public class ComputerTest {

	public static void main(String[] args) {

		Computer com1=new Computer("Acer", 8);
		com1.displayInfo();
		System.out.println("----------------------------------------");
		Computer com2=new Apple("MacBook Pro", 32);
		com2.displayInfo();
		Apple r= new Apple("MacBook Pro", 32);
		r.retinaDisplays();
		System.out.println("----------------------------------------");
		Computer com3=new Lenovo("ThinkPad", 4);
		com3.displayInfo();
		System.out.println("----------------------------------------");
		Computer com4=new HP("ENVY", 16);
		com4.displayInfo();
		System.out.println("----------------------------------------");
		Computer com5=new Dell("XPS", 32);
		com5.displayInfo();
		System.out.println("----------------------------------------");
		System.out.println("Array");
		int[] intArray = { 1, 2, 3, 4, 5};
		Computer[] comp = { com1, com2, com3, com4, com5 };
		for (Computer com:comp) {
			com.displayInfo();
		}
	}

}
