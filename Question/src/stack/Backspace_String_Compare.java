package stack;

import java.util.Stack;

public class Backspace_String_Compare {

	public static void main(String arg[]) {

		// backspaceCompare("y#fo##f", "y#f#o##f");
		System.out.println(backspaceCompare_withoutspace("a##c", "#a#c"));
	}

	public static boolean backspaceCompare(String s, String t) {

		Character[] s1 = new Character[s.length()];
		Character[] t1 = new Character[t.length()];

		int j = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '#' && i != 0 && j > 0) {
				j--;
			} else if (s.charAt(i) != '#') {
				s1[j] = s.charAt(i);
				j++;
			}
			// System.out.println("j->" + j);
		}

		int k = 0;
		for (int i = 0; i < t.length(); i++) {

			if (t.charAt(i) == '#' && i != 0 && k > 0) {
				k--;
			} else if (t.charAt(i) != '#') {
				t1[k] = t.charAt(i);
				k++;
			}
			// System.out.println("k->" + k);
		}

		// System.out.println("j->" + j + " k->" + k);
		// System.out.println();

		int i = 0;
		if (j == k) {

			while (i < j && i < k && s1[i] == t1[i]) {
				i++;
			}
		} else {
			return false;
		}

		return i == j ? true : false;

	}

	public static boolean backspaceCompare_stack(String s, String t) {

		Stack<Character> s1 = new Stack<Character>();
		Stack<Character> t1 = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {
			if (!s1.isEmpty() && s.charAt(i) == '#') {
				s1.pop();
			} else if (s.charAt(i) != '#') {
				s1.add(s.charAt(i));
			}
			// System.out.println("j->" + j);
		}

		for (int i = 0; i < t.length(); i++) {

			if (t.charAt(i) == '#' && !t1.isEmpty()) {
				t1.pop();
			} else if (t.charAt(i) != '#') {
				t1.add(t.charAt(i));
			}
			// System.out.println("k->" + k);
		}

		if (s1.size() == t1.size()) {

			while (!s1.isEmpty() && s1.peek() == t1.peek()) {
				s1.pop();
				t1.pop();
			}

		} else {
			return false;
		}

		return s1.isEmpty() && t1.isEmpty() == true ? true : false;

	}

	public static boolean backspaceCompare_withoutspace(String s, String t) {

		int i = s.length() - 1, j = t.length() - 1;

		while (i >= 0 || j >= 0) {

			System.out.println("i-> " + i + " j-> " + j);
			if (i >= 0 && s.charAt(i) == '#') {
				int t1 = i;
				int count = 0;
				while (t1 >= 0 && s.charAt(t1) == '#') {
					count++;
					t1--;
				}
				i = i - (2 * count);
				System.out.println("i-> " + i);
			} else if (j >= 0 && t.charAt(j) == '#') {
				int t2 = j;
				int count = 0;
				while (t2 >= 0 && t.charAt(t2) == '#') {
					count++;
					t2--;
				}
				j = j - (2 * count);
				System.out.println("j-> " + j);

			} else {

				if (i >= 0 && j >= 0 && s.charAt(i) != t.charAt(j)) {
					return false;
				}
				i--;
				j--;
				
				System.out.println("output matched");
				
			}

		}

		if (i == j) {
			return true;
		} else {
			return false;
		}

	}
}
