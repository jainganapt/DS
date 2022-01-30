package journalDev;

public class SwapTwoNumber {
	public static void main(String arg[])
	{
		int a=30;
		int b=40;
		System.out.println("swap");
		
		b=b+a;//70
		a=b-a;//40
		b=b-a;
		
		System.out.println("a"+a+"b"+b);
	}

}
