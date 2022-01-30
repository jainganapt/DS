package LeetCode2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Relative_Ranks_ {

	public static void main(String arg[]) {

		int score[] = { 10, 3, 8, 9, 4 };
		String[] data = findRelativeRanks(score);
		for (int i = 0; i < data.length; i++) {
			System.out.println(":" + data[i]);
		}

	}

	public static String[] findRelativeRanks(int[] score) {

		String[] data = new String[score.length];

		String first = "Gold Medal";
		String  Third  = "Bronze Medal";
		String Second = "Silver Medal";

		Map<Integer, Integer> input = new TreeMap<>(Collections.reverseOrder());

		for (int i = 0; i < score.length; i++) {
			input.put(score[i], i);

		}

		int count = 1;

		for (Map.Entry<Integer, Integer> in : input.entrySet()) {
			if (count == 1) {
				//System.out.println(":" + in.getValue());
				data[in.getValue()] = first;
			} else if (count == 2) {
				//System.out.println(":" + in.getValue());
				data[in.getValue()] = Second;
			} else if (count == 3) {
				//System.out.println(":" + in.getValue());
				data[in.getValue()] = Third;
			} else {
				//System.out.println(":" + in.getValue());
				data[in.getValue()] = count + "";
			}
			count++;
		}

		return data;
	}
}
