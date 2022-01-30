package JavaArray30;

import java.util.Stack;

public class IsBalncedBracket {

	public static void main(String arg[]) {
		System.out.println(isbalbrack("(((()))){{{}}}[[[]]]"));
	}

	private static boolean isbalbrack(String s) {

		Stack<Character> s1 = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {
			System.out.println(":"+s.charAt(i));
			switch (s.charAt(i)) {
			case '(':
			case '{':
			case '[':
				s1.push(s.charAt(i));
				break;

			case ')':
				if (s1.isEmpty() || s1.pop() != '(')
					return false;
				break;
			case '}':
				if (s1.isEmpty() || s1.pop() != '{')
					return false;
				break;
			case ']':
				if (s1.isEmpty() || s1.pop() != '[')
					return false;
				break;

			}
		}

		return true;
	}

}
