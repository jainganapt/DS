package stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Remove_All_Adjacent_Duplicates_in_String_II {

	public static void main(String arg[]) {

		System.out.println(removeDuplicates("deeedbbcccbdaa", 3));
		
		System.out.println(removeDuplicates_stack("deeedbbcccbdaa", 3));

	}

	public static String removeDuplicates(String s, int k) {

		int count = 1;

		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i - 1) == s.charAt(i)) {
				count++;
			} else {
				count = 1;
			}
			if (count == k) {
				String red = s.substring(0, i - k + 1) + s.substring(i + 1);
				return removeDuplicates(red, k);
			}
		}

		return s;

	}

	public static String removeDuplicates_stack(String s, int k) {

		Stack<Map<Character, Integer>> st = new Stack<>();

		for (char c : s.toCharArray()) {
			if (!st.isEmpty() && st.peek().containsKey(c)) {
				Map<Character, Integer> temp = st.pop();
				int val = temp.get(c);
				temp.put(c, val + 1);
				st.push(temp);
			} else {
				Map<Character, Integer> temp = new HashMap<>();
				temp.put(c, 1);
				st.push(temp);
			}

			if (!st.isEmpty()) {

				if (k == st.peek().entrySet().stream().findFirst().get().getValue()) {
					st.pop();
				}
			}
		}

		StringBuilder sb = new StringBuilder();

		while (!st.isEmpty()) {

			Map<Character, Integer> temp = st.peek();
			char c = temp.entrySet().stream().findFirst().get().getKey();
			int k1 = temp.entrySet().stream().findFirst().get().getValue();
			while (k1 > 0) {
				sb.append(c);
				k1--;
			}
			st.pop();
		}

		return sb.reverse().toString();
	}
}
