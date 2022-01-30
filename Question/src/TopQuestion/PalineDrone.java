package TopQuestion;

public class PalineDrone {

	public static void main(String arg[]) {
		System.out.println(ipalin("abcdefgh"));
		
		System.out.println(ipalin("abcdedcba"));
	}

	private static boolean ipalin(String str) {

		if (str.isEmpty())
			return true;

		char[] s2 = str.toCharArray();

		for (int i = 0; i < str.length() / 2; i++) {
			if (s2[i] != s2[str.length() - (i + 1)]) {
				return false;
			}
		}

		return true;

	}

}
