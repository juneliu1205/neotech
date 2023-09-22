package com.neotech.review03;

public class ArrayIntro {

	public static void main(String[] args) {

		// funny way
		int a = 4;
		int b = 2;
		int c = 3;
		int d = 5;

		int sum = a + b + c + d;
		System.out.println("The sum is " + sum);

		// 1st serious way

		int[] arr = new int[4];
		arr[2] =3;
		arr[1] =2;
		arr[0] =4;
		arr[3] =5;
		
		int sumArr=0; 
		for (int i=0; i<arr.length; i++) {
			sumArr+= arr[i];
		}
		System.out.println("The sum of the array is " + sumArr);
		
		
		
		//1nd serious way
		int[] arr2 = {4, 2, 3, 5};
		int sumArr2 = 0;
		
		//for (element:array) {}
		//Get the elements from the array one by one, from the first to the last
		for (int num : arr2) {
		sumArr2+=num;
		}
		System.out.println("The sum of the array is " + sumArr2);
		
		
		
		
		
		
		
		
		
	}

}
