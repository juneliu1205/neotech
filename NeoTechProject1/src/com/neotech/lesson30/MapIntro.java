package com.neotech.lesson30;

	import java.util.HashMap;

	public class MapIntro {

		public static void main(String[] args) {

			// HashSet<String> hs = new HashSet<>();

			// <K, V>:pair, entry, key-value pair
			HashMap<Integer, String> map = new HashMap<>();
			// we may have any object key:value pair
			// ex: Integer:Student or String:String

			map.put(1, "Alban");
			map.put(2, "Huseyin");
			map.put(3, "Emre");
			

			boolean isEmpty = map.isEmpty();
			System.out.println("Is my map empty? " + isEmpty);

			System.out.println("The size of my map is: " + map.size());

			System.out.println(map);

			// map.put("4", "Ahmet"); //Compile time error: key must be an integer
			map.put(4, "Emre");
			System.out.println(map);

			// new entry with duplicate key will override the existing value
			map.put(4, "Ogulcan");
			System.out.println(map);

			// how do we retrieve values from map?
			String name = map.get(2);
			System.out.println(name);

			// how do we replace a value
			map.replace(2, "Yasemin");
			System.out.println(map);

			// how do we remove Alban from the map
			map.remove(1);
			System.out.println(map);

			// check if an entry exists
			boolean checkKey = map.containsKey(2);
			System.out.println(checkKey);

			// check if Yasemin is in the map
			boolean checkValue = map.containsValue("Yasemin");
			System.out.println(checkValue);

		}

	}