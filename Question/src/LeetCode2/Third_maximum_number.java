package LeetCode2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Third_maximum_number {

	public static void main(String arg[]) {

		int arr[] = { 1, 1, 2 };
		System.out.println(thirdMax(arr));
	}

	//public static int thirdMax_2(int[] nums) {

		
	//}

	public static int thirdMax(int[] nums) {

		Set<Integer> data = new TreeSet<>(Collections.reverseOrder());

		if (nums.length == 1) {
			return nums[0];
		}
		if (nums.length == 2) {
			if (nums[0] > nums[1]) {
				return nums[0];
			} else {
				return nums[1];
			}
		}
		for (int i = 0; i < nums.length; i++) {
			data.add(nums[i]);
		}

		List<Integer> list = new ArrayList<Integer>(data);

		if (list.size() >= 3) {
			return list.get(2);
		} else {
			return list.get(0);
		}

	}

}
