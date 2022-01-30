package LeetCode;

public class ReverseInt {

	public static void main(String arg[]) {

		int a = 10;
		a = reverse(123);
		System.out.println(":" + a);
		a = reverse(-123);
		System.out.println(":" + a);
		
		a = reverse(120);
		System.out.println(":" + a);
		
	}

	private static int reverse(int num) {

		int rev = 0;

		//int num = Math.abs(i);
		while (num != 0) {
			int rem = num % 10;
			num = num / 10;
			rev = rev * 10 + rem;
			reverse(num);
		}

		return rev;
	}
}
