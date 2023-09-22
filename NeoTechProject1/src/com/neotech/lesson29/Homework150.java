package com.neotech.lesson29;

import java.util.ArrayList;
import java.util.Iterator;

public class Homework150 {

	
	
	public static void main(String[] args) {
		
			//	Create an arrayList of even numbers from 1 to 50. 
			//	Using Iterator remove any number that is divisible by 5 from 
			//	that arrayList.

				ArrayList<Integer> numbers = new ArrayList<>();
				
				//how can I populate this with even numbers from 1 to 50
				//if we increment by 1, then we have to use an if condition if(i%2==0)
				for (int i = 0; i <= 50; i=i+2)
				{
					numbers.add(i);
				}
				
				//how to create an iterator
				Iterator<Integer> it = numbers.iterator();
				
				//hasNext() ---> checks if there is a next element
				//next() ---> it moves the pointer to the next element
				//remove() ---> remove the element
				
				while(it.hasNext()) //iterator points to the next element and it keeps 
					//track of the last returned element
				{
					Integer num = it.next();
					
					if(num % 5 == 0)
					{
						it.remove(); //it will remove the last returned element
					}
			
				}
				System.out.println(numbers);
				
			}
	
		}