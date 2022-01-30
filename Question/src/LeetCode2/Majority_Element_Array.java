package LeetCode2;


public class Majority_Element_Array {

	public static void main(String arg[]) {
		int arr[] = { 3, 2, 3 };
		int arr2[] = { 2, 2, 1, 1, 1, 2, 2 };
		System.out.println(majorityElement(arr2));
	}

	public static int majorityElement(int[] nums) {

		int count = 1;
		int ele = nums[0];

		for (int i = 1; i < nums.length; i++) {

			if (ele != nums[i] && count == 1) {
				ele = nums[i];
			} else if (ele == nums[i]) {
				count++;
			} else if (ele != nums[i] && count >= 1) {
				count--;
			}

		}
		if (count > nums.length / 2) {
			return ele;
		}
		return ele;
	}
}
