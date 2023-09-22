package com.neotech.lesson25;

public class ComputerTest {
	public static void main(String[] args) {
		
				Apple app = new Apple("Apple");
				HP hp = new HP("HP","Red");

				//arrays want the same data type
				
				int[] array = {3,4,6,7,3};
				
				
				
				Computer c1 = new Dell("Dell");
				Computer c2 = new Lenovo("Lenovo");
				
				//one way of storing Computer objects in an array
				Computer[] compArray = {c1,c2};
				
				//another way of creating an array of computers
				Computer[] compArray2 = {new Dell("Dell"), new HP("HP", "Black"),
						new Apple("Apple")};
				
				for (Computer comp : compArray2)
				{
					System.out.println("The brand is: " + comp.brand);
					comp.run();
					
					//what if we try to run a method that exists in the subclass but not
					//in the parent class
				//	comp.save(); //This method does not exist in the Computer class
					
				}
				
				
				
				Apple[] appleArray = {new Apple("Apple1"), new Apple("Apple2")};
				
				
			}
		}
