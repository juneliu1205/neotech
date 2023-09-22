package com.neotech.lesson23;

public class AnimalTest {
	public static void main(String[] args) {

				Animal obj1 = new Animal();
				//these are the methods that exist in the Animal class
				obj1.eat();
				obj1.sleep();
				
				
				Tiger obj2 = new Tiger();
				//these are methods available to the Tiger class
				obj2.eat();
				obj2.run();
				obj2.sleep();
				
				
				//primitive casting --- an int fits into double
				int i = 3;
				double d = i;
				
				//there are two parts to this line
							//create a Tiger object
				//assign it to an Animal object
				Animal obj3 = new Tiger();
				obj3.eat();
				obj3.sleep();
				//obj3.run(); //compile error - because the method run() is not defined
						//in the Animal class
				
				
				//we are casting a Tiger object, as an Animal object.
				//so, we can see/access all the methods that are defined in the Animal class
				//but when we override a method in the Tiger class, that takes priority 
				//on Runtime
				
				//can we do downcasting?
				//Down casting is not done like this!!!
				//Tiger obj4 = new Animal();
				
				//obj3 --> it is an Animal, but we knoww its a Tiger
				Tiger obj4 = (Tiger) obj3;
				obj4.run();
				obj4.eat();
				obj4.sleep();
				
				
				//we can also downcast this way, but it is not safe
				//Tiger obj5 = (Tiger) new Animal();
				
				}
		}