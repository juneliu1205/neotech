package com.neotech.lesson28;

import java.util.LinkedList;

public class FoodLinkedList {

	public static void main(String[] args) {

		LinkedList<Food> foodList = new LinkedList<>();

		foodList.add(new Food("Salad", "Tomatoes", 100));
		foodList.add(new MexicanFood("Taco", "Chicken", 300));
		foodList.add(new RussianFood("Borsh", "Beets", 50));

		System.out.println("--------------------------------");

		for (Food f : foodList) {
			System.out.println(f.foodType + " " + f.ingredients + " " + f.calories);
		}

	}

}