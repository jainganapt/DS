package ctor;

public class ctor1 {
	
	int a;
	String b;
	
	ctor1(int a1, String b1)
	{
		this.a=a1;
		this.b=b1;
		return;
	}

	public ctor1 ctor1(int a1, String b1)
	{
		this.a=a1;
		this.b=b1;
		return this;
	}
	public static void main(String arg[])
	{
		
		ctor1 a = new ctor1(1, "111");
		

		System.out.println("a"+a.a);
		System.out.println("b"+a.b);
		
		ctor1 b=a.ctor1(1, "3232");
		
		System.out.println("b"+b.a);
		System.out.println("b"+b.b);
		
		System.out.println("a"+a.a);
		System.out.println("b"+a.b);
	}
}
