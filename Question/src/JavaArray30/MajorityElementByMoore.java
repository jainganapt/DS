package JavaArray30;

public class MajorityElementByMoore {

	public static void main(String arg[]) {
		int arr[] = { 2, 3, 3, 3, 4, 3, 2, 2, 3, 3 };

		int num = findcandidate(arr);

		// System.out.println("num" + num);

		int val = majorityEle(num, arr);

		System.out.println("val" + val);
	}

	private static int majorityEle(int num, int[] arr) {

		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				count++;
			}
		}

		// System.out.println("count"+count);
		// System.out.println("arr.length"+arr.length);

		if ((arr.length / 2) < count) {
			return num;
		}

		return -1;

	}

	private static int findcandidate(int[] arr) {

		int ele = arr[0];
		int count = 1;

		for (int i = 1; i < arr.length; i++) {
			if (ele == arr[i]) {
				count++;
			} else {
				count--;
			}

			if (count == 0) {
				ele = arr[i];
				count++;
			}
		}

		return ele;

	}

}
