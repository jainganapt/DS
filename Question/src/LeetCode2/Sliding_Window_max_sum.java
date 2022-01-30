 package LeetCode2;

public class Sliding_Window_max_sum {

	public static void main(String arg[]) {
		int arr[] = { 1, 3, -1, -3, 5, 3, 6, 7 };
		System.out.println(maxSlidingWindow(arr, 3));

	}

	public static int maxSlidingWindow(int[] nums, int k) {

		int i = 0, j = 0, sum = 0, max_sum = 0;

		while (j < nums.length) {

			sum = sum + nums[j];

			if (j - i + 1 < k) {
				j++;
			} else if ((j - i + 1) == k) {
				if (max_sum < sum) {
					max_sum = sum;
				}

				sum = sum - nums[i];
				i++;
				j++;
			}
		}

		return max_sum;
	}
}
