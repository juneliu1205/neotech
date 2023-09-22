package com.neotech.lesson10;

public class PrintHours {

	public static void main(String[] args) {
    //print the whole combination of hours in the digital clock
		//00:00
		//00:01
		//..
		//..
		//12:00
		//..
		//..
		//23:59
		
		for (int hour = 0; hour < 24; hour++)
		{
			//System.out.println(hour);
			
			for (int min=0; min<60; min++)
			{
				//System.out.println(hour + ":" + min);
				//1, when hour <10 && min<10  0:1--->00:01
				//2. when hour <10 && min>=10  1:10--->01:10
				//3. when hour >=10 && min<10  10:1--->10:01
				
				if (hour<10 && min<10)
				{
					System.out.println("0" + hour+ ":0" + min);
				}
				else if (hour<10 && min>=10)
				{
					System.out.println("0" + hour+ ":" + min);
				}
				else if (hour>=10 && min<10)
				{
					System.out.println(hour+ ":0" + min);
				}
				
				else {
					System.out.println(hour+ " : " + min);
				}
				
			}
			
		}
			
		
		
		
		
		
		
		
		
		
		
	}

}
