package LeetCode2;


import java.util.ArrayList;
import java.util.List;

public class Summary_Ranges_sol {

	public static void main(String arg[]) {

		int[] nums = { 0,2,3,4,6,8,9 };
		List<String> data2 = summaryRanges(nums);
		for (int i = 0; i < data2.size(); i++) {
			System.out.println(data2.get(i));
		}
	}

	public static List<String> summaryRanges(int[] nums) {

		List<String> data = new ArrayList<String>();

		if(nums.length==0)
			return data;
		
		int start = nums[0];
		int end = nums[0];
		int i = 0;
		for (i = 1; i < nums.length; i++) {

			if ((end + 1) != nums[i] && start == end) {
				data.add(String.valueOf(start));
				start = nums[i];
				end = nums[i];
			} else if ((end + 1) == nums[i]) {
				end = nums[i];
			} else if ((end + 1) != nums[i] && start != end) {
				data.add(String.valueOf(start) + "->" + String.valueOf(end));

				start = nums[i];
				end = nums[i];
			}

		}

		//System.out.println("i"+i);
		
		if (i == (nums.length)) {
			if (start == end) {
				data.add(String.valueOf(start));
			} else {
				data.add(String.valueOf(start) + "->" + String.valueOf(end));
			}
		}

		//System.out.println("start" + start + "end" + end);

		return data;

	}
}