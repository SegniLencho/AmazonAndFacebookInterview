package Fib;

public class FindMissingNumberInArray1_100 {

	static int findMissingNo(int arr[]) {
		int sumofArr = 0;
		int total1_n = ((arr.length+1) * (arr.length+2 )); 
		for (int i = 0; i < arr.length; i++) {
              sumofArr= sumofArr + arr[i];
		}
		return total1_n/2 - sumofArr;

	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,10}; //11
		System.out.println(findMissingNo(arr));
	}
}
