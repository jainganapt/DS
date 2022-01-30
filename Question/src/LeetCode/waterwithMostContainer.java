package LeetCode;

public class waterwithMostContainer {
	public static void main(String arg[])
	{
		int arr[]={1,8,6,2,5,4,8,3,7};
		
		MaxWaterarea(arr);
		
	}

	private static void MaxWaterarea(int[] arr) {
		
		int left=0;
		int right=arr.length-1;
		int hig=0;
		int wid=0;
		
		int maxwater=Integer.MIN_VALUE;
		
		while(left<right)
		{
			wid=right-left;
			hig=Math.min(arr[left], arr[right]);
			maxwater=Math.max(maxwater, wid*hig);
			if(arr[left]<arr[right])
			{
				left++;
			}
			else {
				right--;
			}
			
		}
		
		System.out.println("out"+maxwater);
	}

	
}
