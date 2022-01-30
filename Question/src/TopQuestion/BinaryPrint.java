package TopQuestion;

public class BinaryPrint {

	public static void main(String arg[]) {
		printBinary(2, "");
		System.out.println("***********");
		printBinaryleadingnotZero(2, "", 2);
		
		System.out.println("***********");
		System.out.println("***********");
		printBinary(3, "");
		System.out.println("***********");
		printBinaryleadingnotZero(3, "", 3);
	}

	private static void printBinaryleadingnotZero(int count, String answer, int countf) {
		if (count == 0)
			System.out.println(answer);
		else if (count == countf) {
			printBinary(count - 1, answer + "1");
		}
		else {
			printBinary(count - 1, answer + "0");
			printBinary(count - 1, answer + "1");
			count--;
		}

	}

	private static void printBinary(int count, String answer) {

		if (count == 0)
			System.out.println(answer);
		else {
			printBinary(count - 1, answer + "0");
			printBinary(count - 1, answer + "1");
			count--;
		}

	}

}
