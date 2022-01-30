package stack;

import java.util.Stack;

class data {

	int value;

	int idx;

	data(int val, int id) {
		this.value = val;
		this.idx = id;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

}

public class Stock_span_Problem {

	public static void main(String arg[]) {

		int arr[] = { 100, 80, 60, 70, 60, 75, 85 };
		int val2[] = stockspan(arr);

		for (int i = 0; i < val2.length; i++) {
			System.out.println("arr   ->" + arr[i] + "   val-> " + val2[i]);
		}

	}

	public static int[] stockspan(int arr[]) {

		int arr2[] = new int[arr.length];
		int val[] = new int[arr.length];
		int k = 0;

		Stack<data> st = new Stack<>();

		for (int i = 0; i < arr.length - 1; i++) {

			if (st.isEmpty()) {
				arr2[k] = -1;
				k++;
			} else if (st.size() > 0 && st.peek().getValue() > arr[i]) {
				arr2[k] = st.peek().getIdx();
				k++;
			} else if (st.size() > 0 && st.peek().getValue() <= arr[i]) {
				while (st.size() > 0 && st.peek().getValue() <= arr[i]) {
					st.pop();
				}

				if (st.size() == 0) {
					arr2[k] = -1;
					k++;
				} else {
					arr2[k] = st.peek().getIdx();
					k++;
				}
			}

			data d = new data(arr[i], i);
			st.push(d);
		}

		for (int i = 0; i < arr2.length; i++) {
			// System.out.println("val:" + arr2[i]);
		}

		k = 0;

		for (int i = 0; i < arr2.length; i++) {
			// System.out.println("i:" + i + "val:" + arr2[i]);
			val[k] = i - arr2[i];
			k++;
		}
		return val;

	}

}
