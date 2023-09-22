package com.neotech.review10;
import java.util.*;

public class WorldMap {

	public static void main(String[] args) {

		Map<String, String> europe = new TreeMap<>(); // ordered by key
		europe.put("France", "Paris");
		europe.put("Belgium", "Brussels");
		europe.put("Spain", "Madrid");
		System.out.println(europe);

		Map<String, String> africa = new LinkedHashMap<>(); // order is preserved
		africa.put("Kenya", "Nairobi");
		africa.put("Egypt", "Kairo");
		africa.put("Tunisia", "Tunis");
		System.out.println(africa);

		Map<String, String> asia = new HashMap<>(); // no order
		asia.put("China", "Beijing");
		asia.put("Taiwan", "Taipei");
		asia.put("Turkey", "Ankara");
		System.out.println(asia);

		// HW1 iterate europe by getting keys
		// HW2 iterate africa by getting values
		// HW3 iterate asia by getting entries

		System.out.println("--------WORLD--------");

		List<Map<String, String>> world = new ArrayList<>();
		world.add(europe);
		world.add(africa);
		world.add(asia);

		System.out.println("WORLD -> " + world);
		System.out.println("SIZE -> " + world.size());

		Map<String, String> map2 = world.get(2); // get the element with index 2
		System.out.println("The object with index 2 is -> " + map2);

		System.out.println("--------Let us iterate the world--------");

		for (Map<String, String> continent : world) {
			// System.out.println(continent);
			Set<String> countryNames = continent.keySet();
			for (String country : countryNames) {
				System.out.println(country + " -> " + continent.get(country));
			}

			System.out.println("--------");
		}

	}

}