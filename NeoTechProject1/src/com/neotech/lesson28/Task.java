package com.neotech.lesson28;
import java.util.ArrayList;
import java.util.Iterator;

public class Task {

	public static void main(String[] args) {
	// Create arrayList with 6 different words. 
	//Remove every word that end with 'e'. Use iterator.

		ArrayList<String> words = new ArrayList<>();
		words.add("Eddie");
		words.add("Andrew");
		words.add("Amy");	
		words.add("April");	
		words.add("Joyce");	
		words.add("June");	
		System.out.println(words);
		
		Iterator<String> it = words.iterator();

		while (it.hasNext()) {
			String element = it.next(); // Get the next element
			System.out.print(element + " - ");

			if (element.endsWith("e")) {
				it.remove();
			}
		}
		System.out.println();

		System.out.println(words);
	}

}
