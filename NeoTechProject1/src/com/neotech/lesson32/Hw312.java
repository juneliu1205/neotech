package com.neotech.lesson32;
import java.util.*;
public class Hw312 {


		
//	    Create the collection that will store single unique objects of a String type
//	    in which order is preserved.
//	    Write a logic to concatenate all string from the collection.
		
		public static void main(String[] args) {
			
			Set<String> set = new LinkedHashSet<>();
			
			set.add("Today");
			set.add("is");
			set.add("Tuesday");
			set.add("and");
			set.add("I");
			set.add("miss");
			set.add("Sabah");
			
			String output = "";
			
			for (String word : set) {
				output += word + " ";
			}

			System.out.println(output);
			
		}

	}