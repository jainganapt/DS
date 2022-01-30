package stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Next_Greater_Element {

	public static void main(String arg[]) {
		int[] nums1 = { 4, 1, 2 };
		int[] nums2 = { 1, 3, 4, 2 };

		int nums4[] = nextGreaterElement(nums1, nums2);

		for (int i = 0; i < nums4.length; i++) {
			System.out.println("i" + nums4[i]);
		}

	}

	public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

		int[] nums3 = new int[nums1.length];
		Map<Integer, Integer> GRE = new HashMap<>();

		Stack<Integer> data = new Stack<Integer>();

		for (int i = nums2.length - 1; i >= 0; i--) {

			if (data.isEmpty()) {
				GRE.putIfAbsent(nums2[i], -1);
			}

			else if (!data.isEmpty() && data.peek() > nums2[i]) {
				GRE.putIfAbsent(nums2[i], data.peek());
			}

			else if (!data.isEmpty() && data.peek() <= nums2[i]) {
				while (!data.isEmpty() && data.peek() <= nums2[i]) {
					data.pop();
				}
				if (!data.isEmpty()) {
					GRE.putIfAbsent(nums2[i], data.peek());
				} else {
					GRE.putIfAbsent(nums2[i], -1);
				}
			}
			data.push(nums2[i]);

		}

		for (int i = 0; i < nums1.length; i++) {
			nums3[i] = GRE.get(nums1[i]);
		}

		return nums3;
	}
}
