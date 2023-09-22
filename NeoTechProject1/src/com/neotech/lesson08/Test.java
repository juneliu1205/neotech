package com.neotech.lesson08;

public class Test {

	 //* Create a boolean variable workDay and assign true
	 // * create int variable day and assign it to 1
	 //* - As long as it is eorkDay print "I need a day off" and
	 //* increase day. - Once day is 6 print  "I do not need a day off anymore"
	 //*/
	
	public static void main(String[] args) {
	
		
	boolean workDay = true;
	int day =1;
	
	while (workDay) {
		if (day<6) {
			System.out.println("I need a Day off!");
	}   else {
		    System.out.println("I do not need a Day off anymore!");
		    workDay=false;
	}
		day++;
	}	
		
	
	
	
	
	int day2 =1;
	while (day2 <6) {
		System.out.println("I need a Day off!");
		day2++;
	}
	  System.out.println("I do not need a Day off anymore!");
	
	
	
	
	
	
		
	}

}
