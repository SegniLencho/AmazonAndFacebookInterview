package Fib;

import java.util.HashMap;

public class FirstNonDuplicatedChar {

	static HashMap<Integer, Integer> maps = new HashMap<Integer, Integer>();

	public static char getNonDuplicateChar(String n) {
		char answer = n.charAt(0);
		if (n.length() == 1)
			return n.charAt(0);
		HashMap<Character, Integer> maps = new HashMap<>();
		for (int i = 0; i < n.length(); i++) {
			if (!maps.containsKey(n.charAt(i))) {
				maps.put(n.charAt(i), 1);

			} else {
				int totalelement = maps.get(n.charAt(i));
				maps.put(n.charAt(i), totalelement + 1);

			}

		}
		for (Character c : maps.keySet()) {
			if (maps.get(c) == 1) {
				return c;
			}

		}
		return answer;

	}

	public static void main(String[] args) {
		String input = "azavbb";
		System.out.println("Fist Non Repeated Character is " + getNonDuplicateChar(input));
	}
}
