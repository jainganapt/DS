package LeetCode;

public class TwoSumSortedRotate {

	public static void main(String arg[]) {
		int arr[] = { 1, 3, 4, 5, 6, 7, 9 };
		int total = 9;
		findpair(arr, total);
	}

	private static void findpair(int[] arr, int sum) {

		int left = 0;
		int right = arr.length - 1;

		while (left < right) {
			System.out.println(":->" + left + " " + right);

			if (sum == (arr[left] + arr[right])) {
				System.out.println(":" + arr[left] + " " + arr[right]);
				break;
			}

			if (sum > (arr[left] + arr[right])) {
				left++;
			}
			if (sum < (arr[left] + arr[right])) {
				right--;
			}

		}

	}

}
