package JavaArray30;

import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String arg[]) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 14, 4, 5, 6, 7, -4, -6 };

		int in = removedupli(arr);

		for (int i = 0; i < in; i++) {
			System.out.println(":" + arr[i]);
		}

	}

	private static int removedupli(int[] arr) {

		Arrays.parallelSort(arr);
		int index = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[index] != arr[i + 1]) {
				index++;
				arr[index] = arr[i + 1];
				
			}
		}

		return index;

	}
}
