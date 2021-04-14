package Fib;

public class FindKthLargestNumber {
	public static int find3rdLargestNo(int arr[]) {
		if (arr.length < 3)
			return -1;
		int fL = -Integer.MAX_VALUE;
		int sL = -Integer.MAX_VALUE;
		int tL = -Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > fL) {
				tL = sL;
				sL = fL;
				fL = arr[i];
			} else if (arr[i] > sL) {
				tL = sL;
				sL = arr[i];

			}
			

		}
		return tL;

	}

	public static void main(String[] args) {
		int givenArray[] = { 1, 2, 3, 4 };
		int secondTest[] = { 0, 0, 0, 0 };
		int thirdTest[] = { 4,5,2,6,1,-5,0 };
		System.out.println(find3rdLargestNo(givenArray));
		System.out.println(find3rdLargestNo(secondTest));
		System.out.println(find3rdLargestNo(thirdTest));


	}
}
