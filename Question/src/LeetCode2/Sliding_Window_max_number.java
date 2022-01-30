package LeetCode2;


import java.util.ArrayList;
import java.util.List;

public class Sliding_Window_max_number {

	public static void main(String arg[]) {
		int arr[] = { 1, 3, 1, 2, 0, 5 };
		int arr2[] = maxSlidingWindow(arr, 3);

		for (int i = 0; i < arr2.length; i++) {

			System.out.println(" " + arr2[i]);
		}

	}

	public static int[] maxSlidingWindow(int[] nums, int k) {

		int i = 0, j = 0;

		int arr2[] = new int[nums.length - k + 1];

		List<Integer> data = new ArrayList<Integer>();

		int k1 = 0;

		while (j < nums.length) {

			while (data.size() > 0 && data.get(data.size()-1) < nums[j]) {
				data.remove(data.size()-1);
			}
			data.add(nums[j]);
			
			System.out.println("data"+data);

			if (j - i + 1 < k) {
				j++;
			} else if ((j - i + 1) == k) {

				arr2[k1] = data.get(0);

				System.out.println("nums[i]"+nums[i]);

				if (nums[i] == data.get(0)) {
					data.remove(0);
				}
				i++;
				j++;
				k1++;
			}

			System.out.println("data2 " + data);
		}

		return arr2;
	}
}