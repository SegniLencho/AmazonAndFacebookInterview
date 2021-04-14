package Fib;

import java.util.Arrays;

public class MoveZeroToLeft {
	static int[] moveZeroToLeft(int arr[]) {
	
	
		int writeIndex = 0;
		for (int readIndex = arr.length - 1; readIndex > writeIndex; readIndex--) {
			while(arr[writeIndex] ==0 && writeIndex < readIndex)
				writeIndex++;	
		
		if(arr[readIndex] == 0) 
		{
			int temp=arr[writeIndex];
			arr[writeIndex]=0;
			arr[readIndex]=temp;
			
		}

	}
		return arr;

}
	public static void main(String[] args) {
		int arr[] = { 0, 1, 2, 0, 5, 6, 6, 6,0, 2,0, 7 };
		System.out.println(Arrays.toString(moveZeroToLeft(arr)));
	}
}
