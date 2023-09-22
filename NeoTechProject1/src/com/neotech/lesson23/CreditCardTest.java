package com.neotech.lesson23;

public class CreditCardTest {

	public static void main(String[] args) {
		
		CreditCard c1 = new CreditCard(5000);
		c1.Calculateinterest();
		System.out.println("Credit Card Interest is: $ "+c1.interest);

		Visa c2 = new Visa(10000);
		c2.Calculateinterest();
		System.out.println("Credit Card Interest is: $ "+c2.interest);
		
		AX c3 = new AX(15000);
		c3.Calculateinterest();
		System.out.println("Credit Card Interest is: $ "+c3.interest);
		
		
		
	}

}
