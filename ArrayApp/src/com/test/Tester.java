package com.test;

public class Tester {

	public static void main(String[] args) {

		int arr2[] = { 2, 3, 232, 4, 5 };/////////// Declar

		System.out.println("Size of Array " + arr2.length);
		System.out.println("Value arr2[0] = " + arr2[0]);// First element
		System.out.println("Value arr2[4] = " + arr2[arr2.length - 1]);// Last
																		// element
		int x = (int) (Math.random() * 10);
		if (x < arr2.length && x >= 0) {
			System.out.println("Random element = " + arr2[x]);
		} else {
			System.out.println("X is Out Of Bounds : " + x);
		}

		arr2[1] = (int) (Math.random() * 10);///// Перезапись
		//arr2[5] = 333;
		int arr3[] = new int[arr2.length + 1];
		//Copy
		arr3[0] = arr2[0];
		arr3[1] = arr2[1];
		arr3[2] = arr2[2];
		arr3[3] = arr2[3];
		arr3[4] = arr2[4];
		arr3[5] = 333;  //NEW VAL
		System.out.println("Size of Array " + arr3.length);
		System.out.println("Value arr2[0] = " + arr3[0]);// First element
		System.out.println("Value arr2[4] = " + arr3[arr3.length - 1]);
		
		///////////////////////////////////////////////
		
		//Utils.printArray(arr2, false);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
