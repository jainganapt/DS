package LeetCode2;


public class Max_Consecutive_Ones {

	public static void main(String arg[]) {

		int nums[] = { 1, 1, 0, 1, 1, 1 };

		System.out.println(findMaxConsecutiveOnes(nums));
	}

	public static int findMaxConsecutiveOnes(int[] nums) {

		int max = 0;
		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				count++;

			} else {
				count = 0;
			}
			if (max < count) {
				max = count;
			}

		}

		return max;
	}
}