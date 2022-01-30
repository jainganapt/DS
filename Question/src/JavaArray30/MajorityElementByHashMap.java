package JavaArray30;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MajorityElementByHashMap {

	public static void main(String arg[]) {
		int arr[] = { 2, 3, 3, 3, 4, 3, 2, 2, 3, 3 };

		int num = findcandidateUsingMap(arr);

		System.out.println("val" + num);
	}

	private static int findcandidateUsingMap(int[] arr) {

		Map<Integer, Integer> m1 = new HashMap<>();

		for(int i=0;i<arr.length;i++)
		{
			if(!m1.containsKey(arr[i]))
			{
				m1.put(arr[i], 1);
			}
			else
			{
				m1.put(arr[i], m1.get(arr[i])+1);
				
			}
		}
		
		int len=arr.length;
		
		for(  Entry<Integer, Integer>  m :m1.entrySet())
		{
			if(m.getValue()> (len/2))
			{
				return m.getKey();
			}
			
		}
		
		return -1;
	}

}
