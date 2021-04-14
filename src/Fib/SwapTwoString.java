package Fib;

public class SwapTwoString {

	public static void main(String[] args) {
		String str1 = "ABCD";
		String str2 = "EFG";
		int str1len = str1.length();

		str1 = str1 + str2;

		str2 = str1.substring(0, str1len);
		str1 = str1.substring(str1len, str1.length());
		System.out.println("Str1 " + str1 + " Str2 " + str2);
	}

}
