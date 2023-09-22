package com.neotech.lesson15;

public class Task {

//	 * method1: Create a method that will take 2 parameters as numbers and prints
//	 * which number is larger.
//	 *
//	 * method2: Create a method that will take a number and
//	 * prints whether the number is even or odd.
//	 *
//	 * method3: Create a method that will say Hello in a different
//	 * language based on the country that will passed when method is executed.
//	 */
//	
//	//minimalistic method:
//	// 1. return type (void)
//	// 2. in this case, two int parameters
//	// 3. name

	void larger(int a, int b) {
		if (a > b) {
			System.out.println(a + " is larger than " + b);
		} else if (b > a) {
			System.out.println(b + " is larger than " + a);
		} else {
			System.out.println("Number are even");
		}
	}
	void evenOrodd(int num) {
		if (num % 2 == 0) {
			System.out.println(num + " is even!");
		} else {
			System.out.println(num + " is odd");
		}
	}
	void sayHello(String country) {
		switch (country) {
		case "US":
			System.out.println("Hello!");
			break;
		case "Japan":
			System.out.println("こんにちは!");
			break;
		case "Korea":
			System.out.println("Annyeong haseyo!");
			break;
		case "Taiwan":
			System.out.println("你好");
			break;

		default:
			System.out.println("I dont know how to say hello for " + country);
		}
	}
	public static void main(String[] args) {
		Task t = new Task();
		t.larger(3, 3);
		t.evenOrodd(8);
        t.sayHello("US");
        t.sayHello("Taiwan");
        t.sayHello("Korea");
        t.sayHello("Japan");
	}
}