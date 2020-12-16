package Palindrome;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		System.out.println(checkIfPalindrome("tTssptt"));
	}

	private static boolean checkIfPalindrome(String string) {
		LinkedList<Character> stack = new LinkedList<Character>();
		String s = string.toLowerCase();
		StringBuilder newStr = new StringBuilder();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='a' && s.charAt(i)<='z') {
				stack.push(s.charAt(i));
				newStr.append(s.charAt(i));
				}
		}
		StringBuilder newStrTwo = new StringBuilder();
		while(!stack.isEmpty()) {
			newStrTwo.append(stack.pop());
		}
		return newStr.toString().equals(newStrTwo.toString());
	}

}
