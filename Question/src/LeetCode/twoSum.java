package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class twoSum {
	
	public static void main(String arg[])
	{
		int arr[]= {1,3,5,6,7,8,4};
		int target=8;
		int arr1[]=printtwosum(arr,target);
		
		
	   System.out.println("=>"+arr1[0]+" "+arr1[1]);
	
	   int arr2[]=printtwosumwithonlyonesol(arr,target);
		
	   System.out.print("=>"+arr2[0]+" "+arr2[1]);
	}
	
	private static int[] printtwosum(int arr[],int sum)
	{
		int ind[] = new int[2];
		Map<Integer,Integer> m = new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(!m.containsKey(arr[i]))
			 {
				m.put(arr[i], 1);
			 }
			else
			{
				m.put(arr[i], m.get(arr[i])+1);
				
			}
		}
		int rem=0;
		for(int i=0;i<arr.length;i++)
		{
			rem=sum-arr[i];
			
			m.put(arr[i],m.get(arr[i])-1);
			
			if(m.get(rem)!=null)
			{
				System.out.println(arr[i]+" "+rem);
				m.put(rem,m.get(rem)-1);
				ind[0]=i;
				break;
			}
			
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==rem)
			{
				ind[1]=i;
				return ind;
			}
		}
		
		return ind;
		
	}
	
	
	private static int[] printtwosumwithonlyonesol(int arr[],int sum)
	{
		int ind[] = new int[2];
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(map.get(sum-arr[i])!=null)
			{
				ind[0]=i;
				ind[1]=map.get(sum-arr[i]);
						
			   return ind;
			}
			map.put(arr[i], i);
		}
		
		return ind;
		
	}
	

}
