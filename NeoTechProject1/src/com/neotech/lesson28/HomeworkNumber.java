package com.neotech.lesson28;

import java.util.ArrayList;
import java.util.Iterator;

//Create an arrayList of even numbers from 1 to 50. 
//Using Iterator remove any number that is divisible 
//by 5 from that arrayList.

public class HomeworkNumber {

public static void main(String[] args) {
		
		ArrayList<Integer> numberList = new ArrayList<>();
		
		for (int i=0; i<=50; i=i+2) {
			numberList.add(i);
			}
		
		
		Iterator<Integer> it = numberList.iterator();
	
		while (it.hasNext()) {
			int num = it.next(); 
			if (num % 5 ==0) {
				it.remove();
			}
		}
	
		System.out.println(numberList);

	
	
}
	
	
}
