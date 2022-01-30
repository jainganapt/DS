package LeetCode;

public class Palindrome {

	public static void main(String arg[]) {
		System.out.println(palin("abba"));
	}

	private static boolean palin(String s) {
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=s.charAt(s.length()-(i+1)))
			{
				return false;
				
			}
		}
		
		return true;
	}
}
