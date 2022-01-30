package JavaArray30;

public class AlterPosNeg {

	public static void main(String arg[]) {
		// left negative
		// right positive
		int arr[] = { 1, 2, 3, 4, -5, -4, -1, 1, 5, 6 };
		printalpos(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void printalpos(int[] arr) {

		int left = 0;
		int right = arr.length - 1;

		while (left < right) {
			if (arr[left] < 0) {
				left++;
			} else if (arr[right] > 0) {
				right--;
			} else {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				;
				right--;
			}

		}

	}
}
