package LeetCode;

public class SubarrayWithSum {
	
	public static void main(String arg[])
	{
		int arr[]= {2,3,1,42,4,3};
		
		System.out.println(subarrywithSum(arr,7));
		
		
	}

	private static int subarrywithSum(int[] arr, int sum) {
		int target=0;
		int left=0;
		
		int result =Integer.MAX_VALUE;
		
		for (int i=0;i<arr.length;i++)
		{
			target=target+arr[i];
			System.out.println("target"+target+"i"+i);
			while(sum<target)
			{	
				result=Math.min(result, i+1 -left);
				target=target-arr[left];
				left++;
				
			}
			System.out.println("left"+left);
			
		}
		
		System.out.println("left"+left);
		
		return arr.length-left;
	}

}
