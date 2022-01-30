package heap_ds;

import java.util.PriorityQueue;

public class Kth_Largest_Element_in_an_Array {

	public static void main(String arg[]) {

		int nums[] = { 3, 2, 1, 5, 6, 4 };
		int k = 5;

		System.out.println(findKthLargest(nums, k));

	}

	public static int findKthLargest(int[] nums, int k) {

		PriorityQueue<Integer> minHeap = new PriorityQueue<>();

		for (int i = 0; i < nums.length; i++) {
			minHeap.add(nums[i]);

			if (minHeap.size() > k) {
				minHeap.poll();
			}
		}
		
		System.out.println(minHeap);

		return minHeap.peek();
	}
}
