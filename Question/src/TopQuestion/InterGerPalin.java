package TopQuestion;

public class InterGerPalin {

	public static void main(String arg[]) {
		int count = 12344321;
		int out=intpali(count);
		if(out ==count)
			System.out.println("same");
	}

	private static int intpali(int count) {

		int count2 = 0;
		while (count > 0) {

			int rem = count % 10;
			count = count / 10;
			count2 = count2 * 10 + rem;

		}

		return count2;
		

	}
}
