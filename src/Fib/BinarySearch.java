package Fib;

import java.util.ArrayList;
import java.util.Arrays;

public class BinarySearch {

	public static int binarySearch(int arr[], int key) {
		int lower = 0;
		ArrayList<Integer> list = new ArrayList<>();
		list.size();
		int higher = arr.length - 1;
		while (lower <= higher) {
			int mid = lower + (higher - lower) / 2;
			if (arr[mid] < key)
				lower = mid + 1;
			else if (arr[mid] > key)
				higher = mid - 1;
			else
				return mid;
		}
		return -1;

	}

	public static int binarySearchRecursion(int arr[], int lower, int higher, int target) {

		int mid = (lower + higher) / 2;

		if (arr[mid] == target)
			return mid;

		if (arr[mid] < target)
			 return binarySearchRecursion(arr, mid + 1, higher, target);
		else if (arr[mid] > target)
			 return binarySearchRecursion(arr, lower, mid - 1, target);
		return -1;

	}

	public static int[] zeroToLeft(int arr[]) {

		int r = arr.length - 1;
		int w = 0;
		if (arr.length <= 1) {
			return arr;
		}

		while (r > 0 && r > w) {
			if (arr[r] == 0) {
				swap(arr, r, w);
				w = w + 1;
			}
			r = r - 1;
		}
		return arr;

	}

	public static void swap(int arr[], int r, int w) {
		int temp = arr[w];
		arr[w] = arr[r];
		arr[r] = temp;
	}

	public static void main(String[] args) {
		int arr[] = { 1,2,3,4,5,6,7 };
		System.out.println("find 7  " + binarySearchRecursion(arr, 0, arr.length, 6));
	}
}
