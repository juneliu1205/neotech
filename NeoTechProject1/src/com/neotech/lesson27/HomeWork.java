package com.neotech.lesson27;

import java.util.ArrayList;

public class HomeWork {
	//Create a ArrayList that will store 5 names into it.
	//▪ Find out whether the given ArrayList is empty or not?
	//▪ Check whether the specific name is present in an ArrayList or not?
	//▪ Find the size of your ArrayList and print all values from the ArrayList
	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();
		
		names.add("April");
		names.add("Brian");
		names.add("Joyce");
		names.add("Daniel");
		names.add("Wong");
		
		System.out.println("ArrayList is empty or not?" + names.isEmpty());
		System.out.println("Does contain name Brian?" + names.contains("Brian"));
		System.out.println("size:" + names.size());
		System.out.println(names);
		
		System.out.println("Print all values from the ArrayList");
		for (int i=0; i<names.size();i++) {
			System.out.println(names.get(i));
		}
		System.out.println("----------------------------------------");
		for (String name : names) {
			System.out.println(name);
		}
	}

}
