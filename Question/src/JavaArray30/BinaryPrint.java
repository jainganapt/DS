package JavaArray30;

public class BinaryPrint {

	public static void main(String arg[]) {
		binaryPrint("", 2, 2);
	}

	private static void binaryPrint(String string, int count, int len) {

		if (count == 0) {
			System.out.println(string);
		} else if (count == len) {
			binaryPrint(string + "1", count - 1, len);
			count--;

		}

		else {
			binaryPrint(string + "0", count - 1, len);
			binaryPrint(string + "1", count - 1, len);
			count--;

		}

	}
}
