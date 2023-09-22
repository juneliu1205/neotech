package com.neotech.lesson14;

public class Shelter {

	public static void main(String[] args) {

		Dog Dog1 = new Dog();
		Dog1.breed = "Husky";
		Dog1.size = "Large";
		Dog1.age = 5;
		Dog1.color = "Black";

		Dog1.eat();
		Dog1.run();
		Dog1.breed();

		System.out.println("---------------------------------");

		Dog Dog2 = new Dog();
		Dog2.breed = "Labrador";
		Dog2.size = "Large";
		Dog2.age = 3;
		Dog2.color = "White";

		Dog2.eat();
		Dog2.run();
		Dog2.breed();

		System.out.println("---------------------------------");

		Dog Dog3 = new Dog();
		Dog3.breed = "Bulldog";
		Dog3.size = "Medium";
		Dog3.age = 4;
		Dog3.color = "Brown";

		Dog3.eat();
		Dog3.run();
		Dog3.breed();

	}

}
