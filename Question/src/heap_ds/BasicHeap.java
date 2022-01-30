package heap_ds;

import java.util.Comparator;
import java.util.PriorityQueue;

public class BasicHeap {

	public static void main(String arg[])
	{
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
		
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
	}
}
