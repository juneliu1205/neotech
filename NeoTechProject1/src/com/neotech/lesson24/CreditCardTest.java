package com.neotech.lesson24;

public class CreditCardTest {

	public static void main(String[] args) {
		CreditCard card1 = new CreditCard(4000);
		card1.calculateInterest();

		CreditCard card2 = new AX(8000); // up-casting
		card2.calculateInterest(); 

		CreditCard card3 = new Visa(12000);
		card3.calculateInterest();
		// card3.cashBack() // CE card3 is type of Parent(CreditCard)

		Visa card4 = new Visa(5000);
		card4.calculateInterest();
		card4.cashBack();

		int[] intArray = { 1, 2, 3, 4 };

		System.out.println("---- Array of Credit Cards-----");
		CreditCard[] cards = { card1, card2, card3, card4 };
		for (CreditCard cc : cards) {
			cc.calculateInterest();
		}

		System.out.println("-----Using normal for loop -----");
		for (int i = 0; i < cards.length; i++) {
			CreditCard cc = cards[i];
			cc.calculateInterest();
		}
		
	}
}