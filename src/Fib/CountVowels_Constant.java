package Fib;

import java.util.ArrayList;
import java.util.List;

public class CountVowels_Constant {

	public static List<Character> countNumeric(String input) {

		List<Character> numbers = new ArrayList<>();
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) >= 48 && input.charAt(i) <= 57)
				numbers.add( input.charAt(i));

		}
		return numbers;

	}
	public static void main(String[] args) {
		System.out.println("Number of Numeric " + countNumeric("segnilenchoBorn1991december5andBontuBorn06-20-19995"));
	}
}
