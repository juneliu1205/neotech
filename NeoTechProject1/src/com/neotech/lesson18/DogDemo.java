package com.neotech.lesson18;

public class DogDemo {

	public static void main(String[] args) {
		
		Dog dog1 = new Dog();
		dog1.name = "Layz";
		dog1.age = 2;

		dog1.displayDogInfo();
		Dog.breed = "sheppard";

		Dog dog2 = new Dog();
		dog2.name = "Melo";
		dog2.age = 7;
		dog2.displayDogInfo();
		dog1.displayDogInfo();

		Dog dog3 = new Dog();
		dog3.name = "Magic";
		dog3.age = 3;
		dog3.displayDogInfo();

	}

}