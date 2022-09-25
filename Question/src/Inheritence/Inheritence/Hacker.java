package Inheritence;

public class Hacker {

	static {
		
		code(2);
	}
	
	static void code (int val)
	
	{
		System.out.println(val+" ");
	}
	
	Hacker()
	{
		code(5);
	}
	
	static {
		code(4);
		
	}
	{
		code(6	);
	}
	
	static {
		new Hacker();
		
	}
	{
		code(8);
	}
	
	public static void main(String arg[])
	{
		
		
	}
}
