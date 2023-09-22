package com.neotech.lesson12;

public class RetrieveElements {

	public static void main(String[] args) {

		char[] grades = { 'A', 'B', 'C', 'D', 'F' };

		// how to get values of the array
		// 1st way, using indeved for loop

		for (int i = 0; i <= grades.length - 1; i++) {
			System.out.print(grades[i] + ", ");
		}
		System.out.println();

		// 2nd way enhanced for loop/ advanced for loop/for-each loop
		for (char element : grades) {
			System.out.print(element + ", ");
		}
		//1.char element get the value of the first element in grades
		//2.execute body
		//3.check if there is another element
		    //if yes, go to 1, else get out of loop
		
		System.out.println();
	
		String[] fruits= {"Apple", "Orange", "Tomato", "Cucumber", "Cherry"};
		
		for (int i=0; i<fruits.length; i++)
		{
			if (fruits [i].equals("Orange"))
			{
				System.out.println(fruits[i]+ " is my favorite fruits!");
			}		
			else 
			{ 
				System.out.println(fruits[i]);
			}	
		}	
		
		System.out.println("-----------------------------");
		
		for (String fruit:fruits)
		{
			if (fruit.equals("Orange"))
			{
				System.out.println(fruit+ " is my favorite fruits!");
			}
			else 
			{
				System.out.println(fruit);
			}		
					
		}
		
		
	}
}
