package LeetCode2;

public class Container_With_Most_Water {

	public static void main(String arg[]) {
		int height[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };

		System.out.println(maxArea(height));

	}

	public static int maxArea(int[] height) {

		int max_area = 0;
		int area = 0;

		if (height.length <= 1)
			return max_area;

		int left = 0;
		int right = height.length - 1;

		while (left < right) {

			area = Math.min(height[left], height[right]) * (right - left);

			if (area > max_area) {
				max_area = area;
			}

			if (height[left] < height[right]) {
				left++;
			} else {
				right--;
			}

		}

		return max_area;

	}

}
