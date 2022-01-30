package stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class stock_data {

	int val;

	public stock_data(int val, int idx) {
		super();
		this.val = val;
		this.idx = idx;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	int idx;
}

public class Online_Stock_Span {

	public static void main(String arg[]) {
		int arr[] = { 100, 80, 60, 70, 60, 75, 85 };
		int res[] = online_stock_span(arr);

		for (int i = 0; i < res.length; i++) {
			System.out.println("->" + res[i]);
		}
	}

	public static int[] online_stock_span(int arr[]) {

		Map<Integer,Integer> data = new HashMap<>();
		Stack<stock_data> st = new Stack<>();
		int res[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (st.isEmpty()) {
				res[i] = -1;
				data.put(arr[i], -1);
			} else if (!st.isEmpty() && st.peek().getVal() > arr[i]) {
				res[i] = st.peek().getIdx();
				data.put(arr[i], i-res[i]);
			} else if (!st.isEmpty() && st.peek().getVal() <= arr[i]) {
				while (!st.isEmpty() && st.peek().getVal() <= arr[i]) {
					st.pop();
				}
				if (st.isEmpty()) {
					res[i] = -1;
					data.put(arr[i], -1);
				} else if (st.peek().getVal() > arr[i]) {
					res[i] = st.peek().getIdx();
					data.put(arr[i], i-res[i]);
				}

			}
			stock_data d1 = new stock_data(arr[i], i);
			st.push(d1);
		}

		//System.out.println(data);
		
		return res;
	}
}
