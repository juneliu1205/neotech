package com.neotech.lesson15;

public class TestCaculatorWithReturn {

	public static void main(String[] args) {

		CaculatorWithReturn cal = new CaculatorWithReturn();
		
		int res= cal.add(6, 4);
		System.out.println(res);
		
		int res2= cal.multiply(5, 4);
		System.out.println(res2);
		
		//We are printing the result directly
		System.out.println(cal.multiply(6, 15));
		
		double res3=cal.divid(5.5, 2.2);
		System.out.println(res3);
		
		int num =cal.giveBackSomething();
		System.out.println(num);
		
		cal.dontGivebackAnything();

		
		double avg=cal.average(res2, res3, num);
		System.out.println(avg);
		
	}

}
 