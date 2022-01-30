package LeetCode2;

import java.util.Arrays;

public class Assign_Cookies {

	public static void main(String arg[]) {

	}

	public static int findContentChildren(int[] g, int[] s) {

		int count = 0;

		Arrays.sort(g);
		Arrays.sort(s);

		for (int i = 0, j = 0; i < g.length && j < s.length;) {
			
			if (s[j] >= g[i]) {
				count++;
				i++;
				
			}
			j++;
			
		}

		return count;
	}
}
