package LeetCode2;


public class Teemo_Attacking {

	public static void main(String arg[]) {
		int arr[] = { 1, 3, 5, 7, 9, 11, 13, 15 };
		System.out.println(findPoisonedDuration(arr, 3));
	}

	public static int findPoisonedDuration(int[] timeSeries, int duration) {
		int count = 0;
		for (int i = 0; i < timeSeries.length - 1; i++) {
			count =count+ Math.min(duration, timeSeries[i + 1] - timeSeries[i]);
		}
		return count + duration;
	}
}
