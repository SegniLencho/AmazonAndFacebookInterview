package Fib;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedChar {
	static char firstNonRepeatedCharacter(String str) {
		Map<Character, Integer> maps = new HashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {
			if (!maps.containsKey(str.charAt(i))) {
				maps.put(str.charAt(i), 1);
			} else {
				maps.put(str.charAt(i), (maps.get(str.charAt(i))) + 1);
			}
		}
		for (int i = 0; i < str.length(); i++) {

			if (maps.get(str.charAt(i)) == 1) {
				return str.charAt(i);
			}

		}

		return ' ';

	}

	public static void main(String[] args) {

		System.out.println("Non Repeated Character->" + firstNonRepeatedCharacter("ABCDEFGHIJKLMNOPQRSTABCDEFGHIJKLMNPQRST"));
	}

}
