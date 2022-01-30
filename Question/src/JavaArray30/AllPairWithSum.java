package JavaArray30;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AllPairWithSum {

	public static void main(String arg[])

	{
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 14, 4, 5, 6, 7, -4, -6 };

		//printAllPair(arr, 10);

		printAllPairSort(arr, 12);
	}

	private static void printAllPairSort(int[] arr, int i) {

		Arrays.parallelSort(arr);

		int left = 0;
		int right = arr.length - 1;

		while (left < right) {
			if ((arr[left] + arr[right]) == i) {
				System.out.println(":" + arr[left] + ":" + arr[right]);
				left++;
				right--;
			} else if ((arr[left] + arr[right]) < i) {
				left++;
			} else {
				right--;
			}
		}

	}

	private static void printAllPair(int[] arr, int sum) {
		Set<Integer> s1 = new HashSet<>();

		for (int i = 0; i < arr.length; i++) {
			s1.add(arr[i]);
		}

		for (int i = 0; i < arr.length; i++) {
			if (s1.contains(sum - arr[i])) {
				System.out.println(":" + arr[i] + ":" + (sum - arr[i]));

			}
		}

	}

}
