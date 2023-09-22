package com.neotech.lesson28;

import java.util.ArrayList;
import java.util.Iterator;

public class HomeworkDrink {
	public static void main(String[] args) {
		//Create an arrayList of drinks. If any drink has 
		//letter "a" or "e" replace it with water.

			ArrayList<String> drinks = new ArrayList<>();
			drinks.add("Coke");
			drinks.add("Gin and Tonic");
			drinks.add("Tea");
			drinks.add("Boston Sour");
			drinks.add("Wine");
			System.out.println(drinks);
			
			for (int i=0; i<drinks.size();i++) {
				if (drinks.get(i).contains("a") || drinks.get(i).contains("e")) {
					drinks.set(i, "water");
				}
			}
			System.out.println(drinks);
			}
}
