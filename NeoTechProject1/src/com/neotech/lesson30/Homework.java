package com.neotech.lesson30;
import java.util.LinkedHashMap;
import java.util.Set;
//Create a map of car models that you have in your garage and for each model the 
//number of car you have. So the Key is the model and the value is the number of cars. 
//Use LinkedHashMap.
//For example:
//"BMW" -> 2
//"Mercedes" -> 3
//"Audi" -> 3
//"Ferrari" -> 1
//- Check how many entries you have.
//- Update the number of Audis to 5.
//- Add a new model with any number of cars.
//- Check how many Ferraris you have.
//- Check if you have Honda in your map.
//- Remove Mercedes from the map.
//- Get all models from the map. (use keySet() method)
//
//Note: After each step print the map.
public class Homework {

	public static void main(String[] args) {
		
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		
		map.put("BMW", 2);
		map.put("Mercedes", 3);
		map.put("Audi", 3);
		map.put("Ferrari", 1);
		System.out.println("How many brand of car is in the garage?");
		System.out.println(map.size());
		
		System.out.println("-------------------------------------------------------------");
		
		map.replace("Audi", 5);
		System.out.println(map);
		System.out.println("-------------------------------------------------------------");
		
		map.put("Lexus", 4);
		System.out.println(map);
		System.out.println("-------------------------------------------------------------");
		
		System.out.println("How many Ferraris is in the garage? " + map.get("Ferrari"));
		System.out.println("Is there a Honda in the garage? " + map.containsKey("Honda"));
		
		System.out.println("-------------------------------------------------------------");
		map.remove("Mercedes", 3);
	
		Set<String> keys = map.keySet();
		System.out.println("I have " +keys+ "in the garage.");
	}

}
