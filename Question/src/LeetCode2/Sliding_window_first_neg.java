package LeetCode2;

import java.util.ArrayList;
import java.util.List;

public class Sliding_window_first_neg {

	public static void main(String arg[]) {

		int k = 3;
		int arr[] = { 1, 3, 10, -3, 5, 3, 6, 7 };

		int arr3[] = { 1, 3, -1, -3, 5, 3, 6, 7 };

		int[] arr2 = firstNegSlidingWindow(arr3, k);

		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}

	}

	private static int[] firstNegSlidingWindow(int[] arr, int k) {

		List<Integer> data = new ArrayList<>();
		int arr2[] = new int[arr.length - k + 1];

		int i = 0;
		int j = 0;
		int k1 = 0;

		while (j < arr.length) {

			if (arr[j] < 0) {
				data.add(arr[j]);
			}

			if ((j - i + 1) < k) {
				j++;
			} else if ((j - i + 1) == k) {

				if (data.size() > 0) {
					arr2[k1] = data.get(0);
					k1++;
					if (arr[i] == data.get(0)) {
						data.remove(0);
					}
				} else {
					arr2[k1] = 0;
					k1++;
				}

				i++;
				j++;
			}

		}

		return arr2;
	}
}
