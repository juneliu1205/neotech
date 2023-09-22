package com.neotech.review05;

public class sayGreetingWithNumber {

	void sayGreetingwithNum(String greeting, int n) {

		for (int i = 1; i <= n; i++) {
			System.out.print(greeting + " " );
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		sayGreetingWithNumber g =new sayGreetingWithNumber();
	g.sayGreetingwithNum("Hello",5);
	g.sayGreetingwithNum("你好",8);
	
	//compile-time error
	//you have to provide 2 parameters, String and Int
	//g.sayGreetingwithNum("Konichiwa") wont work
	
	
	
	
	
	
	}
	
}
