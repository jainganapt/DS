package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class SortArrary {

	public static void main(String[] args) {
		Integer number[] = new Integer[] { 1, 4, 3, 3, 23, 23, 232, 21, 121, 21, 121, 233 };
		
		System.out.println(Arrays.toString(number));
		
		Arrays.parallelSort(number);
		
		System.out.println((Arrays.toString(number)));
		
		Arrays.parallelSort(number,Collections.reverseOrder());
		
		System.out.println((Arrays.toString(number)));
		
		HashSet<Integer> numberSet = 
				new HashSet<>(Arrays.asList(1,1,1,1,2,212,32,232,232,2121,32,32,323232,32,131,1313,343,43,323));
	
	
		List<Integer> num = new ArrayList<>(numberSet);
		
		Collections.sort(num);
		
		System.out.println(num.toString());
		
		HashMap<Integer, String> map = new HashMap<>();
        
		map.put(50, "Alex");
		map.put(20, "Charles");
		map.put(60, "Brian");
		map.put(70, "Edwin");
		map.put(120, "George");
		map.put(10, "David");
		
		//sort by key
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		
		//sort by value
		
		System.out.println("Sort by values");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
	
		
		System.out.println("Sort by reverser order");
		
		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
		
	}
	
	

}
