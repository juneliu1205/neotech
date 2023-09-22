package com.neotech.lesson24;

//▪ Create a class CreditCard and define two variables, balance and interest.
//▪ Create an instance method that will calculate the interest based on the given balance.
//▪ Create 2 subclasses: Visa and AX. In AX class override the method calculate interest.
//▪ Call the method by creating an object of each of the three classes.
public class CreditCard {
        double balance;
		double interest;
		
		public CreditCard(double balance) {
			this.balance = balance;
		}
	
		public void calculateInterest() {
			interest = 5;
			System.out.println("interest rate is: " + interest + "%");
		}
}
class AX extends CreditCard {
			
		public AX(double balance) {
			super(balance);
		}
		
		@Override
		public void calculateInterest() {
			if (balance < 5000) {
				interest = 10; 
			} else {
				interest = 20;
			}
			System.out.println("interest rate is: " + interest + "%");
		}
}
class Visa extends CreditCard {
	
		public Visa(double balance) {
			super(balance);
		}
		
		@Override
		public void calculateInterest() {
			if (balance < 10000) {
				interest = 15;
			} else {
				interest = 30;
			}
			System.out.println("interest rate is: " + interest + "%");
		}
		
		public void cashBack() {
			System.out.println("Visa gives 3% cashback!");
		}
		
	}