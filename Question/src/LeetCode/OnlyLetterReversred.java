package LeetCode;

import java.util.Stack;

public class OnlyLetterReversred {

	public static void main(String arg[]) {
		System.out.println(stringrev("av-s32cs@ds!das"));

	}

	private static StringBuilder stringrev(String s1) {

		Stack<Character> s = new Stack<Character>();

		for (int i = 0; i < s1.length(); i++) {
			if (Character.isLetter(s1.charAt(i))) {
				s.push(s1.charAt(i));
			}
		}

		StringBuilder s2 = new StringBuilder();

		for (int i = 0; i < s1.length(); i++) {
			if (Character.isLetter(s1.charAt(i))) {
				s2.append(s.pop());
			} else {
				s2.append(s1.charAt(i));
			}
		}

		return s2;
	}
}
