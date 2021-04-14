package Fib;


public class InsertionSort {

	static int[] insertionSort(int arr[]) {

		 for (int i = 1; i < arr.length; ++i) {
	            int key = arr[i];
	            int j = i - 1;
	 
	            /* Move elements of arr[0..i-1], that are
	               greater than key, to one position ahead
	               of their current position */
	            while (j >= 0 && arr[j] > key) {
	                arr[j + 1] = arr[j];
	                j = j - 1;
	            }
	            arr[j + 1] = key;
	        }
	    
		return arr;
	}

	public static void main(String[] args) {
		int arr[] = { 8,3,5,1,3,6,89,100,9 };
		System.out.println(insertionSort(arr));
		int arr2[]= insertionSort(arr);
		for(int i=0;i<arr2.length;i++ ) {
			System.out.println(arr2[i]);
		}
	}
}
