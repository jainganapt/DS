package LeetCode2;

import java.util.HashMap;

public class Subarray_Sum_Equals_K {

	public static void main(String arg[]) {

		int[] nums = { 1, 1, 1 };
		int k = 2;
		int count = subarraySum(nums, k);
		System.out.println("count" + count);
		
		count =findSubarraySum(nums,nums.length,k);
		System.out.println("count" + count);

	}
	
	static int findSubarraySum(int arr[], int n, int sum)
    {
        // HashMap to store number of subarrays
        // starting from index zero having
        // particular value of sum.
        HashMap<Integer, Integer> prevSum = new HashMap<>();

        int res = 0;

        // Sum of elements so far.
        int currsum = 0;

        for (int i = 0; i < n; i++) {

            // Add current element to sum so far.
            currsum += arr[i];

            // If currsum is equal to desired sum,
            // then a new subarray is found. So
            // increase count of subarrays.
            if (currsum == sum)
                res++;

            // currsum exceeds given sum by currsum
            //  - sum. Find number of subarrays having
            // this sum and exclude those subarrays
            // from currsum by increasing count by
            // same amount.
            if (prevSum.containsKey(currsum - sum))
                res += prevSum.get(currsum - sum);

            // Add currsum value to count of
            // different values of sum.
            Integer count = prevSum.get(currsum);
            if (count == null)
                prevSum.put(currsum, 1);
            else
                prevSum.put(currsum, count + 1);
            
            
            System.out.println(prevSum);
        }

        return res;
    }

	public static int subarraySum(int[] nums, int k) {

		int i = 0;
		int j = 0;
		int sum = 0;
		int count = 0;

		while (j < nums.length ) {

			sum = sum + nums[j];
			if (sum < k) {
				j++;
			} else if (sum == k) {
				count++;
				j++;
			} else {
				while (sum > k) {
					sum = sum - nums[i];
					i++;
				}
				if (sum == k) {
					count++;
				}
				j++;
			}

		}

		return count;

	}
}
