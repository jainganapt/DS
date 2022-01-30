package LeetCode;

public class MinCostclimb {
	
	public static void main(String arg[])
	{
		int arr[] = {10,15,20};
		
		int arr1[]= {1,100,1,1,1,100,1,1,100,1};
		
		System.out.println("cost"+findMinCost(arr));
		
		
		System.out.println("cost"+findMinCost(arr1));
	}

	private static int  findMinCost(int[] arr) {
	
		
		for(int i=2;i<arr.length;i++)
		{
			arr[i]+= Math.min(arr[i-1], arr[i-2]);
		}
		
		return Math.min(arr[arr.length-1], arr[arr.length-2]);
	}

	
}
