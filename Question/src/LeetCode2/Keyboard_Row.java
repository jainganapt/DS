package LeetCode2;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Keyboard_Row {
	public static void main(String arg[]) {

		String[] words = { "Hello", "Alaska", "Dad", "Peace" };

		String[] data = findWords(words);
		for(int i=0;i<data.length;i++)
		{
			System.out.println(":"+data[i]);
		}

	}

	public static String[] findWords(String[] words) {

		Map<Character, Integer> ct = new HashMap<>();

		List<String> data = new ArrayList<String>();

		String first = "qwertyuiop";

		for (int i = 0; i < first.length(); i++) {
			ct.put(first.charAt(i), 0);
		}
		String second = "asdfghjkl";
		for (int i = 0; i < second.length(); i++) {
			ct.put(second.charAt(i), 1);
		}
		String third = "zxcvbnm";
		for (int i = 0; i < third.length(); i++) {
			ct.put(third.charAt(i), 2);
		}

		for (int i = 0; i < words.length; i++) {

			String s1 = words[i];
			int j = 0;
			int find = ct.get(Character.toLowerCase(s1.charAt(0)));
			for (j = 1; j < s1.length(); j++) {
				if (find != ct.get(Character.toLowerCase(s1.charAt(j)))) {
					break;
				}
			}
			if (j == s1.length()) {
				data.add(s1);
			}

		}

		return data.stream().toArray(String[]::new);
	}
}
