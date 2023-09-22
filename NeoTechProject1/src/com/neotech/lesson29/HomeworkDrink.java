package com.neotech.lesson29;

import java.util.ArrayList;
public class HomeworkDrink {

	public static void main(String[] args) {
		// Create an arrayList of drinks. 
		//If any drink has letter "a" or "e" replace it with water. 

		ArrayList<String> drinks = new ArrayList<>();
		// 	0		1	  2		3	 4
		//[coffee, soda, milk, tea, water]
		drinks.add("coffee");
		drinks.add("soda");
		drinks.add("milk");
		drinks.add("tea"); //where is this added? by default its added to the end of the list
		drinks.add(1, "water"); //this is inserted just before soda, and everything else 
		//will be pushed by 1 index
		
		//using for each 
		for (String drink : drinks)
		{
			//check if it contains the letter a or e
			if(drink.contains("a") || drink.contains("e"))
			{
				//we want to replace it with water
				//we did not update/change the list
				drink = drink.replace(drink, "water");
			}
			System.out.print(drink + " ");
		}
		System.out.println();
		System.out.println(drinks);
		
		
		
		//indexed for loop
		for (int i = 0; i < drinks.size(); i++)
		{
			if (drinks.get(i).contains("a") || drinks.get(i).contains("e"))
			{
				drinks.set(i, "water");
			}
		}
		
		System.out.println(drinks);
	}

}
	