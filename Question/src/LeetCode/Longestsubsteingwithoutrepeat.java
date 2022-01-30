package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class Longestsubsteingwithoutrepeat {

	public static void main(String arg[]) {
		int l = lengthoflogsubstring("abcdefghh");
		System.out.println("l=>" + l);

	}

	private static int lengthoflogsubstring(String s) {

		Set<Character> s1 = new HashSet<Character>();
		int i = 0, j = 0;
		int maxlen = 0;
		int len = 0;
		String s2 = null;
		while (j < s.length()) {
			if (!s1.contains(s.charAt(j))) {
				s1.add(s.charAt(j));
				j++;
				maxlen = Math.max(maxlen, (j - i));
				if (len != maxlen) {
					s2 = s.substring(i, j);
					len = maxlen;
				}

			} else {
				// System.out.println("i"+i+"j"+j);
				s1.remove(s.charAt(i));
				i++;
				System.out.println("remove" + i + "j" + j);
			}
		}
		System.out.println("i" + i + "j" + j);
		System.out.println("hello=>"+s2);
		return maxlen;
	}

}
