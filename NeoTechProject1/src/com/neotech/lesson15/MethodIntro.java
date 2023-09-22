package com.neotech.lesson15;

public class MethodIntro {
 
	//does not return anything, no parameters
	void  greet() { 
		//method body
		System.out.println("Hello!");
		System.out.println("How are you today?");
		System.out.println("Bye!");
	}
	
	
void greet2(String name){
	System.out.println("Hello! "+name);
	System.out.println(name+ " How are you today?");
	System.out.println("Bye! "+name);
}
	

	public static void main(String[] args) {
		//create an object, call the method
		MethodIntro obj= new MethodIntro();
		obj.greet();
		
		//obj.greet2(); compiler error
		obj.greet2("Berkay");
		obj.greet2("Tom");
		
		String name="Helen";
		obj.greet2(name);
	}

}
