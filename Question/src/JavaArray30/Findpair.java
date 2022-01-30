package JavaArray30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Findpair {

	public static void main(String arg[]) {

		Scanner val = new Scanner(System.in);

		int val1 = val.nextInt();

		Map<Integer, Set<Integer>> m1 = new HashMap<Integer, Set<Integer>>();

		List<Integer> data = new ArrayList<Integer>();

		while (val1 > 0) {

			data.add(val.nextInt());
			val1--;
		}

		int paricount = val.nextInt();

		while (paricount > 0) {

			int[] pair = new int[2];

			pair[0] = val.nextInt();
			pair[1] = val.nextInt();

			Arrays.parallelSort(pair);

			if (m1.get(pair[0]) == null) {

				Set<Integer> list = new HashSet<Integer>();
				list.add(pair[1]);
				m1.put(pair[0], list);

			} else {
				Set<Integer> right = m1.get(pair[0]);
				right.add(pair[1]);

				m1.put(pair[0], right);
			}

			paricount--;
		}
		int maxfund = 0;
		int fund = 0;

		for (Entry<Integer, Set<Integer>> it : m1.entrySet()) {

			int start = it.getKey();

			System.out.println("start" + start);
			System.out.println("right" + it.getValue());

			fund = fund + data.get(start - 1);

			for (Integer i : m1.get(start)) {

				fund = fund + data.get(i - 1);

				System.out.println("i" + i);
				System.out.println("fund" + fund);
				
				fund = fund + sum(i, fund, m1, data);

			}

			System.out.println("fund" + fund);
			if (fund > maxfund) {
				maxfund = fund;
			}
			fund = 0;
		}

		System.out.println("maxfund:" + maxfund);

	}

	public static int sum(int revkey, int fund, Map<Integer, Set<Integer>> m1, List<Integer> data) {
		int tsum = fund;

		while (m1.get(revkey) != null) {
			tsum = tsum + data.get(revkey - 1);

			for (Integer i : m1.get(revkey)) {

				return tsum + sum(i, tsum, m1, data);

			}

		}

		return tsum;

	}
}