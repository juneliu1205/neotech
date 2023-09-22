package com.neotech.lesson29;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetFamily {

	public static void main(String[] args) {


		
		//HashSet -- no duplicates, no order
		Set<String> veggies = new HashSet<>();
		
		veggies.add("eggplant");
		veggies.add("tomato");
		veggies.add("tomato");
		veggies.add("potato");

		System.out.println(veggies);
		
		//LinkedHashSet -- no duplicates, insertion order
		Set<String> fruits = new LinkedHashSet<>();
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("banana");
		fruits.add("apple");
		
		System.out.println(fruits);
		
		//TreeSet -- no duplicates, ascending order
		Set<String> food = new TreeSet<>();
		food.add("eggs");
		food.add("apple"); //adding a duplicate (exists in fruits)
		food.addAll(veggies);
		food.addAll(fruits);
		
		System.out.println(food);	
		
	}

}