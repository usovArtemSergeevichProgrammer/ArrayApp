package com.test;

//import java.util.Arrays;

public class Client {

	public static void main(String[] args) {

		// int arr[] = { 11, 22, 33, 44, 55, 66 };
		// Utils.printArray(arr, true);
		// Utils.printArray(arr, false);
		// int arr[] = Utils.generateAndPopulateArray(10, 20);
		// Utils.printArray(arr, true);
		// System.out.println("Max is = " + Utils.FindMax(arr));
		// {40, -50, -9, 22, -2, -40, 20, 29, 27, 35};
		
//		PerformanceAnalyzer.start("ARRAYS JOB");
//		for (int i = 0; i < 100000; i++) {
//			Utils.generateAndPopulateArray(1000, 5000);
//		}
//		int[] array = Utils.generateAndPopulateArray(100, 5000);
//		int[] array2 = Arrays.copyOf(array, array.length);
//		int[] array3 = Arrays.copyOf(array, array.length);
//		
//		Utils.printArray(array, true);
//		Utils2.selectingSort(array);
//		Utils.printArray(array, true);
//	
//		Utils.printArray(array2, true);
//		Utils2.bubbleSorting(array2);
//		Utils.printArray(array2, true);
//		
//		Arrays.sort(array3);
//		Utils.printArray(array3, true);
//		PerformanceAnalyzer.end();
//		PerformanceAnalyzer.start("ARRAYS JOB");
//		String s = Utils3.generateStr(500);
//		System.out.println(s);
//		double d = Utils3.parseStr(s);
//		//d++;
//		System.out.println(d + "");
//		PerformanceAnalyzer.end();
//		String s2 = "ffkfkfcat213542jfjdkcat3945r8cat";
		PerformanceAnalyzer.start("ARRAYS JOB");
		String s = Utils3.generateStr(500);
		Utils3.searchSubStrings(s, "a");
		int time = Utils3.searchSubStrings(s, "a");
		System.out.println(time);
		PerformanceAnalyzer.end();
	}

}
