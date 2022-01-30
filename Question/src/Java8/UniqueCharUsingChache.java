package Java8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UniqueCharUsingChache {

	public static void main(String arg[]) {

		Scanner s1 = new Scanner(System.in);

		System.out.println("**************************");
		System.out.println("Please enter all the string with new line or space");
		System.out.println(" enter exit to get the unique char count");

		Map<String, Long> m1 = new HashMap<>();
		long totalUniqueChar = 0;

		while (true) {

			String s = s1.next();
			if (s.equalsIgnoreCase("exit")) {
				break;
			}
			if (m1.get(s) == null) {
				long c1 = s.chars().distinct().count();
				totalUniqueChar = totalUniqueChar + c1;
				m1.put(s, c1);
			} else {
				totalUniqueChar = totalUniqueChar + m1.get(s);

			}

		}

		for(Map.Entry<String, Long> key :m1.entrySet())	
		{
			System.out.println("[input string->"+key.getKey()+" count:"+key.getValue()+" ] ");
		}
		System.out.println("**************************");

		s1.close();

	}

}
