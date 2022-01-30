package Recursive;

import java.util.*;

public class Ficonacci {

	public static void main(String arg[]) {
		int count = 4;
		int res = fibon(count - 1);
		printFibonacciSeries(count);
		System.out.println("res" + res);

	}

	private static int fibon(int n) {

		if (n <= 1)
			return n;
		return fibon(n - 1) + fibon(n - 2);

	}

	public static void printFibonacciSeries(int count) {
		int a = 0;
		int b = 1;
		int c = 1;

		Scanner sc = new Scanner(System.in);

		char arr[] = new char[5];

		int s1 = sc.nextInt();

		while (s1 >= 0) {
			arr[0] = sc.next().charAt(0);

			//System.out.println(c1);

			s1--;
		}

	}

}
