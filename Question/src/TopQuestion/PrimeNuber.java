package TopQuestion;

public class PrimeNuber {

	public static void main(String arg[]) {
		int num = 11;
		System.out.println(prime(num));
	}

	private static boolean prime(int num) {

		boolean ispalin = true;

		if (num == 1)
			return false;
		else if (num == 2)
			return true;
		else {
			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0)
					return false;
			}
		}

		return ispalin;

	}

}
