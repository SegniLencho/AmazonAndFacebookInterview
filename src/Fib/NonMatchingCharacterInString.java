package Fib;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NonMatchingCharacterInString {

	public static String getNonMatchingCharacterInString(String inp1, String inp2) {

		Map<Character, Integer> inp1Map = new HashMap<>();
		List<Character> charList = new ArrayList<>();
		for (int i = 0; i < inp1.length(); i++) {
			if (!inp1Map.containsKey(inp1.charAt(i))) {
				inp1Map.put(inp1.charAt(i), 1);
			}
		}
		for (int i = 0; i < inp2.length(); i++) {
			if (!inp1Map.containsKey(inp2.charAt(i))) {
				charList.add(inp2.charAt(i));
			}
		}

		return charList.toString();
	}

	public static void main(String[] args) {
		System.out.println(getNonMatchingCharacterInString("abcdgh", "abcdf"));
	}
}
