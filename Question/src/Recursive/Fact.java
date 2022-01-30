package Recursive;

public class Fact {

	public static void main(String arg[]) {
		int res = fact(3);

		System.out.println(res);

	}

	private static int fact(int n) {

		if (n == 1)
			return 1;
		else if (n == 0)
			return 0;
		else
			return fact(n - 1) * n;

	}

}
