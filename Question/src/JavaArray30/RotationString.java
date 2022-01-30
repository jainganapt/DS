package JavaArray30;

public class RotationString {

	public static void main(String arg[]) {
		System.out.println(rotationString("abcd", "cdab"));
		
		System.out.println(rotationString("mypencil", "encilmyp"));
		System.out.println(rotationString("mypencil", "encilpym"));
	}

	private static boolean rotationString(String s1, String s2) {

		if (s1.length() != s2.length())
			return false;

		String s3 = s1 + s1;

		if (s3.contains(s2)) {
			return true;
		} else {
			return false;
		}

	}
}
