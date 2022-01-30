package JavaArray30;

public class MissingNumber {

	public static void main(String arg[]) {
		int arr[] = { 1, 2, 3, 5, 6, 7, 8, 9, 10 };

		int num = missingNumber(arr, 10);

		System.out.println(num);
	}

	private static int missingNumber(int[] arr, int count) {

		int sum = (count * (count + 1)) / 2;

		int arrsum = 0;

		for (int i = 0; i < arr.length; i++) {
			arrsum = arrsum + arr[i];
		}

		return sum - arrsum;

	}

}
