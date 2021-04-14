package Fib;

import java.util.*;

public class RemoveDuplicateIntArray {
	
	static int [] smallestAndLargest(int arr[]) {
		int smallest=Integer.MAX_VALUE;
		int biggest=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > biggest)
				biggest=arr[i];
			else if(arr[i]<smallest)
				smallest=arr[i];
			
		}
		return new int[]{smallest,biggest};
		
	}
	static Integer[] getNonDuplicate(int arr[]) {

		Set<Integer> myset = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++)
			myset.add(arr[i]);
		Integer[] result = null;
		result = myset.stream().toArray(Integer[]::new);

		return result;

	}
	public static void main(String[] args) {
		int arr[]= {1,1,2,4,5,6,6,6,7,2,7};
		System.out.println(Arrays.toString(getNonDuplicate(arr)));
		System.out.println(Arrays.toString(smallestAndLargest(arr)));
	}

}
