package TopQuestion;

public class Fibo {

	public static void  main(String arg[])
	{
		int count=5;
		System.out.println(fibo(count));
	}

	private static int  fibo (int n) {
		
		if(n<=1)
		return n;
		
		return fibo(n-1)+fibo(n-2);
		
	}
}
