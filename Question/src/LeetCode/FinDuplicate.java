package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class FinDuplicate {

	public static void main(String arg[]) {
		int arr[] = { 1, 3, 4, 3, 3, 3, 2, 5 };

		System.out.println(findDuplica(arr));
	}

	private static int findDuplica(int[] arr) {
		int dupli = 0;

		Set<Integer> s = new HashSet<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (s.contains(arr[i])) {
				dupli=arr[i];
				System.out.println("dupli"+arr[i]);
			}
			else
			{
				s.add(arr[i]);
			}

		}

		return dupli;
	}
}
