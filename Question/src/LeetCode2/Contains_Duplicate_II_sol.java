package LeetCode2;

import java.util.HashMap;
import java.util.Map;

public class Contains_Duplicate_II_sol {

	public static void main(String arg[]) {
		int arr[] = { 1,0,1,1 };
		System.out.println(containsNearbyDuplicate(arr, 1));
	}

	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		Map<Integer, Integer> data = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			if (data.get(nums[i]) == null) {
				data.put(nums[i], i);
			} else {
				if (k - Math.abs(i - data.get(nums[i])) >= 0) {
					return true;
				}
				else {
					data.put(nums[i], i);
				}
			}
		}

		return false;
	}

}
