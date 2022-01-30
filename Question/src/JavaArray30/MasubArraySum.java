package JavaArray30;

public class MasubArraySum {

	public static void main(String arg[]) {
		int arr[] = { 1, 5, 6, 8, -9, 10 };

		System.out.println(printMaxArr(arr));
	}

	private static int printMaxArr(int[] arr) {

		if (arr.length == 0)
			return 0;

		int global_sum = arr[0];

		int curr_sum = arr[0];

		for (int i = 1; i < arr.length; i++) {

			if (curr_sum > (curr_sum + arr[i])) {
				curr_sum = 0;
			} else {
				curr_sum = curr_sum + arr[i];

			}

			System.out.println("curr_sum:" + curr_sum);
			System.out.println("global_sum:" + global_sum);

			if (curr_sum > global_sum) {
				global_sum = curr_sum;
			}
		}
		return global_sum;

	}

}
