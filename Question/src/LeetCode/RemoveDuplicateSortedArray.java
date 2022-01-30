package LeetCode;

public class RemoveDuplicateSortedArray {

	public static void main(String arg[]) {
		int[] arr = { 0, 0, 1, 2, 2, 3, 3 };

		int updateindex = removeDuplicate(arr);
		
		System.out.println("updatedindex"+updateindex);
		
		for(int i=0;i<updateindex;i++)
		{
			System.out.println("=>"+arr[i]);
		}

	}

	private static int removeDuplicate(int[] arr) {

		int i=0,//fast
				
		j=0;//slow
		
		for(i=0;i<arr.length;i++)
		{
		  if(arr[i]!=arr[j])	
		  {
			  j++;
			  arr[j]=arr[i];
			  
		  }
		}
		
		return j+1;
	}

}
