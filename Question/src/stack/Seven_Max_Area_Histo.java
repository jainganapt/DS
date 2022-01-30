package stack;

import java.util.Stack;

class data2 {

	int value;

	int idx;

	data2(int val, int id) {
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

public class Seven_Max_Area_Histo {

	public static void main(String arg[]) {

		int arr[] = { 6, 2, 5, 4, 5, 1, 6 };
		int outptut2[] = Seven_Max_Area_Histo_cal(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr   ->" + arr[i] + "   val-> " + outptut2[i]);
		}

	}

	private static int[] Seven_Max_Area_Histo_cal(int[] arr) {

		int output_area[] = new int[arr.length];

		int left_NSL[] = Seven_Max_Area_Histo_cal_left(arr);
		for (int i = 0; i < left_NSL.length; i++) {
			System.out.println("i: value " + i + " left indx:" + left_NSL[i]);
		}

		int left_NSR[] = Seven_Max_Area_Histo_cal_right(arr);

		for (int i = 0; i < left_NSR.length; i++) {
		   System.out.println("i: value " + i + " right indx:" + left_NSR[i]);
		}

		for (int i = 0; i < arr.length ; i++) {
			System.out.println("i "+i +"  left idx " + left_NSR[i] + " right indx:" + left_NSR[i]+" values"+arr[i]);
			output_area[i] = ((left_NSR[i] - left_NSL[i]) - 1) * arr[i];
		}

		return output_area;
	}

	private static int[] Seven_Max_Area_Histo_cal_left(int[] arr) {

		int left_idx[] = new int[arr.length];
		Stack<data2> st = new Stack<data2>();
		int dummy_index = -1;
		int k = 0;

		for (int i = 0; i < arr.length; i++) {
			if (st.isEmpty()) {
				left_idx[k] = dummy_index;
				k++;
			} else if (!st.isEmpty() && st.peek().value < arr[i]) {
				left_idx[k] = st.peek().idx;
				k++;
			} else if (!st.isEmpty() && st.peek().value > arr[i]) {
				while (!st.isEmpty() && st.peek().value > arr[i]) {
					st.pop();
				}
				if (st.isEmpty()) {
					left_idx[k] = dummy_index;
					k++;

				} else {
					left_idx[k] = st.peek().idx;
					k++;
				}
			}

			data2 dt = new data2(arr[i], i);
			st.push(dt);
		}

		return left_idx;

	}

	private static int[] Seven_Max_Area_Histo_cal_right(int[] arr) {

		int right_idx[] = new int[arr.length];
		Stack<data2> st = new Stack<data2>();
		int dummy_index = arr.length;
		int k = arr.length - 1;

		for (int i = arr.length - 1; i >= 0; i--) {
			if (st.isEmpty()) {
				right_idx[k] = dummy_index;
				k--;
			} else if (!st.isEmpty() && st.peek().getValue() < arr[i]) {
				right_idx[k] = st.peek().getIdx();
				k--;
			} else if (!st.isEmpty() && st.peek().getValue() >= arr[i]) {
				while ((!st.isEmpty() && st.peek().getValue() >= arr[i])) {
					st.pop();
				}
				if (st.isEmpty()) {
					right_idx[k] = dummy_index;
					k--;
				} else {
					right_idx[k] = st.peek().getIdx();
					k--;
				}
			}

			data2 dt = new data2(arr[i], i);
			st.push(dt);
		}

		return right_idx;
	}

}
