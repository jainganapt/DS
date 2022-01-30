package LeetCode2;


public class Serach_insert_position {

	public static void main(String arg[]) {
		int arr[] = { 1, 3, 5, 6 };
		System.out.println(searchInsert(arr, 2));

	}

	public static int searchInsert(int[] nums, int target) {
		
		int left=0;
		int right=nums.length-1;
		
		int mid=(left+right)/2;
		while(left<=right)
		{
			mid=(left+right)/2;
			if(nums[mid]==target)
			{
				return mid;
			}
			else if(nums[mid]>target)
			{
				right=mid-1;
			}
			else {
				left=mid+1;
			}
		}
		
	   if(left<=right)
		 return mid;
	   else
		 return left;

	}
}
