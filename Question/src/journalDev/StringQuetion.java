package journalDev;

public class StringQuetion {
	
	public static void main(String arg[])
	{
		String s1="abc";
		
		System.out.println(rev(s1));
		
		StringBuilder s2 = new StringBuilder("abc");
		StringBuilder s3=new StringBuilder(s1);
		System.out.println(s2.reverse());
		System.out.println(s3.reverse());
	}

	private static String rev(String s1) {
		if(s1==null)
		return null;
		
		StringBuilder s2  = new StringBuilder();
		for(int i=s1.length()-1;i>0;i--)
		{
			s2.append(s1.charAt(i));
		}
		
		return s2.toString();
		
	}
	

}
