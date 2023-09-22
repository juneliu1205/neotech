package com.neotech.review10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;

public class SetExample {

	// Collection
	// List / Set / Queue (Three interfaces inheriting Collection)

	// ArrayList / LindedList (Two classes implementing List interfaces)
	// HastSet / LindedHashSet / TreeSet (Three classed implementing set interfaces)
	// /(insertion order)/(A-Z)

	// 1. List preserves the insertion order, but SET does NOT
	// 男人皮夾 v.s 女人包包
	// 2. List contains duplicates, but SET contains UNIQUE object
	// 3.

	public static void main(String[] args) {

		Set<String> africalLinked = new LinkedHashSet<>();// up-casting
		africalLinked.add("Morocco");
		africalLinked.add("Egypt");
		africalLinked.add("Senegal");
		System.out.println("Size-->" + africalLinked.size());

		// it will not add in the set, becasue it already exists.
		boolean added = africalLinked.add("Egypt");

		System.out.println("Size-->" + africalLinked.size());
		System.out.println("LinkedHashSet" + africalLinked);

		// no index concept in sets
		// can i add with index in a set? NO
		// africalLinked.add(0, "Kenya");

		Set<String> africaHash = new HashSet<>(africalLinked);
		System.out.println("HashSet" + africaHash);

		Set<String> africaTree = new TreeSet<>();
		africaTree.addAll(africalLinked);
		System.out.println("TreeSet" + africaTree);

		int size = africaHash.size();
		boolean contains = africaHash.contains("China");
		boolean isEmpty = africaHash.isEmpty();
		boolean ableToRemove = africaHash.remove("China");

		System.out.println("I was able to remove China-->" + ableToRemove);

		// Note: We are not able to get/add/remove by index in SET
		// africaHash.get(1);

		// System.out.println("for loop-Does not work in Set");
		// for (int i=0; i<africaHash.size(); i++) {
		// africaHash.get(i);
		// }

		System.out.println("For each loop");
		for (String ele : africaHash) {
			System.out.println(ele);
		}
		System.out.println("Iterate through the values");
		Iterator<String> it = africaHash.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}