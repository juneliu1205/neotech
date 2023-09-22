package com.neotech.lesson28;

import java.util.Iterator;
import java.util.LinkedList;

public class CardLinkedList {

	public static void main(String[] args) {
		
		
LinkedList<Card> CardList = new LinkedList<>();
    CardList.add(new aeCard ("America Expresss"));
    CardList.add(new visaCard ("Chase Visa Card"));
    CardList.add(new masterCard ("Citi Master Card"));
    
    System.out.println("--------------------------------");
    
System.out.println("Enhanced for loop");
	
	for (Card c:CardList) {
		c.benefits();
	}
	
	System.out.println("--------------------------------");
	System.out.println("Normal for loop");
	for (int i=0; i<CardList.size(); i++) {
		CardList.get(i).benefits();
	}
	
	System.out.println("--------------------------------");
	System.out.println("Iterator");
	Iterator<Card> it = CardList.iterator();
	
	while (it.hasNext()) {
		Card c = it.next();
		c.benefits();
	
		
	}
	
	}

}