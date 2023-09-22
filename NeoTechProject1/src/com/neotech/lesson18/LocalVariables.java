package com.neotech.lesson18;

public class LocalVariables {

	public static void main(String[] args) {
			LocalVariables obj1 = new LocalVariables();
			obj1.method1();
			obj1.method2();
			
			boolean flag = true;
			if (flag) {
				String answer = "yes";
				System.out.println(answer);
				System.out.println(flag);
			}
			
			// System.out.println(answer);
			System.out.println(flag);
			// The scope/lifetime of the variable "answer" is only the if block
			// The scope of the flag variable is the main method
			
			System.out.println("----------------");
			for (int i = 0; i <= 5; i++) {
				System.out.println(i);
			}
			
			// System.out.println(i); Gives error since i is a local variable
			System.out.println("----------------");
			int x;
			for (x = 0; x <= 5; x++) {
				System.out.println(x);
			}
			
			System.out.println(x);
			String name = "Shane";
			System.out.println(name);
		}
	
		void method1() {
			String name = "Cihan";
			int age = 28;
			System.out.println(name);
			System.out.println(age);
		}
		
		void method2() {
			String name = "Yasemin";
			System.out.println(name);
			// System.out.println(age);
		}
	}

