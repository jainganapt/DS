package stack;

import java.util.Stack;

class dataTemp {

	int val;

	int idx;

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

	dataTemp(int a, int b) {
		val = a;
		idx = b;
	}

}

public class Daily_Temperatures {

	int val;

	int idx;

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

	Daily_Temperatures(int a, int b) {
		val = a;
		idx = b;
	}

	public static void main(String arg[]) {

		int temperatures[] = { 89, 62, 70, 58, 47, 47, 46, 76, 100, 70 };

		int arr[] = dailyTemperatures(temperatures);

		for (int i = 0; i < arr.length; i++) {

			System.out.println("->" + arr[i]);
		}

	}

	public static int[] dailyTemperatures(int[] temp) {

		Stack<Daily_Temperatures> st = new Stack<>();

		int arr[] = new int[temp.length];

		for (int i = temp.length - 1; i >= 0; i--) {

			if (st.isEmpty()) {
				arr[i] = 0;
			} else {

				while (!st.isEmpty() && st.peek().getVal() <= temp[i]) {
					st.pop();
				}

				if (st.isEmpty()) {
					arr[i] = 0;
					System.out.println(temp[i] + "-->" + "0");
				} else {
					System.out.println(temp[i] + "-->" + (st.peek().getIdx() - i));
					arr[i] = st.peek().getIdx() - i;
				}
			}

			//System.out.println(" idx " + i + " ->" + temp[i]);

			Daily_Temperatures d1 = new Daily_Temperatures(temp[i], i);
			st.push(d1);

		}

		return arr;
	}
}
