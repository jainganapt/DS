package LeetCode2;


import java.util.HashMap;
import java.util.Map;

public class Find_Single_Number_Array {

	public static void main(String arg[]) {

		int arr[] = { 2, 2, 1 };

		Map<Integer, Integer> data = new HashMap<>();

		for (int num : arr) {
			if (data.get(num) == null) {
				data.put(num, 1);
			} else {
				data.put(num, data.get(num) + 1);
			}
		}
		
		data.entrySet().stream().sorted(Map.Entry.comparingByValue()).findFirst().get().getKey();

	}
}
