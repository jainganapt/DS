package String;

import java.util.Arrays;

public class RevString {
	
	public static void main(String arg[])
	{
		String blogName = "Hello";
		
		System.out.println(rever(blogName));
		
		String blogName2 = "   how to   do    in  java   .         com   "; 
		 
		String nameWithProperSpacing = blogName2.replaceAll("\\s+", " ");
		
		System.out.println(nameWithProperSpacing);
		System.out.println("->"+blogName2.trim()+"->");
		
		String str = "A-B-C-D";
		String[] strArray = str.split("-"); 
		System.out.println(Arrays.toString(strArray));
		
		String[] strArray2 = str.split("\\s");
		String[] strArray3 = str.split("-|\\.");
		
		String[] strArray4 = str.split("\\s", 5);
        System.out.println(Arrays.toString(strArray2));
        
        System.out.println(Arrays.toString(strArray2));
        System.out.println(Arrays.toString(strArray3));
        System.out.println(Arrays.toString(strArray4));
		
		
	}

	private static String rever(String blogName) {
		if(blogName.length()==0)
			return blogName;
		
		System.out.println(blogName);
		
		return rever(blogName.substring(1))+blogName.charAt(0);
		
	}

}
