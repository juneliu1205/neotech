package com.neotech.lesson09;

public class BreakAndContinue {

	public static void main(String[] args) {
	
	System.out.println("-----------Break-----------");	
	
	for (int i=1; i<=10; i++)
	{
		if (i==4)
		{
			break;
		}
		System.out.println(i);
	}	
		System.out.println("-------Continue------");
		
		for (int i=1; i<=10; i++)
		{
			if (i == 7)
			{
				continue;
			}
			System.out.println(i);
			
		}
		
		
		
		
		
		
	}

}
