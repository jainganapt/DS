package LeetCode;

public class SortedAraaySquare {
	
	public static void main(String arg[])
	{
		int arr[] = {-8,-6,-2,0,1,3,4,5};
		
		int arr1[]=sortedSqaureAraa(arr);
		
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print("==>"+arr1[i]);
		}

	}

	private static int[] sortedSqaureAraa(int[] arr) {
	
	  
	  int negative=0; 
	  
	  int sq[]= new int[arr.length];
	  
	  for(int i=0;i<arr.length;i++)
	  {
		if(arr[i]<0)
		{
			negative++;
		}
		else
		{
			break;
		}
	  }
	  int j=0;
	  int i=0;
	  for(i=negative;i<arr.length;)
	  {
		  System.out.println("negative"+negative+"i"+i);
		  if(negative>0)
		  {
			  if(arr[i]<Math.abs(arr[negative-1]))
			  {
				  sq[j] =arr[i] * arr[i];
				  j++;
				  i++;
			  }
			  else if(arr[i]>Math.abs(arr[negative-1]))
			  {
				  sq[j]=arr[negative-1] * arr[negative-1];
				  j++;
				  negative--;
			  }
			  else if(arr[i]==Math.abs(arr[negative-1]))
			  {
				  sq[j]=arr[i] * arr[i];
				  j++;
				  i++;
				  sq[j]=arr[negative-1] * arr[negative-1];
				  j++;
				  negative--;
			  }
		  }
		  else
		  {
			  break;
		  }
		  
	  }
	  while(i!=arr.length)
	  {
		  sq[j]=(int) Math.sqrt(arr[i]);
		  j++;
		  i++;
		  
	  }
	  while(negative>0)
	  {
		  sq[j]=arr[negative-1] * arr[negative-1];
		  j++;
		  negative--;
		  
	  }
	  
		
		// TODO Auto-generated method stub
		return sq;
	}

}
