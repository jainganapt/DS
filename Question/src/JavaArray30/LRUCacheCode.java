package JavaArray30;

import java.util.LinkedHashSet;
import java.util.Set;

public class LRUCacheCode {

	Set<Integer> cache;
	int capacity;

	public LRUCacheCode(int capacity) {
		this.cache = new LinkedHashSet<Integer>(capacity);
		this.capacity = capacity;
	}

	public static void main(String arg[]) {

		LRUCacheCode ca = new LRUCacheCode(2);

		ca.refer(1);
		ca.refer(2);
		ca.refer(3);
		ca.refer(4);
		ca.refer(2);
		ca.refer(3);
		ca.refer(5);
		ca.refer(1);
		ca.display();
	}

	private void refer(int i) {

		if (!cache.contains(i)) {
			put(i);
		} else {
			cache.remove(i);
			cache.add(i);
		}

	}

	private void put(int i) {

		if (cache.size() == capacity) {
			int key = cache.iterator().next();
			cache.remove(key);
		}
		cache.add(i);
	}

	private void display() {

		Object[] arr = cache.toArray();

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]+" ");
		}

	}

}
