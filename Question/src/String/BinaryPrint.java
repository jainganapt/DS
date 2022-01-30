package String;

public class BinaryPrint {

	public static void main(String arg[]) {
		prinBin(3, "", 3);

		System.out.println("pring all binary combination");
		prinAllBin(3, "");
	}

	private static void prinBin(int n, String answer, int count) {

		if (n == 0) {
			System.out.println(answer);
		} else if (n == count) {
			prinBin(n - 1, answer + "1", count);
			n--;
		} else {
			prinBin(n - 1, answer + "0", count);
			prinBin(n - 1, answer + "1", count);
			n--;
		}

	}

	private static void prinAllBin(int n, String answer) {

		if (n == 0) {
			System.out.println(answer);
		} else {
			prinAllBin(n - 1, answer + "0");
			prinAllBin(n - 1, answer + "1");
			n--;
		}

	}

}
