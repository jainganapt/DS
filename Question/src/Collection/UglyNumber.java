package Collection;

import java.util.Scanner;

public class UglyNumber {

	public static void main(String arg[]) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t > 0) {

			long t1 = sc.nextLong();

			System.out.println(ugly(t1));

			t--;
		}

	}

	private static Long ugly(long t1) {

		if (t1 == 1)
			return 1L;
		Long count = 1L;
		Long num = 1L;
		while (count < t1) {
			num++;
			if (isUglyprime(num)) {
				//System.out.println("hello"+num+"count"+count);
				count++;
			}
			
		}

		return num;
	}

	private static boolean isUglyprime(Long num) {

		//System.out.println("num"+num);

		while (num % 2 == 0) {
			num=num/2;
		}
		
		//System.out.println("num1:"+num);
		if(num>1)
		{
			while (num % 3 == 0) {
				num=num/3;
			}
			
		}

		//System.out.println("num2:"+num);
		if(num>1)
		{
			while (num % 5 == 0) {
				num=num/5;
			}
			
		}
       
		//System.out.println("num3:"+num);
		if(num==1)
		return true;
        else
        return false;
	}

}
