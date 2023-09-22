package com.neotech.lesson24;

public class OverloadingMainMethod {
	// can we overload the main method? YES
	public static void main(int[] args) {
		System.out.println("Main method with int array parameter");
	}

	private static void main(String arg1, String arg2) {
		System.out.println("Main method with two string parameters");
	}

	public static void main(int arg1, int arg2) {
		System.out.println("Main method with two integer parameters");
	}

	public static void main(String[] args) {
		// java looks for a main method with this signature
		System.out.println("Maing method with string array parameter");
		OverloadingMainMethod.main(10, 50);

		// do i need the class name to call the methods? NO
		main("Hi", "Bye");

		int[] intArray = { 1, 3, 4, 5 };
		main(intArray);

	}


}
