package com.neotech.lesson31;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {

		
		Hashtable<Integer, String> ht = new Hashtable<>();
		
	//	HashMap<Integer, String> hm = new HashMap<>();
		
		ht.put(2, "Yildirim");
		ht.put(3, "Ogulcan");
		ht.put(1, "Dogukan");
		ht.put(4, "Nur");
	//	ht.put(5, null); //null values are not allowed
	//	ht.put(null, "Can"); //null keys are not allowed
		
		System.out.println(ht);
		System.out.println("The size of the hashtable is: " + ht.size());
		
		//What is the difference between HashMap and Hashtable???
		//Hashtable does not allow null keys or values
		//Hashtable is a legacy class, HashMap is newer
		//HashMap is faster that Hashtable
		//Hashtable is SYNCHRONIZED, HashMap is not.
		
		
	}

}