package com.test;

public class Utils2 {
	public static void selectingSort(int arr[]) {
		int outerCounter = 0;
		int innerCounter = 0;
		System.out.println("Selection Sorting in BEGIN");
		System.out.println("outerCounter" + outerCounter);
		System.out.println("innerCounter" + innerCounter);
		for (int index = 0; index < arr.length; index++) {
			outerCounter++;
			// 1-minimum
			int min_val = arr[index];
			int min_index = index;
			// 2 - ����������� ��� ��������� � ������. ������
			for (int next_index = index + 1; next_index < arr.length; next_index++) {
				innerCounter++;
				// 3 -
				if (arr[next_index] < min_val) {
					min_index = next_index;
					min_val = arr[next_index];
				}
			}
			// 4 SWAP (������)
			if (index != min_index) {
				int temp = arr[index];
				arr[index] = arr[min_index];
				arr[min_index] = temp;
			}
		}
		System.out.println("Selection Sorting in FINISHED");
		System.out.println("outerCounter" + outerCounter);
		System.out.println("innerCounter" + innerCounter);
	}


	public static void bubbleSorting(int arr[]) {
		// 1 - ������� ���� ��� ���������� ������� (auter).������� ���.����.
		// ��������
		int outerCounter = 0;
		int innerCounter = 0;
		System.out.println("Bubble Sorting in BEGIN");
		System.out.println("outerCounter" + outerCounter);
		System.out.println("outerCounter" + outerCounter);
		System.out.println("innerCounter" + innerCounter);
		for (int i = arr.length - 1; i > 0; i--) {
			outerCounter++;
			// 2 - ������� ��������� ������
			for (int j = 0; j < i; j++) {
				innerCounter++;
				// 3 - ��������� ���,���� ������ ������ ������� ������� SWAP
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("Bubble Sorting in FINISHED");
		System.out.println("outerCounter" + outerCounter);
		System.out.println("innerCounter" + innerCounter);

	}

}
