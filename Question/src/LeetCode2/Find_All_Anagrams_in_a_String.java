package LeetCode2;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Find_All_Anagrams_in_a_String {

	public static void main(String arg[]) {

		String s = "cbaebabacd";
		String p = "abc";

		List<Integer> data = findAnagrams_2(s, p);

		System.out.println(data);
	}

	public static List<Integer> findAnagrams_2(String s, String p) {

		List<Integer> idx_location = new ArrayList<>();

		if (s.length() < p.length()) {
			return idx_location;
		}

		int[] arr = new int[26];
		int[] arr2 = new int[26];

		for (int i = 0; i < p.length(); i++) {
			arr[p.charAt(i) - 'a']++;
		}
		for (int i = 0; i < s.length(); i++) {
			arr2[s.charAt(i) - 'a']++;
		}

		for (int i = 0; i < s.length() - p.length() + 1; i++) {
			arr2[s.charAt(i - 1) - 'a']--;
			arr2[s.charAt(i + p.length() - 1) - 'a']++;
			if (arr == arr2) {
				idx_location.add(i);
			}
		}

		return idx_location;
	}

	public static List<Integer> findAnagrams(String s, String p) {

		List<Integer> idx_location = new ArrayList<>();

		if (s.length() < p.length()) {
			return idx_location;
		}

		int i = 0;
		int j = 0;
		int count_dist_char = 0;

		Map<Character, Integer> count_char = new HashMap<>();

		for (i = 0; i < p.length(); i++) {
			if (count_char.get(p.charAt(i)) == null) {
				count_dist_char++;
				count_char.put(p.charAt(i), 1);
			} else {
				count_char.put(p.charAt(i), count_char.get(p.charAt(i)) + 1);
			}
		}
		// System.out.println(count_char);
		i = 0;
		while (j < s.length()) {

			// System.out.println("count_dist_char---------------->" + count_dist_char);
			if (count_char.get(s.charAt(j)) != null && count_char.get(s.charAt(j)) == 1) {
				count_dist_char--;
			}
			if (count_char.get(s.charAt(j)) != null) {
				count_char.put(s.charAt(j), count_char.get(s.charAt(j)) - 1);
			}

			// System.out.println("count_dist_char " + count_dist_char);
			// System.out.println("j:"+j+"i:"+"p:"+p.length());
			if (((j - i) + 1) < p.length()) {
				j++;
			} else {
				// System.out.println("j:" + j + "i:" + i + "p:" + p.length());
				// System.out.println("count_dist_char here---->" + count_dist_char);
				if (count_dist_char == 0) {
					// System.out.println("------------------------------Match----------------------------------->"
					// + i + " j" + j);
					idx_location.add(i);

					// System.out.println(count_char);
				}

				if ((count_char.get(s.charAt(i)) != null) && (count_char.get(s.charAt(i)) == 0)) {
					count_dist_char++;
					// System.out.println(count_char);
				}
				if ((count_char.get(s.charAt(i)) != null)) {
					count_char.put(s.charAt(i), count_char.get(s.charAt(i)) + 1);
				}
				i++;
				j++;
			}

		}
		return idx_location;
	}

}
