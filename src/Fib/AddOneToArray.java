package Fib;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class AddOneToArray {

	static HashMap<Integer, Integer> maps = new HashMap<Integer, Integer>();

	public static char firstRecurringCharacter(String str) {
		
		Set<Character> sets=new HashSet<Character>();
		for(int i=0;i<str.length();i++) {
			if(sets.contains(str.charAt(i)))
				return str.charAt(i);
			else
				sets.add(str.charAt(i));
		}
		
		return 0;
	}

	public static void main(String[] args) {
		String input="segnilencho";
		String oneInput="a";
		String justOnce="aa";
		System.out.println(" " + firstRecurringCharacter(input));
		System.out.println(" " + firstRecurringCharacter(oneInput));
		System.out.println(" " + firstRecurringCharacter(justOnce));
		

	}
}
