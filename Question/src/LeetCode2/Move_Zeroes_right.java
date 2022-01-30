package LeetCode2;


public class Move_Zeroes_right {

	public static void main(String arg[]) {
		
		int nums[] = { 4, 2, 4, 0, 0, 3, 0, 5, 1, 0 };

		moveZeroes(nums);
	}

	public static void moveZeroes(int[] nums) {

		if (nums.length <= 1)
			return;
		int zeroPtr = 0;
		int nonZeroPtr = 0;

		while (zeroPtr < nums.length) {

			if (nums[zeroPtr] == 0) {
				zeroPtr++;
			} else {
				int temp = nums[nonZeroPtr];
				nums[nonZeroPtr] = nums[zeroPtr];
				nums[zeroPtr] = temp;

				zeroPtr++;
				nonZeroPtr++;

			}
		}

		for (int i = 0; i < nums.length; i++) {
			System.out.println("i->" + nums[i]);
		}
	}
}
