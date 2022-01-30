package strigQn;

public class Stringpermu {

	public static void main(String arg[]) {
		permu("ABC");
	}

	private static void permu(String s) {

		if (s == null || s.length() == 0) {
			return;
		}

		permu("", s);
	}

	private static void permu(String prefix, String remaining) {

		
		if(remaining.length()==0)
		{
			System.out.println(prefix+"=====>>"+remaining);
			return;
		}
		
		for(int i=0;i<remaining.length();i++)
		{
			System.out.print("::"+i+"=>"+prefix+remaining.charAt(i)+"=>"+remaining.substring(i+1,remaining.length()));
			permu(prefix+remaining.charAt(i),remaining.substring(0,i)+remaining.substring(i+1,remaining.length()));
		}
	}

}
