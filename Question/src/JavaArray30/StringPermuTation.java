package JavaArray30;

public class StringPermuTation {
	public static void main(String arg[]) {
		stringPermu("", "ABC");
	}

	private static void stringPermu(String prefix, String string2) {

		int n = string2.length();

		if (n == 0) {
			System.out.println(prefix);
		} else {
			for (int i = 0; i < string2.length(); i++) {
				stringPermu(string2.charAt(i) + prefix,
						string2.substring(0, i) + string2.substring(i + 1, string2.length()));
			}

		}

	}
}
