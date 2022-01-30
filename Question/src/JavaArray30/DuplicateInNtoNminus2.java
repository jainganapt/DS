package JavaArray30;

public class DuplicateInNtoNminus2 {

	public static void main(String arg[]) {
		int arr[] = { 2, 7, 1, 4, 1, 7, 8, 2, 8 };
		findduplicatewithsign2(arr);
	}

	public static void findduplicatewithsign2(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			
			int index = Math.abs(arr[i]);

			if (arr[index] < 0) {
				System.out.println("=>" + index);
			} else {
				arr[index] = -arr[index];
			}

		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(":" + arr[i]);

		}
	}
}
