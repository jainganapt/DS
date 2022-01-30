package LeetCode;

public class BestBuy {

	public static void main(String arg[])
	{
		int arr[]= {7,1,5,3,6,4};
		
		
		bestbuy(arr);
		
	}

	private static void bestbuy(int[] arr) {
		
		int min=Integer.MAX_VALUE;
		int max_profit=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
			else if((arr[i]-min)>max_profit)
			{
				max_profit=arr[i]-min;
			}
		}
		
		System.out.println("max_profit"+max_profit);
	}
}
