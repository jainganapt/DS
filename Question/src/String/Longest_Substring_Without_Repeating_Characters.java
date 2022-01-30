package String;

import java.util.HashMap;
import java.util.Map;

public class Longest_Substring_Without_Repeating_Characters {

	public static void main(String[] arg) {
		String s = "dvdf";
		System.out.println(" ->" + lengthOfLongestSubstring(s));

	}

	public static int lengthOfLongestSubstring(String s) {

		Map<Character, Integer> mp = new HashMap<>();
		int count = 0;
		int max_count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (mp.get(s.charAt(i)) == null) {
				mp.put(s.charAt(i), 1);
				count++;

				// System.out.println(" count" + count + " max_count" + max_count);
			} else {

				// System.out.println(" count" + count + " max_count " + max_count);
				mp.clear();
				if (count > max_count) {
					max_count = count;
				}
				count = 1;
				mp.put(s.charAt(i), 1);
				// System.out.println(" count->" + count + " max_count ->" + max_count);

			}
		}

		if (count > max_count) {
			max_count = count;
		}
		return max_count;
	}
}
