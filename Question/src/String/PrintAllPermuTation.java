package String;

public class PrintAllPermuTation {

	public static void main(String arg[]) {
		permutation("", "ABC");
	}

	private static void permutation(String Prefix, String str) {

		int n = str.length();
		if (n == 0) {
			System.out.println(Prefix);
		} else {
			for (int i = 0; i < n; i++) {
				permutation(Prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
			}
		}

	}

}
