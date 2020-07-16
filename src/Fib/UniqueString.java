package Fib;

import java.util.HashSet;
import java.util.Set;

public class UniqueString {

	public static boolean isUniqueString(String str) {
		Set<Character> charSets = new HashSet<Character>();

		for (int i = 0; i < str.length(); i++) {
			if (charSets.contains(str.charAt(i))) {
				return false;
			} else {
				charSets.add(str.charAt(i));
			}
		}
		return true;

	}

	public static boolean checkIfAllUniqueNoDataStructure(String str) {
		int i = 0;
		int j = str.length() - 1;
		while (j > i) {
			if (str.charAt(i) == str.charAt(j)) {
				return false;
			} else {

				j -= 1;
			}

		}

		return true;

	}

	public static void main(String[] args) {
		System.out.println("Is this String All unique " + checkIfAllUniqueNoDataStructure("abcdfc"));
	}
}
