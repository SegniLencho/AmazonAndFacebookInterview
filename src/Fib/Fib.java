package Fib;

import java.util.HashMap;

public class Fib {

	static HashMap<Integer, Integer> maps = new HashMap<Integer, Integer>();

	public static int fibonacci(int n) {
		if (n <= 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else if (!maps.containsKey(n)) {
			maps.put(n, fibonacci(n - 1) + fibonacci(n - 2));

		}
		return maps.get(n);
	}

	public static void main(String[] args) {
		System.out.println("fib of 1000 " + fibonacci(1000));
	}
}
