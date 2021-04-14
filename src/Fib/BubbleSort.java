package Fib;

import java.util.Arrays;

public class BubbleSort {

	static int[] bubbleSort(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (arr[j-1] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[j -1];
					arr[j-1] = temp;
				}
			}
		}
		return arr;

	}

	
	public static void main(String[] args) {
		int arr[] = { 1, 1, 2, 4, 5, 6, 6, 6, 7, 2, 7 };
		System.out.println(Arrays.toString(bubbleSort(arr)));
	}
}
