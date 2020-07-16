package Fib;

import java.util.Arrays;
import java.util.HashMap;

public class AddOneToArray {

	static HashMap<Integer, Integer> maps = new HashMap<Integer, Integer>();

	public static int[] plusOneToArray(int[] arr) {
		int result[] = new int[arr.length];
		int carry = 1;
		for (int j = arr.length - 1; j >= 0; j--) {
			int total = arr[j] + carry;
			if (total == 10) {
				carry = 1;
			} else {
				carry = 0;
				result[j] = total % 10;
			}
			if (carry == 1 && j == 0) {
				result = new int[arr.length + 1];
				result[0] = 1;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int myArray[] = { 1, 3, 5 };
		int myArray2[] = { 1, 5, 9 };
		int myArray3[] = { 9, 9, 9 };

		System.out.println(" " + Arrays.toString(plusOneToArray(myArray)));
		System.out.println(" " + Arrays.toString(plusOneToArray(myArray2)));
		System.out.println(" " + Arrays.toString(plusOneToArray(myArray3)));

	}
}
