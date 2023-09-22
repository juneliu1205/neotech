package com.neotech.lesson30;

import java.util.HashMap;
import java.util.Set;

public class Building {
//	* Create a map of a building. Store floor number and it is associated company
//	 * name. (Example: 1=Google, 2=Apple, 3=Neotech etc..). Insert 7 entries with
//	 * duplicate keys and values.
//	 * - Check how many entries you have?
//	 * - Update company on a 4th floor
//	 * - Remove company on the 7th floor
//	 * - Print your map
	
	public static void main(String[] args) {
	
		HashMap<Integer, String> Building = new HashMap<>();
		Building.put(1,"Google");
		Building.put(2,"Apple");
		Building.put(3,"Neotech");
		Building.put(4,"Facebook");
		Building.put(5,"Samsung");
		Building.put(6,"Tiktok");
		Building.put(7,"X");
		
		System.out.println(Building);
		
		System.out.println("How many entries? " + Building.size());
		Building.put(4,"Adobe");
		Building.remove(7,"X");
		System.out.println(Building);
		

	}

}
