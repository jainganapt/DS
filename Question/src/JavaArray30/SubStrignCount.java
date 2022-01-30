package JavaArray30;

public class SubStrignCount {

	public static void main(String arg[]) {
		String s1 = "JAVA";
		String s2 = "JAVA";

		substringCount(s1, s2);
	}

	private static int substringCount(String s1, String s2) {

		int count = 0;
		if (s1.length() < s2.length())
			return count;

		for (int i = 0; i < s1.length(); i++) {
			for (int j = 0; j < s2.length(); j++) {
				if (s1.charAt(i) == s2.charAt(j)) {
					while (j < s2.length() && s1.charAt(i) == s2.charAt(j)) {
						i++;
						j++;
						System.out.println("i" + i + "j" + j);
					}
				}
				if (j == s2.length())
					count++;
			}
		}
		System.out.println(count);
		return count;

	}
}
