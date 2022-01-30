package LeetCode;

public class BackSpaceStringCompare {
	
	public static void main(String args[])
	{
		System.out.println(stringcompare("aab##","aa#b#"));
	}

	private static boolean stringcompare(String s1, String s2) {
		// TODO Auto-generated method stub
		
		int left =s1.length()-1;
		int right =s1.length()-1;
		int skip=0;
		
		while(left>0 && right >0)
		{
			if(s1.charAt(left)=='#')
			{
				skip++;
			}
		}
		
		return false;
		
	}

}
