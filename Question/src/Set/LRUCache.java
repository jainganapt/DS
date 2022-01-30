package Set;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {

	Map<Integer, Integer> mapdata;
	int cap;

	public LRUCache(int capacity) {
		mapdata = new LinkedHashMap<>(capacity);
		cap = capacity;
	}

	public int get(int key) {
		if (mapdata.get(key) == null) {
			return -1;
		} else {
			int val=mapdata.get(key);
			mapdata.remove(key);
			mapdata.put(key, val);
			return val;
		}
	}

	public void put(int key, int value) {

		if (mapdata.containsKey(key)) {
		
			mapdata.remove(key);
			mapdata.put(key, value);
		
		} else {

			if (mapdata.size() == cap) {
				int count = 0;

				for (Map.Entry<Integer, Integer> data : mapdata.entrySet()) {
					if (count == 0) {
						mapdata.remove(data.getKey());
						break;
					}

				}
				mapdata.put(key, value);
			} else {
				mapdata.put(key, value);
			}

		}
	}

}
