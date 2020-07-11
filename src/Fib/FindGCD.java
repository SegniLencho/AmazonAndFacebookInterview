package Fib;

import java.util.*;

public class FindGCD {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 5, 6 };
		int arr2[] = { 4, 4, 6, 8, 10 };
		System.out.println(generalizedGCD(5,arr2));

	}

	// find GCD of two Numbers
	static int getGcd(int a, int b) {
		if (a == 0)
			return b;
		if (b == 0)
			return a;
		return getGcd(b, a % b);

	}

	// METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
	public static int generalizedGCD(int n, int[] arr) {

		int temp=arr[0];
		for(int i=1;i<n;i++) {
			temp=getGcd(temp,arr[i]);
			
		}
		return temp;

	}

}
