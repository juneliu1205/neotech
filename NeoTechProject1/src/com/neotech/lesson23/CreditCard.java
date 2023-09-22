package com.neotech.lesson23;
public class CreditCard {
//Homework 1:
//▪ Create a class CreditCard and define two variables, balance and interest.
//▪ Create an instance method that will calculate the interest based on the given balance.
//▪ Create 2 subclasses: Visa and AX. In AX class override the method calculate interest.
//▪ Call the method by creating an object of each of the three classes.
	double balance, interest;

	public CreditCard(double balance) {
		this.balance = balance;
	}
	public void Calculateinterest() {
		interest = balance * 0.15;
	}
}
	class Visa extends CreditCard {
		public Visa(double balance) {
			super(balance);
		}
	}
	class AX extends CreditCard {
		public AX(double balance) {
			super(balance);
		}
		public void calculateInterest() {
			interest = balance * 0.25;
		}
	}
