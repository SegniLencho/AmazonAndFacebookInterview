package Fib;

public class SecondLargestElement {
	static int secondLarget(int arr[]) {
		int firstBig = Integer.MIN_VALUE;
		int secondBig = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > firstBig) {
				secondBig = firstBig;
				firstBig = arr[i];
			}

		}
		if (secondBig == Integer.MIN_VALUE)
			return -1;
		return secondBig;
	}

	public static void main(String[] args) {
		int arr[] = { 8,3,5,1,3,6,89,100,9 };
		
			System.out.println(secondLarget(arr));
		
		}
}
