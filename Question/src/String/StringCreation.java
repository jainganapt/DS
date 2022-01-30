package String;

public class StringCreation {
	
	public static void main(String arg[])
	{
		String s1="ABC";
		
		String s2= new String("ABC");
		
		String s3= s2.intern();
		
		System.out.println(s1==s3);
	}

}
