package LeetCode2;


public class Two_Sum_II_Input_Array_Is_Sorted {

	public static void main(String arg[]) {
		int numbers[] = { 2, 7, 11, 15 };
		int target = 9;

		twoSum(numbers, target);
	}

	public static int[] twoSum(int[] numbers, int target) {

		int num[] = new int[2];

		int left = 0;
		int right = numbers.length - 1;

		while (left <= right) {
			
			System.out.println("left " + left + " " + right);
			if (target == (numbers[left] + numbers[right])) {
				num[0] = left + 1;
				num[1] = right + 1;
				return num;
				
			} else if (target < (numbers[left] + numbers[right])) {
				right--;
			} else {
				left++;
			}
		}

		//System.out.println("num" + num[0] + " " + num[1]);

		return num;

	}
}