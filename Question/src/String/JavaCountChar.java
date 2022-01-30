package String;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class JavaCountChar {

	public static void main(String arg[]) {
		String str = "JAVAJAIN";

		System.out.println(countmaxOCC(str));

	}

	private static int countmaxOCC(String str) {

		Map<Character, Integer> m1 = new HashMap<>();

		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (m1.get(str.charAt(i)) != null) {
				m1.put(str.charAt(i), m1.get(str.charAt(1)) + 1);
			} else {
				m1.put(str.charAt(i), 1);
			}
		}

		for (Entry<Character, Integer> a : m1.entrySet()) {

			if (a.getValue() > count)
				count = a.getValue();
			System.out.println("=>" + a.getKey() + "=>" + a.getValue());
		}

		return count;

	}

}
