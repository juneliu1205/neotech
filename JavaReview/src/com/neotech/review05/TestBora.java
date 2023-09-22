package com.neotech.review05;

public class TestBora {

	public static void main(String[] args) {
	
		Bora b=new Bora();
		
		b.addTwoNumbers();
		b.addTwoNumbersThatIGive(7, 5);
		
		
		int res1 =b.addTwoNumberAndGiveMeTheResult();
		System.out.println(res1);
		
		
		int res2=b.addTwoNumberThatIGiveAndGiveMeBackTheResult(7, 5);
		System.out.println(res2);
		
		if (res2==12) {
			System.out.println("Good Job!");
		}else {
			System.out.println("Try again!");
		}
		
	}

}
