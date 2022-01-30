package LeetCode2;


public class Merge_Sorted_Array {

	public static void main(String arg[]) {
		int nums1[] = { 1, 2, 3, 0, 0, 0 };
		int m = 3;
		int nums2[] = { 2, 5, 6 };
		int n = 3;
		merge(nums1,m,nums2,n);

	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {

		int p1 = m - 1;
		int p2 = n - 1;
		int i = m + n - 1;

		while (p2 >= 0) {
			
			System.out.println("p1 "+p1+"p2 "+p2+"i "+i);
			
			if (p1 >= 0 && nums1[p1] > nums2[p2]) {
				nums1[i--] = nums1[p1--];

			} else {
				nums1[i--] = nums2[p2--];
			}
		}

		System.out.println();

		for (int a : nums1) {
			System.out.print(a + " ");
		}

	}
}
