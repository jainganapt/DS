package LeetCode;

public class ValidPalindroneonechardel {
	
	public static void main(String arg[])
	{
		System.out.println(validPalin("abc"));
		System.out.println(validPalin("abaa"));
		System.out.println(validPalin("abcd"));
		System.out.println(validPalin("abcdda"));
		System.out.println(validPalin("abcdgdcba"));
	}

	private static boolean validPalin(String s1) {
		
		int left=0;
		int right=s1.length()-1;
		
		while(left<right)
		{
			if(s1.charAt(left)==s1.charAt(right))
			{
				left++;
				right--;
			}
			else
			{
				return validPalinonechar(s1,left+1,right) || validPalinonechar(s1,left,right-1);
			}
		}
		return true;
	}

	private static boolean validPalinonechar(String s1, int left, int right) {
		  
		while(left<right)
		{
		
			
			if(s1.charAt(left)==s1.charAt(right))
			{
				left++;
				right--;
			}
			else
			{
				return false;
			}
		}
		
		return true;
	}

}
