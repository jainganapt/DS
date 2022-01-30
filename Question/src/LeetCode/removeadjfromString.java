package LeetCode;

import java.util.Stack;

public class removeadjfromString {
	
	public static void main(String arg[])
	{
		String s="abbaca";
		System.out.println(removeAdjSameChar(s));
			
	}

	private static String removeAdjSameChar(String s) {
		
		Stack<Character> s1 = new Stack<Character>();
		
		for(int i=0;i<s.length();i++)
		{
			if(!s1.isEmpty() && s1.peek()==s.charAt(i))
			{
				s1.pop();
			}
			else
			{
				s1.push(s.charAt(i));
			}
		}
		
		StringBuilder s3 = new StringBuilder();
		while(!s1.empty())
		{
			s3.append(s1.pop());
		}
		
		return s3.reverse().toString();
	}

}
