package Fib;

public class RemoveSpecialCharacterAndLowerCase {
	
	static String removeSpecialCharacterAndLowerCase(String str) {
		String result="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>=65 && str.charAt(i)<= 90)
				result+=str.charAt(i);
			}
		return result;
	}
	
	
	public static void main(String[] args) {
		
		
			System.out.println(removeSpecialCharacterAndLowerCase("ABcdEfG&**HijklMNOP "));
		
		}

}
