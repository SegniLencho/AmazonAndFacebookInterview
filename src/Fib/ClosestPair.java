package Fib;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ClosestPair {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		set.add(1);
		 System.out.println(set.contains(1));
		
		// NOTE: You can use the following input values to test this function.
		int[] a1 = { -1, 3, 8, 2, 9, 5 };
		int[] a2 = { 4, 1, 2, 10, 5, 20 };
		int aTarget = 24;

		System.out.println(Arrays.toString(closest(a1, a2, aTarget)));
		// closestSumPair(a1, a2, aTarget) should return {5, 20} or {3, 20}

		int[] b1 = { 7, 4, 1, 10 };
		int[] b2 = { 4, 5, 8, 7 };
		int bTarget = 13;
		// closestSumPair(b1, b2, bTarget) should return {4, 8}, {7, 7}, {7, 5}, or {10,
		// 4}
		System.out.println(Arrays.toString(closest(b1, b2, bTarget)));

		int[] c1 = { 6, 8, -1, -8, -3 };
		int[] c2 = { 4, -6, 2, 9, -3 };
		int cTarget = 3;
		// closestSumPair(c1, c2, cTarget) should return {-1, 4} or {6, -3}

		int[] d1 = { 19, 14, 6, 11, -16, 14, -16, -9, 16, 13 };
		int[] d2 = { 13, 9, -15, -2, -18, 16, 17, 2, -11, -7 };
		int dTarget = -15;
		// closestSumPair(d1, d2, dTarget) should return {-16, 2}, {-9, -7}
	}

	public static int[] closest(int arr1[], int arr2[], int target) {

		int a1Sorted[] = Arrays.copyOf(arr1, arr1.length);
		Arrays.sort(a1Sorted);
		int a2Sorted[] = Arrays.copyOf(arr2, arr2.length);
		Arrays.sort(a2Sorted);

		int i = 0;
		int j = a2Sorted.length - 1;
		int closestPair[] = { a1Sorted[0], a2Sorted[0] };
		int smallestDiff = Math.abs(a1Sorted[0] + a2Sorted[0] - target);
		
		while (i < a1Sorted.length && j >= 0) {
			int v1 = a1Sorted[i];
			int v2 = a2Sorted[j];
			int diff = v1 + v2 - target;
			if (Math.abs(diff) < smallestDiff) {
				smallestDiff = Math.abs(diff);
				closestPair[0] = a1Sorted[i];
				closestPair[1] = a2Sorted[j];

			}
			if (diff == 0) {
				return closestPair;
			} else if (diff < 0) {
				i += 1;
			} else {
				j -= 1;
			}

		}
		return closestPair;

	}
}
