package TopQuestion;

public class Permu {

	public static void main(String arg[]) {
		permu("", "ABC");
	}

	private static void permu(String prefix, String string2) {
		int n = string2.length();
		if (n == 0) {
			System.out.println(prefix);
		} else {
			for (int i = 0; i < n; i++) {
				permu(prefix + string2.charAt(i), string2.substring(0, i) + string2.substring(i + 1, n));
			}
		}

	}
}
