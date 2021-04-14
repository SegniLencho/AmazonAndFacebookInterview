package Fib;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ReverseArray {

	static List<Integer> reverseArray(int arr[]) {
		List<Integer> mylist = new ArrayList<>();
		Stack<Integer> mystack = new Stack<Integer>();
		for (int i = 0; i < arr.length; i++) {
			mystack.push(arr[i]);
		}
		while(!mystack.isEmpty())
			mylist.add(mystack.pop());

		return mylist;
	}
	public static void main(String[] args) {
		int arr[] = { 8,3,5,1,3,6,89,100,9 };
		
			System.out.println(reverseArray(arr));
		
		}
}
