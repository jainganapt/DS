package LeetCode2;

import java.util.HashMap;
import java.util.Map;

public class longest_K_unique_characters_substring {

	public static void main(String arg[]) {

		String s = "pwwkew";
		int k = 3;

		System.out.println(longest_k_Substr(s, k));
		
		System.out.println(longestSubstr(s));

	}
	
	public static int longestSubstr(String s) {

		Map<Character, Integer> count_char = new HashMap<>();

		int j = 0;
		int i = 0;
		int max_count = 0;

		while (j < s.length()) {

			if (count_char.get(s.charAt(j)) == null) {
				count_char.put(s.charAt(j), 1);
			} else {
				count_char.put(s.charAt(j), count_char.get(s.charAt(j)) + 1);
			}

			 if (count_char.size() == (j - i + 1)) {
				max_count = Math.max(max_count, j - i + 1);
				System.out.println("max_count " + max_count);
				j++;

			} else {

				while (count_char.size() < (j - i + 1)) {

					int val = count_char.get(s.charAt(i));
					if (val == 1) {
						count_char.remove(s.charAt(i));
					} else {
						count_char.put(s.charAt(i), val - 1);
					}

					i++;
				}
				j++;
			}

		}

		return max_count;
	}
	public static int longest_k_Substr(String s, int k) {

		Map<Character, Integer> count_char = new HashMap<>();

		int j = 0;
		int i = 0;
		int max_count = 0;

		while (j < s.length()) {

			if (count_char.get(s.charAt(j)) == null) {
				count_char.put(s.charAt(j), 1);
			} else {
				count_char.put(s.charAt(j), count_char.get(s.charAt(j)) + 1);
			}

			if (count_char.size() < k ) {
				j++;
			} else if (count_char.size() == k) {
				max_count = Math.max(max_count, j - i + 1);
				System.out.println("max_count " + max_count);
				j++;

			} else {

				while (count_char.size() > k) {

					int val = count_char.get(s.charAt(i));
					if (val == 1) {
						count_char.remove(s.charAt(i));
					} else {
						count_char.put(s.charAt(i), val - 1);
					}

					i++;
				}
				j++;
			}

		}

		return max_count;
	}

}
