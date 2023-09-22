package com.neotech.lesson28;
//Homework 4:
//Create a Card class that will have implemented and 
//unimplemented methods and a constructor that will 
//initializes credit card type.
//Create 3 subclasses of a Card card.
//Create 3 objects of different card and store them into 
//LinkedList.
//Using for loop/advanced for loop/iterator access all 
//methods of the class.

abstract class Card {

	String cardType;
	
	Card (String cardType) {
		this.cardType = cardType;
	}
	
	abstract void benefits();
	void getPoint() {
		System.out.println(cardType + " is using reward point!");
	}
}
	
class aeCard extends Card {

	aeCard(String cardType) {
		super(cardType);
	}

	@Override
	void benefits() {
		System.out.println(cardType + " has travel protections.");
		
	}

}
	
class visaCard extends Card {

	visaCard(String cardType) {
		super(cardType);
	}

	@Override
	void benefits() {
		System.out.println(cardType + " has no annual fee.");
		
	}

}
	
class masterCard extends Card {

	masterCard(String cardType) {
		super(cardType);
	}

	@Override
	void benefits() {
		System.out.println(cardType + " has zero liability protection.");
		
	}

}