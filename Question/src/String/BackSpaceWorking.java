package String;

public class BackSpaceWorking {
	
	public static void main(String arg[])
	{
		 System.out.println(backspace("ABC",1));
	}

	private static String backspace(String s1,int cursor) {
		return s1.substring(0, cursor-1)+s1.substring(cursor,s1.length());
	}

}
