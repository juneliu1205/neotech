package com.neotech.lesson28;

import java.util.ArrayList;
import java.util.Iterator;

public class FlowerTest {

	public static void main(String[] args) {

		// Store element in an Array
		Flower[] flowerArray = { new Rose("Rose"), new Tulip("Tulip"), new Sunflower("Sunflower") };

		// We cannot add anymore
		// flowerArray[3] = new Rose("R");

		// 1st difference -> Arrays are fixed in size

		ArrayList<Flower> flowerList = new ArrayList<>();
		flowerList.add(new Rose("Rose"));
		flowerList.add(new Tulip("Tulip"));
		flowerList.add(new Sunflower("Sunflower"));

		// Enhanced for loop
		for (Flower fl : flowerList) {
			fl.bloom();
		}

		System.out.println("--------------------------------");

		// Normal for loop
		for (int i = 0; i < flowerList.size(); i++) {
			// Flower fl = flowerList.get(i);
			// fl.bloom();

			// One liner
			flowerList.get(i).bloom();
		}

		System.out.println("--------------------------------");

		// Iterator
		Iterator<Flower> it = flowerList.iterator();

		while (it.hasNext()) {
			Flower fl = it.next();
			fl.bloom();

			// One liner
			// it.next().bloom();
		}
	}

}