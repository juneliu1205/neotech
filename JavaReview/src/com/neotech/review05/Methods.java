package com.neotech.review05;

public class Methods {

	void sayWelcome() {

		for (int i = 1; i <= 5; i++) {
			System.out.print("Welcome ");
		}
		System.out.println();
	}

	void sayWelcomeWithNumber(int n) {
		for (int i = 1; i <= n; i++) { 
			System.out.print("Welcome ");
		}
		System.out.println();
	}
	
	void sayGreeting(String greeting) {
		for (int i = 1; i <= 5; i++) { 
			System.out.print(greeting+" ");
		}
		System.out.println();
	}
	
	void methodWithFourParameters(String name, int age, String lastName, String nationality) {
		System.out.println("My full name is -> "+ name + lastName);
		System.out.println("My age is -> "+ age);
		System.out.println("My name nationality -> "+ nationality);
	}
	
	public static void main(String[] args) {
    Methods m =new Methods();
    m.sayWelcome();
    m.sayWelcomeWithNumber(3);
    m.sayWelcomeWithNumber(8);
    m.sayGreeting("Hola");
    m.sayGreeting("Salut");
    
    
    m.methodWithFourParameters("June", 37, " Liu", "Taiwanese" );
    
	}
}
